package com.marcos.sousa.dev.generics_java;

public class Sacola<T> {
    private T tipoCoisa;

    public T get_tipoCoisa(){
        return this.tipoCoisa;
    }
    public void setTipoCoisa(T tipoCoisa) {
        this.tipoCoisa = tipoCoisa;
    }
}
