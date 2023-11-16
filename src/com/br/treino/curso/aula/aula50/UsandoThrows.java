package com.br.treino.curso.aula.aula50;

import java.util.Scanner;

public class UsandoThrows {

    public  static double leNumero() throws Exception{
        Scanner scanner=new Scanner(System.in);
        double num=scanner.nextDouble();
        return num;

    }

    public static void main(String[] args) {
        System.out.println("Entre com um numero");
        try {
            double num=leNumero();
            System.out.println("Voce digitou"+num);
        } catch (Exception e) {

            System.out.println("entrada invalida");
            throw new RuntimeException(e);
        }
    }
}
