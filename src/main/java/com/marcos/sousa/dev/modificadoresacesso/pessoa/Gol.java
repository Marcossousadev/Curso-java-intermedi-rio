package com.marcos.sousa.dev.modificadoresacesso.pessoa;


import com.marcos.sousa.dev.modificadoresacesso.Carro;

public class Gol extends Carro {

    public Gol(String modelo, String cor, int ano, String placa) {
        super(modelo, cor, ano, placa);
        this.modelo = modelo; // quando eu declaro como protected, para uma classe filha, mesmo que fora do package
        // eu posso acessar esse atributo
    }
}
