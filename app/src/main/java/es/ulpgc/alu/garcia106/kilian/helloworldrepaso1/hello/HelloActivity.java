package es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.R;

public class HelloActivity
        extends AppCompatActivity implements HelloContract.View {

    public static String TAG = HelloActivity.class.getSimpleName();

    private static int MSG_FRAGMENT_TAG = 0;
     HelloContract.Presenter presenter;

     Button increaseButton;
     TextView numeroMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        getSupportActionBar().setTitle("Hello Screen");

        increaseButton = findViewById(R.id.sayHelloButton);
        numeroMessage = findViewById(R.id.helloMessage);



        // do the setup
        HelloScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchHelloData();
    }



    @Override
    public void injectPresenter(HelloContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayHelloData(HelloViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        numeroMessage.setText(viewModel.numeroMessage);
    }
}
