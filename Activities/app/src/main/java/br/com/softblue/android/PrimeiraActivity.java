package br.com.softblue.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PrimeiraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_primeira);
    }

    public void next(View view) {
        Intent intent = new Intent(this, SegundaActivity.class);

        String msg = "Mensagem vinda da PrimeiraActivity";

        intent.putExtra("msg", msg);

        //Bundle bundle = intent.getExtras();
        //bundle.putString("msg", msg);

        //startActivity(intent);

        startActivityForResult(intent, 100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 100 && resultCode == RESULT_OK) {

            String status = data.getStringExtra("status");
            Toast.makeText(this, status, Toast.LENGTH_LONG).show();

            Button button = (Button) findViewById(R.id.btn);
            button.setEnabled(false);
        }
    }
}
