package com.marcos.sousa.dev.generics_java;

public class CompanheiroNinja {
    private String nomeDoAnimal;

    public CompanheiroNinja(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    @Override
    public String toString(){
        return "Companheiro Animal: " + nomeDoAnimal;
    }
}
