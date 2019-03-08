package es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello;

import java.lang.ref.WeakReference;

public interface HelloContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayHelloData(HelloViewModel viewModel);


    }

    interface Presenter {
        void injectView(WeakReference<View> view);
        void injectModel(Model model);
        void injectRouter(Router router);

        void fetchHelloData();
    }

    interface Model {
        int fetchData();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(HelloState state);

        HelloState getDataFromPreviousScreen();
    }
}
