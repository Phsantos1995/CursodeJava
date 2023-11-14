package com.br.treino.curso.aula.aula30;

public class TestCarro {

    public static void main(String[] args) {

        Carro carro=new Carro("fiat","uni", 1,1);
        System.out.println(carro.getConsumoCombustivel()*3);
        System.out.println(carro.getNumPassageiros()*10);
     carro.calcularCombusivel(30);
     carro.exibrAutomia();
     carro.getConsumoCombustivel();

    }
}
