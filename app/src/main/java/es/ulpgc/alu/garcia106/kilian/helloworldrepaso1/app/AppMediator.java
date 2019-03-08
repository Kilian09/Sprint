package es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.app;

import android.app.Application;
import android.content.Context;

import es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello.HelloState;

public class AppMediator extends Application {

    private HelloState helloState;


    @Override
    public void onCreate() {
        super.onCreate();

        helloState = new HelloState();

    }

    public HelloState getHelloState() {
        return helloState;
    }

    public void setHelloState(HelloState helloState) {
        this.helloState = helloState;
    }

}
