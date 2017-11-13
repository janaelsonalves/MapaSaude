package com.example.uc14101043.mapasaude;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetWorkUtils {

    public static String getInformacoes(String url){

        InputStream inputStream;
        String resultado = "";
        try {
            URL endpoint = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection)endpoint.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);

            inputStream = httpURLConnection.getInputStream();

            resultado = parseToString(inputStream);

            Log.i("resultado i", resultado);
            Log.d("resultado d", resultado);
            Log.v("resultado v", resultado);

        }catch (Exception e){
            Log.v("exception", e.getMessage());
        }
        return resultado;
    }

    public static String parseToString(InputStream inputStream){
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        try {
            String linha = null;
            while ((linha = bufferedReader.readLine()) != null){
                stringBuilder.append(linha);
            }
            Log.i("resultado", stringBuilder.toString());
            Log.d("resultado", stringBuilder.toString());
            Log.v("resultado", stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
            Log.v("exception parseToString", e.getMessage());
        }
        return stringBuilder.toString();
    }

}