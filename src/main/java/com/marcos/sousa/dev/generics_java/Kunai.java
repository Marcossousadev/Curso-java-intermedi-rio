package com.marcos.sousa.dev.generics_java;

public class Kunai {
    private String nome;

    public Kunai(String nome){
        this.nome = nome;
    }

    public String get_nome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
