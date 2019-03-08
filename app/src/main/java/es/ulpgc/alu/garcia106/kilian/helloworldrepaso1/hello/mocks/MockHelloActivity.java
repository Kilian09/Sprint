package es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello.mocks;


import es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello.HelloContract;
import es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello.HelloViewModel;

public class MockHelloActivity implements HelloContract.View {

    public interface ProgressVisibilityChangedCallback {
        void onProgressVisibilityChanged(boolean visibility);
    }

    private String helloMessage = "Hello World!";
    public int numeroMessage = 0;

    private HelloViewModel viewModel;
    private ProgressVisibilityChangedCallback callback;

    public boolean getProgressVisibility() {





    public void setProgressVisibilityChangedCallback(
            ProgressVisibilityChangedCallback callback) {

        this.callback = callback;
    }

    @Override
    public void injectPresenter(HelloContract.Presenter presenter) {

    }

    @Override
    public void displayHelloData(HelloViewModel viewModel) {
        this.viewModel = viewModel;

        if(viewModel.progressBarVisibility != progressVisibility){
            progressVisibility = viewModel.progressBarVisibility;

            if(callback != null){
                callback.onProgressVisibilityChanged(viewModel.progressBarVisibility);
                callback = null; // clear current callback
            }
        }


    }
}

