package com.marcos.sousa.dev.recordjava;

// o que são Records
// nova forma de declarar uma classe
// um record é uma classe imutável
// ela permite que cria uma classe
// e instanciar um objeto
// mas não posso dps alterar os dados desse objeto
// não podem ser modificados dps que foram criado!
public class EstudoRecord {
    public static void main(String[] args) {
        Carro sandeiro = new Carro("Sandeiro", "Azul", 2010, "ABC-1234");
        System.out.println("Ano: " + sandeiro.ano()); // getter de ano que vem por padrão do record
        System.out.println("Modelo: " + sandeiro.modelo()); // getter que vem por padrão do record, lembrando que record não tem setter
        // pq um record é imútavel seu valor
        System.out.println("Cor: " + sandeiro.cor());
        System.out.println("Placa: "  + sandeiro.place());

       // sandeiro.ano = 2023; // não consigo alterar valores de um atríbuto de um record, pq o record são classes imútaveis

        // os records são muito usados para DTOs Data Transfer Objects
        // quando eu recebo um dado que tá sendo transferido
        // exemplo, quando eu to criando meu controller, que vai receber minha requisição http, eu recebo informações no body da minha aplicação
        // essa informações que eu recebi, eu não vou mudar elas, só preciso delas para fazer uma consulta no banco de dados, inserção no banco de dados

        // pode se criar DTOs com classes normais, mas a forma mais comum hoje em dia é com Records
        // Data Transfer Objects
        // são dados que eu recebi, e não vou mudá-los, apenas preciso armazena-los para envia-los para outra camda por exemplo

        // POJOs = plain old java objects
        // POJOs são objetos comuns do Java, que são criados através de classes mutáveis

        // exemplo DTO User
        // Record são dados imutáveis
        DTOUser user = new DTOUser("38193919090djamdma", "Marcos", 19);

        //os records nós forncecem por padrão os getters
        System.out.println("User id: " + user.id());
        System.out.println("User nome: " + user.nome());
        System.out.println("User idade: " + user.idade());

        // nós fornece também hashCode, equals e toString

        // muito usados em DTOs = Data Transfer Objects
        // os DTOs tem por função apenas transmitir dados e não alterar nada
        // usado também em POJOs = pail old java objects

        // diferenças de uma classe normal para um record?
        // classes normais podem modificar seus atríbutos
        // no record não, valores não podem ser alterados
    }
}

