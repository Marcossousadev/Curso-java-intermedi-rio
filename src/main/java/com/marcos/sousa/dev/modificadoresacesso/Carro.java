package com.marcos.sousa.dev.modificadoresacesso;
// quando eu declaro que essa classe é public, essa é acessível para todos os packages da minha aplicação java

// todo atributo ou método que não é declaro o modificador de acesso, ele é visível apenas dentro do package
public class Carro {
    // acessível dentro da mesma classe, classes dentro do package, e classes filhas, mesmo que essas classes filhas
    // estejam em outro package
    // agora se eu não declarasse, e fosse package private, esse atríbuto não seria visível em uma classe filha
    protected String modelo;
    public String cor;
    protected int ano;

    // quando eu declaro como private, nem as classes do mesmo package, conseguem acessar!
    // apenas a classe mãe
    private String placa;

    // quando eu não declaro que esee método é public, ele fica como package private
    void teste() {
        System.out.println("teste");
    }

    public Carro(String modelo, String cor, int ano, String placa) {
        this.modelo =  modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Placa: " + placa);
        System.out.println("Ligado!");
    }
    public void desligar() {
        System.out.println("Desligado");
    }

    private String get_placa(){
        return this.placa;
    }

    protected void acelerar(){
        System.out.println("acelerando...");
    }
}

// quando eu não declaro public a essa classe, ela é acessível apenas dentro desse package que eu estou
// ela fica como default
class Moto {
    String modelo;
    String cor;
    int ano;
    String placa;
    // método acessível em qualquer classe ou package, por conta do modificador de acesso public
    public void teste(){
        System.out.println("teste");
    }

    public Moto(String modelo, String cor, int ano, String placa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("Ligada");
    }

    public void desligar() {
        System.out.println("Desligado");
    }
}

