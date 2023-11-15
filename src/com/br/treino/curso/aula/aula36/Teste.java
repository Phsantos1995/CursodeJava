package com.br.treino.curso.aula.aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato=new Contato();
        Endereco endereco=new Endereco("", "","","","","");
        Telefone telefone=new Telefone();
        contato.setNome("Pedro");
        contato.setTelefone(telefone);
        contato.setEndereco(endereco);
        endereco.setNomeRua("rua dede");
        endereco.setCep("000000");
        endereco.setCidade("Sao paulo");
        telefone.setDDD("11");
        telefone.setTipo("12");
        telefone.setNumero("22222222");



        System.out.println(contato.getEndereco().getCep());
        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone().getNumero());


        if(contato !=null && contato.getEndereco() !=null){
            System.out.println(contato.getEndereco().getCep());
        }

    }
}
