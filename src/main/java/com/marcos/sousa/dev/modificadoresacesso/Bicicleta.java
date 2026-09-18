package com.marcos.sousa.dev.modificadoresacesso;

public class Bicicleta {
    // quando não declaro o modificador, ele é private package, acessível apenas dentro das classes do mesmo package
    String modelo;
    // quando eu declaro como public, consigo acessar de qualquer package, qualquer classe
    public String cor;

    public void teste() {
        System.out.println("teste");
    }
    public Bicicleta(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public void andar(){
        System.out.println("andando");
    }
    public void para() {
        System.out.println("parando");
    }
}