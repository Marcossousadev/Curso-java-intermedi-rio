package com.marcos.sousa.dev.modificadoresacesso;

public class Gol {
    Carro carro;
    public Gol(Carro carro) {
        this.carro = carro;
        carro.teste(); // consigo acessar, pq minha classe tá dentro do mesmo package, package private
       //  String placa = carro.placa; // não consigo acessar, mesmo estando dentro do mesmo package, pq
        // o atributo placa é algo privado da classe Carro, acessível apenas por ela

       // carro.get_placa(); // método privado, acessível apenas pela própria classe!
        carro.acelerar(); // método protected, acessível da mesma package e na classe
    }
}
