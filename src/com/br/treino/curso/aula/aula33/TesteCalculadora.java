package com.br.treino.curso.aula.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        MInhaCalculadora mInhaCalculadora=new MInhaCalculadora();

        int topa=12;
        int v[] = new int[13];

        for(int i=0;i<v.length;i++){
            v[i]=topa++;
        }


        System.out.println(mInhaCalculadora.soma(1,2));
        System.out.println(mInhaCalculadora.soma1(2,3));
        System.out.println(mInhaCalculadora.soma(v));

    }
}
