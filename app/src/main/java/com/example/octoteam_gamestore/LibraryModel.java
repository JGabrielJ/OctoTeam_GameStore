package com.example.octoteam_gamestore;

public class LibraryModel {
    String nomesJogos;
    String dataJogos;
    int imagem;

    public LibraryModel(String nomesJogos, String dataJogos, int imagem) {
        this.nomesJogos = nomesJogos;
        this.dataJogos = dataJogos;
        this.imagem = imagem;
    }

    public String getNomesJogos() {
        return nomesJogos;
    }

    public String getDataJogos() {
        return dataJogos;
    }

    public int getImagem() {
        return imagem;
    }
}
