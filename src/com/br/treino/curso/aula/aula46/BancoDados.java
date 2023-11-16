package com.br.treino.curso.aula.aula46;

public interface BancoDados extends SqlDCL, SqlDDL, SqlDML{
    public void abrirConexao();
    public void fecharConexecao();
}
