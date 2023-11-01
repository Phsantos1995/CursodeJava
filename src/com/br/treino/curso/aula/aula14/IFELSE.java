package com.br.treino.curso.aula.aula14;

import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Entre sua idade");
         int idade=scanner.nextInt();

         if(idade>=18){
             System.out.println("È maior de idade");
         }else {
             System.out.println("Nao é maior de idade");
         }

        System.out.println("digite o nota 1");
         int n1=scanner.nextInt();

        System.out.println("digite o nota 2");
        int n2=scanner.nextInt();

        System.out.println("digite o nota 3");
        int n3=scanner.nextInt();

        System.out.println("digite o nota 4");
        int n4=scanner.nextInt();

        int media=n1+n2+n3+n4/2;

        if(media>=6.5){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }






    }
}
