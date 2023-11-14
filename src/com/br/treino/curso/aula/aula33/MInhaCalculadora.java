package com.br.treino.curso.aula.aula33;

public class MInhaCalculadora {

    public int soma(int num1,int  num2){

        return num1+num2;
    }

    public double soma1(double n1, double n2){
        return n1+n2;
    }

    public int soma(int[]vetorInteiros){
        int total=0;
        for(int i=0;i<vetorInteiros.length;i++){
            total+=vetorInteiros[i];
        }

        return total;
    }
}
