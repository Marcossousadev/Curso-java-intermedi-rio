package com.marcos.sousa.dev.generics_java;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
   // inicializar nosso Array
    List<T> ferramentas;
    // esse tipo genérico pode ser tanto uma kunai, pergaminho ou uma Shuriken
    // colocar ferramentas no nosso Array

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }
    public void adicionar_ferramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    public void mostrarFerramentas() {
        for(T ferramenta: ferramentas){
            System.out.println(ferramenta);
        }
    }
}
