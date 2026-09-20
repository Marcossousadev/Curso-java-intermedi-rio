package com.marcos.sousa.dev.generics_java;

public class Par<T, U> {
    // atributos
    private T primeiro;
    private U segundo;

    public Par(T primeiro, U segundo){
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public T get_primeiro(){
        return this.primeiro;
    }

    public U get_segundo() {
        return this.segundo;
    }
}
