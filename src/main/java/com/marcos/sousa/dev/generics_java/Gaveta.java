package com.marcos.sousa.dev.generics_java;

// dentro dessa gaveta como eu posso armazenar vários tipos de dados
// eu utilizo a técnica do Generics do java
// dessa forma eu crio um parâmetro que tipa a nossa classe
public class Gaveta<T> {
    private T objeto_a_guardar;

    public T get_objeto_guardado(){
        return this.objeto_a_guardar;
    }

    public void setObjeto_a_guardar(T objeto_guardar) {
        this.objeto_a_guardar = objeto_guardar;
    }
}
