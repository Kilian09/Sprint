package es.ulpgc.alu.garcia106.kilian.helloworldrepaso1.hello;

public class HelloModel implements HelloContract.Model {

    public static String TAG = HelloModel.class.getSimpleName();

    private String message;

    public HelloModel(String message) { this.message = message; }

    @Override
    public int fetchData() {
        // Log.e(TAG, "fetchData()");
        for (int k =0; k<10;k++){
            return k;
        }
        return 0;
    }
}
