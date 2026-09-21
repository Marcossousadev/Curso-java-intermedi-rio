package com.marcos.sousa.dev.generics_java;

import java.util.ArrayList;

public class Ninja {
    public static void main(String[] args) {

        // poderia armazenar na minha lista apenas kunais
        BolsaNinja<Kunai> minha_bolsa_kunais = new BolsaNinja<>();

        // criando uma lista onde eu posso adicionar diferentes tipos de objetos
        BolsaNinja<Object> bolsa = new BolsaNinja<>();
        bolsa.adicionar_ferramenta(new Kunai("Kunai Explosiva"));
        bolsa.adicionar_ferramenta(new Shuriken(30));
        bolsa.adicionar_ferramenta(new Pergaminho("Invocação do Sapo"));
        bolsa.adicionar_ferramenta(new Pergaminho("Invocação do Gato"));
        bolsa.adicionar_ferramenta(new CompanheiroNinja("Mamaru"));
        System.out.println("Itens da bolsa Ninja: ");
        bolsa.mostrarFerramentas();

    }
}
