package br.com.softblue.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private static final String TAG = "MyLogApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Mensagem INFO");
        Log.d(TAG, "Mensagem DEBUG");
        Log.e(TAG, "Mensagem ERRO");
        Log.w(TAG, "Mensagem WARNING");
        Log.v(TAG, "Mensagem VERBOSE");
    }
}
