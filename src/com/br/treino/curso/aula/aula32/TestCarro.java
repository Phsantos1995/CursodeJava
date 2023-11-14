package com.br.treino.curso.aula.aula32;

public class TestCarro {
    public static void main(String[] args) {
    Carro carro=new Carro();

    carro.setMarca("Fiat");
    carro.setModelo("Uno");
    carro.setCapCombustivel(12);
    carro.setConsumoCombustivel(2);


        System.out.println(carro.getModelo());
        System.out.println(carro.getMarca());
        System.out.println(carro.getConsumoCombustivel());
        System.out.println(carro.getCapCombustivel());
    }
}
