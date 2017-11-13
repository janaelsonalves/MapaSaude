package com.example.uc14101043.mapasaude;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListaDeUnidadesActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private Intent intent;
    List<Unidade> unidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_unidades);

        listView = (ListView)findViewById(R.id.listView);

        this.unidades = (List<Unidade>) getIntent().getSerializableExtra("listaDeUnidades");

        String []lista = {"Melao", "Melancia", "Abacaxi", "Uva"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, unidades);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Clicou em " + position + " - " + unidades.get(position).getBairro(), Toast.LENGTH_SHORT).show();
    }
}
