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
    }
}
