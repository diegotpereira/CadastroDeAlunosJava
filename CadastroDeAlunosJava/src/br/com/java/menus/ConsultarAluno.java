package br.com.java.menus;

import br.com.java.model.Aluno;

public class ConsultarAluno extends ItemDeMenu{

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Consultar aluno";
	}

	@Override
	public boolean executar() {
		// TODO Auto-generated method stub
		
		String matricula = leitor.lerString("Matrícula: ");
		
		Aluno aluno = dao.pesquisar(matricula);
		
		if (aluno == null) {
			System.out.println("Aluno não encontrado!");
		}else {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("P1..: " + aluno.getP1());
			System.out.println("P2..: " + aluno.getP2());
		}
		return false;
	}

}
