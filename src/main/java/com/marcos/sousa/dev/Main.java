package com.marcos.sousa.dev;

import com.marcos.sousa.dev.modificadoresacesso.Bicicleta;
import com.marcos.sousa.dev.modificadoresacesso.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Bmw", "Azul", 2027, "4dmi2020");
        // carro.teste(); // não consigo acessar o método package pq não to no mesmo package
        carro.ligar(); // método acessível, pois é public, acessível mesmo em classes fora do package
        carro.desligar(); // método public também
       // carro.acelerar(); // método protected, acessível apenas no mesma classe, arquivo e package
       // String modelo = carro.modelo; // não é acessível, pois ele é package private
        String cor = carro.cor; // consigo acessar esse atributo, pq ele é public
        System.out.println(cor);
        Bicicleta bicicleta =  new Bicicleta("cairo", "vermelha");

       // String modelo = bicicleta.modelo; // não consigo acessar o atributo modelo, pois ele é default, package private
        // String cor = bicicleta.cor; // a cor eu consigo acessar, pois ela á um atributo publico
        // método acessível de qualquer package ou classe, pois é um método public
        bicicleta.teste();
    }
}
