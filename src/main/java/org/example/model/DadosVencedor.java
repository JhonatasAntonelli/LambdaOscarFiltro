package org.example.model;

public class DadosVencedor {

    private int index;
    private int anoOscar;
    private int idadeAtor;
    private String nomeAtor;
    private String nomeFilme;

    private char sexo;

    private int premio;

    public DadosVencedor(int index, int anoOscar, int idadeAtor, String nomeAtor, String nomeFilme, char sexo, int premio) {
        this.index = index;
        this.anoOscar = anoOscar;
        this.idadeAtor = idadeAtor;
        this.nomeAtor = nomeAtor;
        this.nomeFilme = nomeFilme;
        this.sexo = sexo;
        this.premio = premio;
    }

    public int getIndex() {
        return index;
    }

    public int getAnoOscar() {
        return anoOscar;
    }

    public int getIdadeAtor() {
        return idadeAtor;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public char getSexo() {
        return sexo;
    }

    public int getPremio() {
        return premio;
    }
}
