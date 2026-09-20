package com.marcos.sousa.dev.generics_java;

public class Pintura<E extends Pintavel> {
    // aplicando Generics
    // essa coisa que vou pintar, pode ser tanto um carro, uma caixa, um papel
    private E coisaQueVouPintar;

    public Pintura(E coisaQueVouPintar) {
        this.coisaQueVouPintar = coisaQueVouPintar;
    }
    public E getCoisaQueVouPintar() {
        return this.coisaQueVouPintar;
    }
    public void setCoisaQueVouPintar(E coisaQueVouPintar){
        this.coisaQueVouPintar = coisaQueVouPintar;
    }

    public void pintar() {
        this.coisaQueVouPintar.aplicarTinta();
    }
}
