package com.marcos.sousa.dev.estudoStreamApi;

// o que é stream api no java ?
// é um recurso de novas versões do java
// que nos auxilia a utilizar operações funcionais em nossas coleções de dados
// exemplo de operações
// filter => filtrando dados, exemplo filtrar certo valor de uma lista
// map => transformar um tipo de dado em outro tipo, exemplo, maiúscula em minúsculas
// reduce => transformar um conjunto de dados em um um único dado

import java.util.ArrayList;
import java.util.List;

public class NewStream {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        alunos.add("Marcos Paulo");
        alunos.add("Marcos Carlos");
        alunos.add("Alan Jhones");
        alunos.add("Douglas Sousa");

        // exemplo de utilização de filter
        // quero filtrar apenas meus alunos que começam o nome como Marcos
        // como é uma lista, que eu tinha transformado em stream, eu uso o toList para transformar novamente em lista
        List<String> apenas_marcos = alunos.stream().filter(name -> name.startsWith("Marcos")).toList();
        System.out.println("Exemplo de filter lista: " + apenas_marcos);

        // exemplo de utilização do map usando essa minha lista de apenas marcos
        List<String> marcos_uppercase = apenas_marcos.stream().map(name -> name.toUpperCase()).toList();
        List<String> marcos_uppercase_reference = apenas_marcos.stream().map(String::toUpperCase).toList();
        // existe duas formas de fazer o map, uma reference e outra não
        System.out.println("Exemplo de map: " + marcos_uppercase);
        System.out.println("Exemplo de map com reference: " + marcos_uppercase_reference);

        // exemplo de utilização do reduce, para reduzir um conjunto de dados em apenas um dado
        // exemplo transformando uma lista de nomes em apenas uma String desses nomes
        String string_names = alunos.stream().reduce("Marcos", ( a, b ) -> a + " " + b);
        System.out.println("Exemplo de reduce: " + string_names);

        // lista de inteiros
        List<Integer> notas_alunos = new ArrayList<>();
        notas_alunos.add(10);
        notas_alunos.add(10);
        notas_alunos.add(5);
        notas_alunos.add(6);
        notas_alunos.add(8);
        notas_alunos.add(7);
        notas_alunos.add(4);

        // filtrando apenas notas dez para saber quantos alunos tiraram essa nota
        List<Integer> notas_dez = notas_alunos.stream().filter(nota -> nota.equals(10)).toList();
        System.out.println(notas_dez);
        int lenght_notas_10 = notas_dez.size();
        System.out.println("Quantidade de notas 10: " + lenght_notas_10);

        // filtrando apenas notas 8
        List<Integer> notas_oito = notas_alunos.stream().filter(nota -> nota.equals(8)).toList();
        System.out.println(notas_oito);
        int lenght_notas_8 = notas_oito.size();
        System.out.println(("Quantidade de notas 8: " + lenght_notas_8));

        // filtrando notas abaixo de 8
        List<Integer> abaixo_de_8 = notas_alunos.stream().filter(nota -> nota < 8).toList();
        System.out.println(abaixo_de_8);
        System.out.println("Quantidade de notas abaixo de oito: " + abaixo_de_8.size());

        // exemplo de map para transformação de dados em um dado único
        List<String> numeros_string = notas_alunos.stream().map(nota -> nota.toString()).toList();
        System.out.println(numeros_string);

        // exemplo de reduce
        String string_numbers = numeros_string.stream().reduce((a, b ) -> a + ", " + b).orElse("");
        System.out.println("Exemplo string de numeros, reduce: " + string_numbers);
    }
}
