package br.com.java.menus;

import br.com.java.model.Aluno;

public class AtualizarAluno extends ItemDeMenu {

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Atualizar aluno";
	}

	@Override
	public boolean executar() {
		// TODO Auto-generated method stub
		
		String matricula = leitor.lerString("Matrícula: ");
		
		Aluno aluno = dao.pesquisar(matricula);
		
		if (aluno == null) {
			System.out.println("Aluno não encontrado!");
		} else {
			
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("P1..: " + aluno.getP1());
			System.out.println("P2..: " + aluno.getP2());
			
			String nome = leitor.lerString("Novo nome: ");
			double p1 = leitor.lerDouble("Nova P1: ");
			double p2 = leitor.lerDouble("Nova P2: ");
			
			aluno.setNome(nome);
			aluno.setP1(p1);
			aluno.setP2(p2);
			
			dao.atualizar(aluno);
		}
		return false;
	}

}
