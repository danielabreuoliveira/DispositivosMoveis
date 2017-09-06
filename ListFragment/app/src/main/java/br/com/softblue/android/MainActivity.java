package br.com.softblue.android;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends Activity implements AlimentosFragment.OnItemClick {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private TextFragment textFrag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);

        textFrag = (TextFragment) getFragmentManager().findFragmentById(R.id.frag_text);
	}

    @Override
    public void onClick(Alimento alimento) {
        textFrag.setText(String.format("O preço do %s é %s", alimento.getNome(), nf.format(alimento.getPreco())));
    }
}
