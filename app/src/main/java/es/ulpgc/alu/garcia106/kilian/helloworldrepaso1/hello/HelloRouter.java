package es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello;

import android.content.Intent;
import android.content.Context;

import es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.app.AppMediator;

public class HelloRouter implements HelloContract.Router {

    public static String TAG = HelloRouter.class.getSimpleName();

    private AppMediator mediator;

    public HelloRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, HelloActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(HelloState state) {
        mediator.setHelloState(state);
    }

    @Override
    public HelloState getDataFromPreviousScreen() {
        HelloState state = mediator.getHelloState();
        return state;
    }
}
