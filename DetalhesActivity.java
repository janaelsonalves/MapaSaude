package com.example.uc14101043.mapasaude;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        textView = (TextView)findViewById(R.id.textView);

        String resultado = getIntent().getStringExtra("resultado");

        textView.setText(resultado);
    }
}
