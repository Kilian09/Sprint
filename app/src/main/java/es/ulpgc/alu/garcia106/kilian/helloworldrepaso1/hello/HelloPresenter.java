package es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello;

import android.util.Log;

import java.lang.ref.WeakReference;

public class HelloPresenter implements HelloContract.Presenter {

    public static String TAG = HelloPresenter.class.getSimpleName();

    private WeakReference<HelloContract.View> view;
    private HelloViewModel viewModel;
    private HelloContract.Model model;
    private HelloContract.Router router;

    public HelloPresenter(HelloState state) {
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<HelloContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(HelloContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(HelloContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchHelloData() {
        // Log.e(TAG, "fetchHelloData()");

        // set passed state
        HelloState state = router.getDataFromPreviousScreen();
        if (state != null) {
            //set passed state
            viewModel.numeroMessage = state.numeroMessage;
        }

        view.get().displayHelloData(viewModel);

    }


}
