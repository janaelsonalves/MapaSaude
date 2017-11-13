package com.example.uc14101043.mapasaude;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import org.json.JSONException;

import java.io.Serializable;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {

    Spinner spinnerUF;
    Spinner spinnerEspecialidade;
    Spinner spinnerCategoria;
    EditText edtNumResultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerUF = (Spinner) findViewById(R.id.uf_spinner);
        spinnerEspecialidade = (Spinner) findViewById(R.id.especialidade_spinner);
        spinnerCategoria = (Spinner) findViewById(R.id.categoria_spinner);
        edtNumResultados = (EditText) findViewById(R.id.resultados_number_text);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Recursos.getUfs());
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUF.setAdapter(arrayAdapter);

        arrayAdapter = ArrayAdapter.createFromResource(this, R.array.especialidades, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEspecialidade.setAdapter(arrayAdapter);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Recursos.getCategorias());
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategoria.setAdapter(arrayAdapter);

        Button button = (Button) findViewById(R.id.btnBuscar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String categoria = spinnerCategoria.getSelectedItem().toString();
        String especialidade = spinnerEspecialidade.getSelectedItem().toString();
        String uf = spinnerUF.getSelectedItem().toString();

        String resText = edtNumResultados.getText().toString();

        if (resText == null || resText.isEmpty()) {
            edtNumResultados.setError(getString(R.string.errorNumResult));
        } else {
            final String[] url = {"http://mobile-aceite.tcu.gov.br/mapa-da-saude/rest/estabelecimentos?"
                    + "uf=" + uf
                    + "&categoria=" + categoria
                    + "&especialidade=" + especialidade
                    + "&quantidade=" + resText};
            Saude s = new Saude();
            s.execute(url);
        }
    }

    public class Saude extends AsyncTask<String, Void, String> {

        ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(MainActivity.this, "Aguarde", "Buscando dados");
        }

        @Override
        protected String doInBackground(String... params) {
            Log.i("resultado i", params[0]);
            Log.d("resultado d", params[0]);
            Log.v("resultado v", params[0]);
            return NetWorkUtils.getInformacoes(params[0]);
        }

        @Override
        protected void onPostExecute(String resultado) {
            progressDialog.dismiss();
            try {
                List<Unidade> unidades = JsonUtils.getUnidades(resultado);
                Log.i("resultado post i", unidades.toString());
                Log.d("resultado post d", unidades.toString());
                Intent intent = new Intent(MainActivity.this, ListaDeUnidadesActivity.class);
                intent.putExtra("listaDeUnidades", (Serializable) unidades);
                startActivity(intent);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
