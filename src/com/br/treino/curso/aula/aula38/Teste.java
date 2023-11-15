package com.br.treino.curso.aula.aula38;

import com.br.treino.curso.aula.aula37.Aluno;
import com.br.treino.curso.aula.aula37.Pessoa;
import com.br.treino.curso.aula.aula37.Professor;

public class Teste {
    public static void main(String[] args) {
        com.br.treino.curso.aula.aula37.Aluno aluno1=new com.br.treino.curso.aula.aula37.Aluno();

      double[]notas=new double[10];

        com.br.treino.curso.aula.aula37.Pessoa aluno=new Aluno();
        Pessoa professor= new Professor();
        aluno.setCpf(aluno.getCpf());
        aluno.setNome("Pedro Henrique");


        professor.setNome(aluno.getNome());
        System.out.println(professor.getNome());
        System.out.println(aluno.getNome());


    }
}
