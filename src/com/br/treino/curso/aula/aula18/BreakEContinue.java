package com.br.treino.curso.aula.aula18;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre com um numero");
        int num=scanner.nextInt();

        System.out.println("Entre com um limite");
        int max= scanner.nextInt();


        for(int i=num;i<max;i++){
            System.out.println(i);
            if(i%7==0){
                System.out.println("O valor:"+i);
                break;
            }
        }




    }
}
