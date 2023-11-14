package com.br.treino.curso.aula.aula34.labs;

public class Contador {
    static int  cont;

    public  static void incrementar(){
        cont++;
    }
    public  static void serar(){
        cont=0;
    }
    public   static int obterValor(){
        return cont;
    }
}
