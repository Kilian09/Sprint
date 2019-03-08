package es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.app.AppMediator;

public class HelloScreen {

    public static void configure(HelloContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        String message = "Hello World!";

        AppMediator mediator = (AppMediator) context.get().getApplication();
        HelloState state = mediator.getHelloState();

        HelloContract.Router router = new HelloRouter(mediator);// Le pasas el mediador que es el que guarda el estado de cada activity.
        HelloContract.Presenter presenter = new HelloPresenter(state); // Le pasas el estado al presentador
        HelloContract.Model model = new HelloModel(message);
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
