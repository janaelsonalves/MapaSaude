package com.example.uc14101043.mapasaude;

import java.util.Arrays;
import java.util.List;

/**
 * Created by UC14101043 on 07/11/2017.
 */

public class Recursos {

    public static List<String> getCategorias() {
        return Arrays.asList(
                "HOSPITAL",
                "POSTO DE SAÚDE",
                "URGÊNCIA",
                "SAMU",
                "FARMÁCIA",
                "CLÍNICA",
                "CONSULTÓRIO",
                "LABORATÓRIO",
                "APOIO À SAÚDE",
                "ATENÇÃO ESPECÍFICA",
                "UNIDADE ADMINISTRATIVA",
                "ATENDIMENTO DOMICILIAR");
    }

    public static List<String> getUfs() {
        return Arrays.asList(
                "AC",
                "AL",
                "AM",
                "AP",
                "BA",
                "CE",
                "DF",
                "ES",
                "GO",
                "MA",
                "MG",
                "MS",
                "MT",
                "PA",
                "PB",
                "PE",
                "PI",
                "PR",
                "RJ",
                "RN",
                "RO",
                "RR",
                "RS",
                "SC",
                "SE",
                "SP",
                "TO"
        );
    }
}
