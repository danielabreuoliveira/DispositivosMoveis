package br.com.softblue.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_segunda);

        String msg = getIntent().getStringExtra("msg");

        TextView textView = (TextView) findViewById(R.id.txtMsg);
        textView.setText(msg);
    }

    public void previous(View view) {

        String status = "Activity visualizada";

        Intent intent = new Intent();
        intent.putExtra("status", status);

        setResult(RESULT_OK, intent);
        finish();
    }
}
