package com.br.treino.curso.aula.aula38;

import com.br.treino.curso.aula.aula37.Pessoa;

public class Professor extends Pessoa {

private  String nome;
private String endereco;
private String telefone;
private String cpf;
private double salario;

private String nomeCurso;


public double calcularSalarioLiquido(){
    return salario;
}


}
