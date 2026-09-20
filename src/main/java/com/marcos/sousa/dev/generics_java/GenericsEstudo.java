package com.marcos.sousa.dev.generics_java;

import java.util.LinkedList;
import java.util.Queue;

public class GenericsEstudo {
    public static void main(String[] args) {
        // o que é Generics?
        // Generics é um recuso do java para criação de classes,
        // interfaces e métodos de forma parametrizada
        // de uma forma que nossas classes, interfaces e métodos
        // se tornem cada vez mais reutilizáveis
        // o Generics se une ao conceito do java
        // ser fortemente tipado

        // exemplo de Generics, parametrização
        // aqui passamos uma parâmetro do tipo dessa fila
        // e essa fila é do tipo String
        // mas poderia passar do tipo Integer
        // ou do tipo Boolean
        // ou seja, a nossa fila continua tendo os mesmos
        // comportamentos (métodos), mas o tipo dessa fila pode mudar
        // aqui o tipo dessa fila, vai ser recebido por parâmetro
        Queue<String> fila_Strings = new LinkedList<>();

        // exemplo de uma classe que criamos com Generics, onde implementamos
        // parametrização

        // essa minha caixa pode armazenar tanto uma String
        Caixa<String> minha_caixa = new Caixa<>();

        minha_caixa.set_valor_caixa("Olá, mundo.");

        System.out.println("Valor caixa String: " + minha_caixa.get_valor_caixa());

        // como um número
        Caixa<Integer> minha_caixa_numero = new Caixa<>();

        minha_caixa_numero.set_valor_caixa(10);

       System.out.println("Valor caixa inteiros: " + minha_caixa_numero.get_valor_caixa());

       // segundo exemplo de criando uma classe com parametrização
        Sacola<String> minhaSacola = new Sacola<>();

        minhaSacola.setTipoCoisa("Boneca");

        System.out.println("Valor armazenado sacola 1: " + minhaSacola.get_tipoCoisa());

        // criando outra instância da classe Sacola, só que agora armazenando um valor inteiro
        Sacola<Integer> minhaSacola2 = new Sacola<>();

        // manipulando objeto
        // minhaSacola2.setTipoCoisa("oi"); // não posso passar String, pois na parametrização
        // eu declarei q o objeto armazenaria um inteiro

        // aceita, pois segue a tipagem que eu defini, conceito de Generics
        minhaSacola2.setTipoCoisa(10);

        System.out.println("Valor da minha sacola2: " +  minhaSacola2.get_tipoCoisa());

        // usando generics, para um metodo generico
        MetodoGenerico.imprimir(10);
        MetodoGenerico.imprimir("olá, mundo.");

        // exemplo de utilização de dois parâmetros
        Par<String, Integer> meuPar = new Par("Marcos", 19);

        String primeiro = meuPar.get_primeiro();
        Integer segundo = meuPar.get_segundo();

        System.out.println(primeiro);
        System.out.println(segundo);

        // método generic
        Util.imprimir(10, 20);
        Util.imprimir("Marcos", 20);
    }
}
