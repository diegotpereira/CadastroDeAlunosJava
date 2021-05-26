package br.com.java.menus;

import br.com.java.model.Aluno;

public class ListarAlunosAprovados extends ListarAlunos {

	@Override
	public boolean deveImprimir(Aluno aluno) {
		// TODO Auto-generated method stub
		return aluno.passou();
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Listar alunos aprovados";
	}

}
