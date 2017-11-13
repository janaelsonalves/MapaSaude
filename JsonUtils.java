package com.example.uc14101043.mapasaude;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Janaelson on 13/11/2017.
 */

public class JsonUtils {

    public static List<Unidade> getUnidades(String json) throws JSONException {
        JSONArray mJsonArray = new JSONArray(json);
        JSONObject mJsonObject = new JSONObject();
        List<Unidade> unidades = new ArrayList<>();
        for (int i = 0; i < mJsonArray.length(); i++) {
            mJsonObject = mJsonArray.getJSONObject(i);
            unidades.add(getUnidade(mJsonObject));
        }
        return unidades;
    }

    public static Unidade getUnidade(JSONObject mJsonObject) throws JSONException {
        Unidade unidade = new Unidade();
        unidade.setNomeFantasia(mJsonObject.getString("nomeFantasia"));
        unidade.setTipoUnidadeCnes(mJsonObject.getString("tipoUnidadeCnes"));
        unidade.setCategoriaUnidade(mJsonObject.getString("categoriaUnidade"));
        unidade.setLogradouro(mJsonObject.getString("logradouro"));
        unidade.setNumero(mJsonObject.getString("numero"));
        unidade.setBairro(mJsonObject.getString("bairro"));
        unidade.setCidade(mJsonObject.getString("cidade"));
        unidade.setUf(mJsonObject.getString("uf"));
        unidade.setCep(mJsonObject.getString("cep"));
        unidade.setTelefone(mJsonObject.getString("telefone"));
        unidade.setTurnoAtendimento(mJsonObject.getString("turnoAtendimento"));
        return unidade;
    }
}
