package com.example.uc14101043.mapasaude;

import java.io.Serializable;

/**
 * Created by Janaelson on 13/11/2017.
 */
public class Unidade implements Serializable{

    private String cnpj; //cnpj
    private String nomeFantasia;        //"nomeFantasia":"SARAH BRASILIA",,
    private String esferaAdministrativa;//      "esferaAdministrativa":"Privada",
    private String vinculoSus;//        "vinculoSus":"Sim",
    private String fluxoClientela;//        "fluxoClientela":"Atendimento de demanda espontânea",
    private String temAtendimentoUrgencia;//       "temAtendimentoUrgencia":"Não",
    private String temAtendimentoAmbulatorial;//       "temAtendimentoAmbulatorial":"Sim",
    private String temCentroCirurgico;//       "temCentroCirurgico":"Sim",
    private String temObstetra;//       "temObstetra":"Não",
    private String temNeoNatal;//   "temNeoNatal":"Não",
    private String temDialise;//  "temDialise":"Não",
    private String tipoUnidadeCnes;//"tipoUnidadeCnes":"HOSPITAL ESPECIALIZADO",
    private String categoriaUnidade;//       "categoriaUnidade":"HOSPITAL",
    private String logradouro;//     "logradouro":"SMHS",
    private String numero;//      "numero":"301",
    private String bairro;//      "bairro":"BRASILIA",
    private String cidade;//      "cidade":"BRASILIA",
    private String uf;//     "uf":"DF",
    private String cep;//      "cep":"70335901",
    private String telefone;//      "telefone":"(61)33191111",
    private String turnoAtendimento;//      "turnoAtendimento":"Atendimentos nos turnos da manhã, tarde e noite."

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    public void setEsferaAdministrativa(String esferaAdministrativa) {
        this.esferaAdministrativa = esferaAdministrativa;
    }

    public String getVinculoSus() {
        return vinculoSus;
    }

    public void setVinculoSus(String vinculoSus) {
        this.vinculoSus = vinculoSus;
    }

    public String getFluxoClientela() {
        return fluxoClientela;
    }

    public void setFluxoClientela(String fluxoClientela) {
        this.fluxoClientela = fluxoClientela;
    }

    public String getTemAtendimentoUrgencia() {
        return temAtendimentoUrgencia;
    }

    public void setTemAtendimentoUrgencia(String temAtendimentoUrgencia) {
        this.temAtendimentoUrgencia = temAtendimentoUrgencia;
    }

    public String getTemAtendimentoAmbulatorial() {
        return temAtendimentoAmbulatorial;
    }

    public void setTemAtendimentoAmbulatorial(String temAtendimentoAmbulatorial) {
        this.temAtendimentoAmbulatorial = temAtendimentoAmbulatorial;
    }

    public String getTemCentroCirurgico() {
        return temCentroCirurgico;
    }

    public void setTemCentroCirurgico(String temCentroCirurgico) {
        this.temCentroCirurgico = temCentroCirurgico;
    }

    public String getTemObstetra() {
        return temObstetra;
    }

    public void setTemObstetra(String temObstetra) {
        this.temObstetra = temObstetra;
    }

    public String getTemNeoNatal() {
        return temNeoNatal;
    }

    public void setTemNeoNatal(String temNeoNatal) {
        this.temNeoNatal = temNeoNatal;
    }

    public String getTemDialise() {
        return temDialise;
    }

    public void setTemDialise(String temDialise) {
        this.temDialise = temDialise;
    }

    public String getTipoUnidadeCnes() {
        return tipoUnidadeCnes;
    }

    public void setTipoUnidadeCnes(String tipoUnidadeCnes) {
        this.tipoUnidadeCnes = tipoUnidadeCnes;
    }

    public String getCategoriaUnidade() {
        return categoriaUnidade;
    }

    public void setCategoriaUnidade(String categoriaUnidade) {
        this.categoriaUnidade = categoriaUnidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTurnoAtendimento() {
        return turnoAtendimento;
    }

    public void setTurnoAtendimento(String turnoAtendimento) {
        this.turnoAtendimento = turnoAtendimento;
    }

    @Override
    public String toString() {
        return nomeFantasia;
    }
}
