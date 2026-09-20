package com.marcos.sousa.dev.colecoes;
import java.util.*;

// o que é o Java Collections
// o java collections é um framework java
// ele exporta um conjunto de interfaces e classes
// essas interfaces e classes facilitam o armazenamento, organização e a manipulação dos dados
// traz alguns métodos
// que traz algumas estruturas de dados para a gente utilizar, vamos dizer estruturas de dados populares
public class NewColecao {
    public static void main(String[] args){
        // List => estrutura de daodos que permite dados repetidos, o List é apenas uma interface

        // criando uma lista com valores padrões
           List<String> lista = List.of("casa", "carro");

        // criando uma lista dinâmica
        List<Integer> numeros = new ArrayList<>();

        // consigo manipular essa lista
        // adicionando
        numeros.add(10);
        numeros.add(10); // consigo passar um item repetido
        numeros.add(9);
        // removendo o primeiro item da lista
        numeros.removeFirst();
        // exibindo o dado dessa lista
        System.out.println(numeros.get(0));

        // Set => estrutura de dados que não permite dados repetidos
        // usamos a implementação hashSet
        // aqui se utiliza da hash table, que é um conceito da computação
        // baseada na tabela dispersa
        // essa é uma maneira de implementar uma lista sem que haja colisões no momento de gerar a lista
        // não haja colisões na hora de usar as chaves de recuperar valores
        // e eficiência no momento de realizar operações básicas na lista
        // adição, remoção, busca do elemento
        // hash table é um conceito da computação em geral
        Set<String> lista_hash_table = new HashSet<String>();
        lista_hash_table.add("Marcos");
        lista_hash_table.add("Marcos"); // não adiciona, pq esse item é repetido, e Set não deixa criar dados repetidos
        lista_hash_table.add("Carla");
        System.out.println(lista_hash_table);

        // Queue => filas
        // processamento em ordem
        // usam o LinkedList que é um conceito da computação
        // essas LinkedList são duplamente encadeadas
        // a posição atual da lista aponta para a anterior e para a próxima posição
        // exemplo, quando crio um valor dentro de uma linkedList, ele vai ser o primeiro, e ele aponta para um próximo que é nul
        // ou seja, não tem ninguém depois dele.
        // se eu adiciono um novo valor, esse ponteiro é atualizado
        // agora o primeiro valor da fila, passa apontar agora para esse segundo valor, e esse proximo aponta para o valor null
        Queue<String> lista_queue = new LinkedList<>();
        lista_queue.add("Marcos");
        lista_queue.add("Paulo");

        System.out.println(lista_queue);

        // vendo o item e ao mesmo tempo removendo
        lista_queue.poll();
        System.out.println(lista_queue); // remove Marcos, pq pra ele já foi processado
        lista_queue.peek(); // apenas ler, não remove
        lista_queue.remove();

        // diferença poll e remove?
        // remove lança erro
        // poll não lança, apenas retorna null


        // Map, o Map é como se fosse um objeto java script
        // chave e valor
        Map<String, String> objeto_jv = new HashMap<>();

        // maniupulando Map
        //  defino primeiro a chave e dps o valor que ela vai armazenar
        objeto_jv.put("name", "Marcos"); // poderia armazenar esse valor em uma variável
        String name_map = objeto_jv.get("name");
        System.out.println(name_map);
        // objeto_jv.put("numero", 1); // não aceita que eu passe número, pois eu tipei que tanto a chave e o valor eram Strings

        // como buscar um valor, faço a busca pelo nome da chave
        System.out.println("valor da chave name, valor: " + objeto_jv.get("name"));

    }
}
