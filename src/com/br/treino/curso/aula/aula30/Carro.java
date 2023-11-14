package com.br.treino.curso.aula.aula30;

public class Carro {
    private String marca;
    private String modelo ;

    private int numPassageiros;

    private double consumoCombustivel;
    private double capCombustivel;

    public Carro(String marca, String modelo,int numPassageiros, double consumoCombustivel){
        this.marca=marca;
        this.modelo=modelo;
        this.numPassageiros=numPassageiros;
        this.consumoCombustivel=consumoCombustivel;

        System.out.println("Chamando o construtor com 3 parametros");
    }

    void  exibrAutomia(){
        System.out.println("A autonomia do carro  :"+capCombustivel*capCombustivel );
    }

    double calcularCombusivel(double km){
        double qtdCombu=km/this.consumoCombustivel;
        return qtdCombu;
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
