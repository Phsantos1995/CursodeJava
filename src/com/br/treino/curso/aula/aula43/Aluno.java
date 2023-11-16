package com.br.treino.curso.aula.aula43;

public class Aluno {
    private String curso;
    private double [] notas;


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String toString(){
        String s=curso+ "\n";
        for(double nota:notas){
            s+= nota+"";
        }
        return s;
    }
}
