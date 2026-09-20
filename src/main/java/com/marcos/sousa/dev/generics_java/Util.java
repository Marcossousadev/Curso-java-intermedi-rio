package com.marcos.sousa.dev.generics_java;

public class Util {
    // antes se vai ter retorno ou não
    public static <T, U> void imprimir(T valor1, U valor2) {
        System.out.println("Printando valor1 e valor2: " + valor1 + " " + valor2);
    }
}
