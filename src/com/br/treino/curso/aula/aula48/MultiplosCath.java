package com.br.treino.curso.aula.aula48;

public class MultiplosCath {
    public static void main(String[] args) {

        int [] numeros ={2,4,18,32,64,128};
        int [] demon={2,0,4,8,0};

        for(int i=0;i<numeros.length;i++){
            try{
                System.out.println(numeros[i]+"/"+demon[i]+"="+ (numeros[i]/demon[i]));
            }catch (ArithmeticException e){
                System.out.println("Erro ao dividir por zero");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Posicao do array invalida");
            }

        }

    }
}
