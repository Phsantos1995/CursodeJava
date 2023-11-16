package com.br.treino.curso.aula.aula51;

public class UsandoMinhException {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 18, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demon[i] + "=" + (numeros[i] / demon[i]));
                System.exit(0);
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por zero");
                System.exit(0);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posicao do array invalida");
                System.exit(0);
            } catch (Exception e){
                System.out.println("Aconteceu um erro");
                System.out.println("mensagem:"+e.getMessage());
            }
        }
    }
}
