package com.br.treino.curso.aula.aula27;

public class TestCarro {


    public static void main(String[] args) {
        Carro carro=new Carro();

        carro.consumoCombustivel=90;
        carro.capCombistivel=0.2;
        carro.numPassageiros=10;
        carro.marca="fiat";
        carro.modelo="siena";

      double km=10;

        double autonomia=carro.obterAutomatica();
        System.out.println(autonomia);
        System.out.println(carro.calcularCombustivel(km));

        System.out.println(carro.marca);
        System.out.println(carro.modelo);



    }
}
