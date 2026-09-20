package com.marcos.sousa.dev.generics_java;

// dentro de menor e maior q criamos o parâmetro
// exemplo de Generics dentro dessa caixa
// ela é uma caixa que armazena valores
// podemos passar qualquer tipo de valor que queremos arnazenar nessa caixa
public class Caixa<T> {
    private T valor;

    public T get_valor_caixa() {
        return this.valor;
    }

    public void set_valor_caixa(T valor) {
        this.valor = valor;
    }
}
