package com.br.treino.curso.aula.aula19;

import java.security.spec.RSAOtherPrimeInfo;

public class Arrays {

    public static void main(String[] args) {

        double tempDia001=31;
        double tempDia002=32;
        double tempDia003=33;
        double tempDia004=34;

        double[] tempraturas= new double[30];
        tempraturas[0]=31;
        tempraturas[1]=32;
        tempraturas[2]=tempDia002;
        tempraturas[3]=tempDia003;



        System.out.println("Valor:"+tempraturas[3]);

        System.out.println("array:"+tempraturas.length);

        System.out.println(tempraturas[2]);

        System.out.println(tempraturas[3]);


    }
}
