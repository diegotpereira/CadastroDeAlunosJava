package br.com.java.menus;

import br.com.java.model.Aluno;

public class ListarAlunosPorNome extends ListarAlunos {

	@Override
	public boolean deveImprimir(Aluno aluno) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Listar alunos (ordem alfabética)";
	}

}
