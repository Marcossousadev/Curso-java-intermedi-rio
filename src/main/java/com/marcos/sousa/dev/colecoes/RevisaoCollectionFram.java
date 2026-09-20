package com.marcos.sousa.dev.colecoes;
import java.util.*;

public class RevisaoCollectionFram {
    public static void main(String[] args) {
        // o que é o java collections?
        // o java collections é um framework do java
        // que traz pra gente algumas estruturas de dados padrões
        // a java collections traz interfaces e classes

        // List, Set, Map, Queue

        // List => uma lista que permite valores repetidos
        // esse List é apenas uma interface, que vamos dps fazer a implementação

        // criando uma Lista com valores fixos
        // interface<definindo o tipo dessa lista> nome_lista = implementação;
        List<String> names = List.of("Marcos", "Gisele", "Marcos"); // essa lista nos permite valores repetidos, pois é do tipo List

        // valores lista names
        System.out.println(names);
        // criando uma lista dinâmica
        List<Integer> numbers = new ArrayList<>();

        // manipulando essa lista
        // adicionando itens
        numbers.add(9);
        numbers.add(10);
        numbers.add(10); // adicionando mais um valor 11, a lista aceita pois é do tipo List
        numbers.add(11);
        // removendo itens
        // tenho que informar um index
        numbers.remove(0);
        // buscando um item da lista
        numbers.get(0); // informo o index para realizar a busca

        // listando itens da lista
        System.out.println(numbers);

        // Set => lista que não permite valores repetidos
        // usamos a implementação hashSet
        // a qual utiliza hash table, que é uma tabela de dispersão
        // algo da computação em geral
        // sendo uma maneira de implementar uma lista que não pode haver colisões de itens repetidos
        // para não ter erros na hora de buscar um item pelo valor dele
        // tendo uma eficiência ao utilizar os métodos dessa lista
        // adição, remoção e busca do item
        // utilizamos Set como interface
        // e HashSet como classe que será implementada o Set

        // criando uma lista que não permite valores repetidos
        Set<String> animais = new HashSet<>();

        // manipulando essa lista
        animais.add("Gato");
        animais.add("Cachorro");
        animais.add("Cachorro"); // ele não nós traz nenhum erro, mas não adiciona esse valor a lista, pois já existe um item com esse mesmo valor
        animais.add("Gavião"); // permite adicionar, pois esse valor ainda não existe na nossa lista de animais

        // vendo itens da lista
        System.out.println("lista animais: " + animais);

        // verificando se há um valor na lista
        System.out.println("Verificando se há um valor na lista: " + animais.contains("Cachorro"));
        System.out.println("Verificando se há um valor na lista: " + animais.contains("Peixe"));
        // contains => se houver, retorna true, se não houver, retorna false

        // Map => tipo um objeto java script, possui chave e valor
        // usamos a interface Map e a classe hashMap

        // devemos tipar tanto a chave como também o valor
        Map<String, String> valores = new HashMap<>();

        // método para adicionar um valor ao Map
        valores.put("name", "Gisele");

        // método para buscar valor
        String valor_name =  valores.get("name"); // buscamos um valor pelo nome de sua chave

        System.out.println("Valor chave name: " + valor_name);


        // Queue => fila
        // processa valores de forma sequência
        // se um valor A outro primeiro que um valor B, primeiro ele processa o valor A, aí dps o valor B
        // usamos a interface Queue, e o como implementação a LinkedList
        // o conceito de LinkedList é um conceito comum da programação em geral
        // as LinkedList são duplamente encadeadas
        // a posição atual da lista aponta tanto para a anterior, como para a próxima
        // ou seja, quando eu crio um valor A dentro da LinkedList ele é o primeiro valor
        // e o próximo é null, se eu adicionar um novo valor, por exemplo B
        // o ponteiro é atualizado, então o valor anterior é A e o próximo valor é null

        // criando uma fila
        Queue<String> fila_Strings = new LinkedList<>();

        // adicionando valores a essa fila
        fila_Strings.add("Marcos");
        fila_Strings.add("Gisele");
        fila_Strings.add("Maria");

        // métodos de uma fila

        // poll => ler o primeiro item e também remove da fila, pq pra ele já foi processado
        System.out.println("Fila antes do poll: " + fila_Strings);
        fila_Strings.poll();
        System.out.println("Fila dps do poll: " + fila_Strings);
        // peek => apenas ler o primeiro item da fila, não remove nada da lista, método espião
        String primeiro_item = fila_Strings.peek();
        System.out.println("Ler primeiro item: " + primeiro_item);

        // remove => faça a mesma coisa que o poll ler e remove da fila o primeiro item
        fila_Strings.remove();
        System.out.println("Fila dps do remove: " + fila_Strings);

        // qual a diferença do poll para o remove então?
        // o poll retorna null quando a lista está vazia
        // já o remove retorna uma exception quando a lista está vazia

        // exemplo
        fila_Strings.poll(); // remove Maria
        System.out.println("Exemplo poll diferença" + fila_Strings);
        String ultima_remocao_poll =  fila_Strings.poll(); // retorna null
        System.out.println("Ultima remoção poll: " + ultima_remocao_poll);
        // exemplo de remoção lista vaiza com remove
        fila_Strings.remove(); // retorna uma exception, que pode ser tratada!

    }
}
