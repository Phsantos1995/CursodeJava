package com.br.treino.curso.aula.aula27;

public class Carro {

String marca;
String modelo;
int numPassageiros;
double capCombistivel;
double consumoCombustivel;


void exibirAutomia(){
    System.out.println("A autonomia do carro é :"+capCombistivel*consumoCombustivel);
}

double obterAutomatica(){
    System.out.println("Metodo obterAutonomia foi chamado");
    return capCombistivel*consumoCombustivel;
}

double calcularCombustivel(double km){
    double qtdCombustivel =km/consumoCombustivel;

    return qtdCombustivel;
}


}
