package com.marcos.sousa.dev.generics_java;

public class Pergaminho {
    private String conteudo;

    public Pergaminho(String conteudo){
        this.conteudo = conteudo;
    }

    public String get_conteudo() {
        return this.conteudo;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + conteudo;
    }
}
