package com.br.treino.curso.aula.aula13;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int resultado= 1+2;
        System.out.println(resultado);

        resultado=resultado-1;
        System.out.println(resultado);

        resultado=resultado*2;
        System.out.println(resultado);

        resultado=resultado/2;
        System.out.println(resultado);

        resultado=resultado+8;
        System.out.println(resultado);
        resultado=resultado%7;
        System.out.println(resultado);




        String primeiro="Esta é";
        String segundoNome="uma String concatenda";
        String terceiroNome=primeiro+" "+""+segundoNome;

        System.out.println(terceiroNome);

        resultado++;
        System.out.println(resultado++);
        System.out.println(++resultado);

        resultado--;
        System.out.println(resultado--);
        System.out.println(--resultado);



    }
}
