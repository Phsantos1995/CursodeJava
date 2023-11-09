package com.br.treino.curso.aula.aula24;

public class TestCarro {
    public static void main(String[] args) {

        Carro carro =new Carro();

        carro.marca="Volk";
        carro.modelo="fusca";
        carro.capCombustivel=3;
        carro.numPassageiros=3;
        carro.consumoCombustivel=3;


        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.capCombustivel);


    }
}
