package com.marcos.sousa.dev.generics_java;

// o que é Generics no java
// é um recurso que utilizamos para criar classes, interfaces e métodos de forma
// parametrizada, ou seja deixando cada vez mais nosso código mais reutilizável
// e organizado
public class RevisaoGenerics {
    public static void main(String[] args) {
        // exemplo de uma classe gaveta que armazena vários tipos de dados
        // através da parametrização
        Gaveta<String> minha_gaveta1 = new Gaveta<>();
        // manipulando
        minha_gaveta1.setObjeto_a_guardar("caixa de fotos");
        // minha_gaveta1.setObjeto_a_guardar(10); // dá erro, pois o método obdece
        // o valor que eu defini na instanciação do objeto
        // ou seja, esse meu objeto aceita apenas Strings
        System.out.println(minha_gaveta1.get_objeto_guardado());

        // armazenando dentro dessa gaveta um inteiro
        Gaveta<Integer> minha_gaveta2 = new Gaveta<>();

        // minha_gaveta2.setObjeto_a_guardar("Bolsa"); // errp, pois o tipo definido na
        // instanciação foi o tipo inteiro, não posso atribuir uma String
        minha_gaveta2.setObjeto_a_guardar(10); // sucesso, bate com o tipo definido
        System.out.println(minha_gaveta2.get_objeto_guardado());
        // exemplo de Generic em um método Util
        UtilRevisao.imprimir("casa");
        UtilRevisao.imprimir(20);
        UtilRevisao.imprimir(true);
        UtilRevisao.imprimir('A');
        UtilRevisao.imprimir(20.55f);

        // exemplo do que Generics resolve para Listas
        // exemplo
        // se eu tiver construindo um sistema para loja automóveis
        // onde eu teria Motos e Carros e Jetski
        // se eu precisa-se criar listas para cadas uns desses tipos de automóveis
        // List<Carro> carros = new ArrayList<>();
        // List<Moto> motos = new ArrayList<>();
        // List<JetSki> jetskis = new ArrayList<>();
        // se eu fosse cria cada vez uma lista para um novo tipo de automóvel
        // isso acabaria com a nossa escalabilidade

        // a forma de resolver isso é criar uma bolsa genéricas
        // disso que vem o nome Generics



    }
}
