package com.marcos.sousa.dev.generics_java;

public class Moto implements Pintavel {
    String modelo;
    int ano;

    public String get_modelo() {
        return this.modelo;
    }

    public void set_modelo(String modelo) {
        this.modelo = modelo;
    }

    public int get_ano() {
        return  this.ano;
    }

    public void set_ano(int ano) {
        this.ano = ano;
    }

    @Override
    public void aplicarTinta() {

    }
}
