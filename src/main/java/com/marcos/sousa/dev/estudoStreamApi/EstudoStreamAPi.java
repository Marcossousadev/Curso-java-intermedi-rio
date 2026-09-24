package com.marcos.sousa.dev.estudoStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// STREAM API
// USA UM POUCO DE PROGRAMAÇÃO FUNCIONAL
// FOI UM RECURSO QUE VEIO NO JAVA PARA REALIZARMOS OPERAÇÕES FUNCIONAIS EM NOSSAS COLLECTIONS (estruturas de dados)
// usando a stream api conseguimos fazer filter (Filtrar dados), map(transformação de um tipo pra outro)
//
public class EstudoStreamAPi {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Marcos");
        lista.add("Marcos Antonio");
        lista.add("Marcos Sousa");
        lista.add("Ariel Sousa");

        // manipulando essa lita com Stram Api

        // pegando minha lista e filtrando apenas para ter o nome Marcos dentro dela
        // filtrando, se o nome começar com Marcos, salva nessa no lista
        // quando eu faço list.stream(), eu tranformo minha lista em String
        // agora se eu quiser transformar em uma estrutura de dados de lista novamente, uso .toList();
        List<String> nome_marcos = lista.stream().filter(nome -> nome.startsWith("Marcos")).toList();
        System.out.println("Filtragem de apenas Marcos: " + nome_marcos); // não mostra dados que não começam com Marcos

        // usando map para transformar dados em outro tipo de dado
        // exemplo, tranformando dados para Maiuculo

        List<String> maiusculos = lista.stream().map(nome -> nome.toUpperCase()).toList();
        System.out.println("Usando map para tranformar os nomes para maiúsculos: " + maiusculos);

        // testando método reference
        List<String> nomes_minusculos = lista.stream().map(String::toLowerCase).toList();
        System.out.println("Usando método reference para transformar em minuscula com map: " + nomes_minusculos );

        // usando o reduce para reduzir meus dados em um único dado
        String fernada_unique = lista
                .stream().filter(nome -> nome.startsWith("Marcos")).reduce("Marcos", (a, b) -> a  + ", " + b );
        System.out.println(fernada_unique);
    }
}
