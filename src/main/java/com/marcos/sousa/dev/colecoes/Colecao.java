package com.marcos.sousa.dev.colecoes;
import java.util.*;
// apenas nossas interfaces, não é implementação, são apenas interfaces
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Queue;

// o que são Collections no java?
// é um framework dentro do java, o próprio java collections framework
// que exportar um conjunto de interfaces e classes que facilitam o armazenamento, a organização e a manipulação de dados de objetos
// o java collection vai nos fornecer uma série de estrutura de dados, vamos dizer, populares
public class Colecao {

    public static void main(String[] args) {
        // mao, set, list e queue

        // o tipo Map
        // é uma estrutura de chave e valor
        // Estrutura de chave/valor
        // iguais objetos do javaScript
        // const alunos = [{name:"Marcos", age: 13}];
        //                 chave: valor

        // o tipo de estrutura Set
        // não permite duplicados
        // myList = [Fe, Leo, Leo];
        // erro, não pode ter duplicados

        // List
        // é uma lista ordenada que permite duplicados
        // myList = [Fe, Fe, Leo];
        // diferença de Set para List, no Set eu não posso ter duplicados, mas na estrutura List sim!

        // Queue
        // filas usadas para processamento em ordem
        // exemplo, recebi uma chamada, essa é a primeira da fila, em ordem, segunda, segunda chamada


        // exemplos

        // #1 List

        // criando um lista que já contém dados fixos, mas pode ser adicionado mais elementos
        List<String> lista = List.of("name", "old");

        // como criar uma lista que não contém elementos default (padrão)
        List<String> lista2 = new ArrayList<String>();

        // posso manipular essa lista
        lista2.add("casa");
        lista2.add("casa"); // aqui temos dois elementos iguais, mas a lista aceita, pois o tipo é List, pode ter dados repetidos
        lista2.add("admin");
        lista2.add("amor");
        System.out.println("List:" + lista2);

        // consigo buscar esse meu elemento pelo índice
        lista2.get(1);
      //  lista2.get("casa"); // não posso fazer o get po objeto, pois tenho dois iguais, pois é do tipo List

        // se eu for trabalhar com uma lista que não permite dados repetidos
                            // utitlizo a classe de HashSet, pois ela implementa a interface de Set
        Set<String> lista3 = new HashSet<>();
        // baseada em tabela de dispersão, é ums hash table
        // essa é uma maneira de implementar uma lista para evitar colisões no momento de gerar
        // as chaves para recuperar os valores
        // e também para ter bastante eficiência no momento de fazer as operações básicas nessa lista
        // que seria adição, remoção e também a verificação de existência de valores
        // hash table é um conceito geral da computação, não é algo do java
        lista3.add("Marcos");
        lista3.add("Marcos");
        // por enquanto isso não gera um erro
        // quando ele vai adicionar esse Marcos dnv, ele verifica se não existe e se existir, ele não vai adicionar
        lista3.add("Hello");
        lista3.add("Kipper");

        System.out.println("Set com hashSet: " + lista3);
        System.out.println(lista3.contains("Fernanda"));
        System.out.println(lista3.contains("Marcos"));

        // quando eu precisar trabalhar com dados não repetido, devo utilizar hashSet, e interface Set

        // agora vamos por Map que é chave e valor, tipo um objeto javaScript
        // quando eu declaro que um variável é do tipo Map, eu tenho tanto que passar o tipo da chave, como o tipo do valor ex: Map<String, String>;
        // precisamos tipar a chave e valor
        Map<String, String> map = new HashMap<>();
        // utitliza também a estrutura HashMap

        // como adicionar valores ao Map, devo utilizar o método put
        //       chave e valor
        map.put("name", "Marcos");
        map.put("surname", "Sousa");

        // como recuperar um valor do meu map?
        // recupero pelo nome da chave
       System.out.println( map.get("name"));

       System.out.println(map.get("surname"));

       // exemplo de recuperação de uma chave que não existe
        System.out.println(map.get("teste")); // null, pq não tem nada registrado nessa chave

        // Queue => filas
        // criando fila de strings
        // pra gente trabalhar com uma lista de Strings
        // podemos utilizar a implementação de uma LinkedList<>();
        // que seria um lista linkada
        Queue<String> fila = new LinkedList<>();
        // essas linkedList são duplamente encadeadas
        // o que significa isso?
        // é que a posição atual da lista, ela aponta tanto pra sua próxima posição, quanto pra sua posição anterior
        // linked list é uma estrutura de dados geral da computação
        //  no java utilizamos ela através da LinkedList
        // por que ela pode ser considerada uma fila?
        // porque todo valor dentro de uma linked list, ele aponta para o próximo valor
        // exemplo, quando crio um valor dentro de uma linkedList, ele vai ser o primeiro, e ele aponta para um próximo que é nulo
        // ou seja, não tem ninguém depois dele.
        // se eu adiciono um novo valor, esse ponteiro é atualizado
        // agora o primeiro valor da fila, passa apontar agora para esse segundo valor, e esse proximo aponta para o valor null
        fila.add("Fernanda");
        fila.add("Kipeer");
        // o método poll retorna o primeiro valor da lista
        System.out.println("Queue antes: " + fila);
        System.out.println("Queue: " + fila.poll()); // pq ele leva em conta que vai processar esse dado, eu não preciso mais manter ele na fila, se eu já recuperei ele
        System.out.println("Queue dps: " + fila); // vai trazer apenas o Kipper, pq o poll tira esse valor da fila

        // o método poll acessa o valor e já remove da fila
        // o método peek acessa o valor sem remove-ló da fila

        // se eu quero apenas printar e não remove-ló, apemas vi de forma de espionagem que é o primeiro da fila
        System.out.println("Apenas lendo o primeiro valor: " + fila.peek());

        // também existe o método remove
        // ele também remove, e me retorna esse valor
        // qual a diferença entre o poll e o remove ?
        // é que o remove vai lançar uma exceção quando não tiver ningúem na fila
        try{
            System.out.println("Usando remove fila: " + fila.remove());
            System.out.println("Usando remove fila: " + fila.remove());
        }
        catch (NoSuchElementException exception) {
            System.out.println("Você não pode deletar o elemento que não existe mais, lista vazia");
        }

        // teste com poll
        System.out.println("Removendo com poll, náo retorna erro: " + fila.poll()); // retorna null

        // métodos disponíveis em uma fila
        // add => adiciono um item a fila
        // pool => traz o primeiro item da lista e remove esse item
        // peek => apenas ler, nada de remover
        // remove => traz o primeiro intem da lista e remove esse item

        // diferença de remove para pool
        // pool retorna null, já remove exception


        // diferenças de quando eu tipo uma fila como uma Queue x LinkedList
        // a diferença é que quando eu tipo como LinkedList eu tenho mais métodos
        // do que quando eu tipo como Queue

        LinkedList<String> fila_two = new LinkedList<>();

        // vou ter por exemplo, método para adicionar um elemento no inicio
         fila_two.addFirst("Carlos");
        // método para adicionar o final
         fila_two.addLast("João");

         // método para recuperar o primeiro item da lista
         System.out.println("Primeiro item fila: " + fila_two.getFirst());

         // método para recuperar o último item da lista
         System.out.println("ùltimo item da lista: " + fila_two.getLast());

                // exemplo
       /* {
            1: "Marcos,
            2: "Paulo,
          } */

        /* {
            "name": "Marcos,
            "sobrenome": "Paulo,
          } */

        // List => lista que pode conter elementos duplicados
        // utilizamos a interface List

        // criando uma lista que já possui valores padrões
        List<String> names = List.of("Marcos", "Carlos");

        // criando uma lista dinâmica usando a interface List do java collections
        List<Integer> numeros = new ArrayList<>();

        // manipulando essa lista
        // como eu utilizei a interface List, ela pode ser uma lista de valores repetidos
        // adicionando elementos
        numeros.add(10);
        numeros.add(10);
        numeros.add(19);
        // buscando um elemento
        System.out.println(numeros.get(0));
        System.out.println(numeros.get(1));
        System.out.println(numeros.getFirst());
        System.out.println(numeros.getLast());

        System.out.println("Dados numeros: " + numeros);
        // Set => utiliza a estrutura hash table, tabela de dispersão
        // essa é uma maneira de implementar uma lista para evitar colisões no momento de gerar
        // as chaves para recuperar os valores
        // e também para ter bastante eficiência no momento de fazer as operações básicas nessa lista
        // que seria adição, remoção e também a verificação de existência de valores
        // o hash table é um conceito geral da computação
        // quando eu vou criar um novo elemento, ele verifica se não existe aquele elemento
        // se existir, ele bloqueia

        // utilizamos a interface Set com a implementação hashSet
           Set<String> set_list = new HashSet<>();
           // manipulando essa lista
            set_list.add("Marcos");
            set_list.add("Marcos"); // não deixa criar, pois já existe
            set_list.add("Home");

            System.out.println("Dados SetList: " + set_list);

            // verificando se existe um elemento na lista, para essa verificação, utilizamos o método contains
            System.out.println("Verificação existência Marcos : " + set_list.contains("Marcos"));
            System.out.println("Verificação existênmcia Paulo " + set_list.contains("Paulo"));

            // Map, estrutura de chave e valor
            // ao declarar o Map eu tenho que falar qual o tipo da chave e o tipo do valor
            Map<String, Integer> dados = new HashMap<>(); // utiliza hash table

            // como criar dados dentro do Map, utilizamos o método put, falando o nome da chave e o valor
            dados.put("valor_casa", 80000);
            dados.put("valor_celular", 90000);
            // para trazer o o valor da chave, eu busco pelo nome da chave
             System.out.println("Valor da casa: " +  dados.get("valor_casa"));
             System.out.println("Valor da casa: " +  dados.get("valor_celular"));
             System.out.println("teste não exite: " +  dados.get("teste")); // ele retorna null


        // revisando novamente
        // Map => chave e valor => como se fosse um objeto javascript => { name:"" }

        // Set => Listas que não permitem valores duplicados, elementos únicos

        // List => Lista normal, que permite valores duplicados

        // Queue => filas usadas para processamento en ordem
        // exemplo: o primeiro que fez essa requisição, é o primeiro que eu vou responder

        // Principais collections: Map, Set, List e Queue
        // apenas interfaces

    }
}
