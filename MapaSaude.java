package com.example.uc14101043.mapasaude;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Janaelson on 13/11/2017.
 */

public class MapaSaude implements Serializable {

    public List<Unidade> unidades;

    public MapaSaude() {
    }

    public MapaSaude(List<Unidade> unidades) {
        this.unidades = unidades;
    }

    public List<Unidade> getUnidades() {
        return unidades;
    }
}
