package com.br.treino.curso.aula.aula15;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Entre com um dia dia da semana");

        int diaSemana=scanner.nextInt();

        if(diaSemana==1){
            System.out.println("domingo");
        }else if (diaSemana==2){
            System.out.println("segunda");
        }else if (diaSemana==3){
            System.out.println("terça");
        }
        else{
            System.out.println("nao tem escolheu");
        }

    }
}
