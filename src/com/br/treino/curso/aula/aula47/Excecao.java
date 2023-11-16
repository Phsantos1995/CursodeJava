package com.br.treino.curso.aula.aula47;

public class Excecao {
    public static void main(String[] args) {

        try {
            int[] vetor=new int[4];

            System.out.println("Antes da exception");
            vetor[4]=1;
            System.out.println("Esse texto nao seera impresso");

        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Error");
        }



    }
}
