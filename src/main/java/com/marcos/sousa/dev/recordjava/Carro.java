package com.marcos.sousa.dev.recordjava;

// tipo de classe imutável
// dps de criada um objeto com ela, eu não posso alterar seus dados
// o tipo record gerá automaticamente os métodos: equals, hashCode,
// toString e getters do atríbutos dessa nossa classe
// que é um record
// ou seja não precisamos declarar código boiler plate
// ficar declarando código desses getters
// não temos setters pq ele é imutável

// assinatura diferente da classe normal, pq na classe normal não precisamos abrir parênteses antes das chaves
// defino atríbutos dentro dos parênteses
public record Carro(String modelo, String cor, int ano, String place) {

}
