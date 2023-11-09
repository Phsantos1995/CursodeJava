package com.br.treino.curso.aula.aula24.lab;

public class ex06 {
    public static void main(String[] args) {
        Contato contato=new Contato();
        contato.nome="Pedro";
        contato.endereco="Rua flamengo é grande";
        contato.email="email@email.com";
        contato.telefones=new String[5];

        contato.telefones[0]="99999-9999";
        contato.telefones[1]="99988-8888";
        contato.telefones[2]="2121-2121";


        System.out.println(contato.telefones[2]);
        System.out.println(contato.email);
        System.out.println(contato.nome) ;

                }
}
