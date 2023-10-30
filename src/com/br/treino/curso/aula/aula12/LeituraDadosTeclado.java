package com.br.treino.curso.aula.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Digite seu nome compelto:");
        String nomeCompleto =sca.nextLine();

        System.out.println("Digite a sua idade");
        int idade=sca.nextInt();
        System.out.println("A sua idade é :"+idade);


        System.out.println("Resultado:"+nomeCompleto+idade);
    }
}
