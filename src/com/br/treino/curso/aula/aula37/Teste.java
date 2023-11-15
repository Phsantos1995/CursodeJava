package com.br.treino.curso.aula.aula37;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno1=new Aluno();

      double[]notas=new double[10];

        Pessoa aluno=new Aluno();
        Pessoa professor= new Professor();
        aluno.setCpf(aluno.getCpf());
        aluno.setNome("Pedro Henrique");


        professor.setNome(aluno.getNome());
        System.out.println(professor.getNome());
        System.out.println(aluno.getNome());


    }
}
