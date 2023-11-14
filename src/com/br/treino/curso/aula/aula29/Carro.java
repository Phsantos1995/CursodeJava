package com.br.treino.curso.aula.aula29;

import java.security.PublicKey;

public class Carro {
    private String marca;
    private String modelo ;

    private int numPassageiros;

    private double consumoCombustivel;

    public Carro(String marca, String modelo,int numPassageiros, double consumoCombustivel){
     this.marca=marca;
     this.modelo=modelo;
     this.numPassageiros=numPassageiros;
     this.consumoCombustivel=consumoCombustivel;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
}
