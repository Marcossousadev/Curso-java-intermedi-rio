package com.marcos.sousa.dev.modificadoresacesso;

// bem, como funciona os modificadores de acesso?
// nas classes
// public => visível para todas as pastas da nossa aplicação e para todas as classes
// quando não definimos public, ela fica package private
public class Modificadores {
    public static void main(String[] args) {
    }

    Carro carro;
    Moto moto;
    public Modificadores(Carro carro, Moto moto){
        this.carro = carro;
        this.moto = moto;
        // aqui eu consigo acessar esse método mesmo sem ter declaro ele como public, pois estou no mesmo package
        carro.teste();
        // se a classe fosse public igual esse método teste da moto, ele seria acessível de qualquer lugar
        moto.teste();

        String modelo = carro.modelo; // consigo acessar, mesmo que ele seja um package private,
        // pois está no mesmo package

    }

    // qual a diferença entre package private e o protected?
    // pequena, diferença
    // visivilidade em sub classes
    // quando eu declaro como protected, é visivel para classes do mesmo package e arquivo, mas também para classes filhas,
    // mesmo que essas classes filhas estejam dentro de outro package

    // agora como eu não declaro, sendo package private
    // em classes filhas eu não consigo acesar
}
