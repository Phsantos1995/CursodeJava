package com.br.treino.curso.aula.aula35;

public class CalculadoraRecursividade {

    public int fatorialRecursivo(int num){

        if(num==0){
            return 1;
        }
        int total=1;
        for(int i=num;i>1;i--){
            total*=i;
        }
        return total;
    }


    public static void main(String[] args) {

        CalculadoraRecursividade calculadoraRecursividade=new CalculadoraRecursividade();


        System.out.println(calculadoraRecursividade.fatorialRecursivo(5));


    }
}
