package br.com.java.menus;

import br.com.java.model.Aluno;

public class RemoverAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Remover aluno";
	}

	@Override
	public boolean executar() {
		// TODO Auto-generated method stub
		
		String matricula = leitor.lerString("Matrícula: ");
		
		Aluno aluno = dao.pesquisar(matricula);
		
		if (aluno == null) {
			System.out.println("Aluno não encontrado!");
		}else {
			Aluno alunoParaRemover = new Aluno(matricula);
			
			dao.remover(alunoParaRemover);
		}
		return false;
	}

}
