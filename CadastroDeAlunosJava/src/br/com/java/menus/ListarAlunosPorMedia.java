package br.com.java.menus;

import br.com.java.model.Aluno;

public class ListarAlunosPorMedia extends ListarAlunos{

	@Override
	public boolean deveImprimir(Aluno aluno) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Listar alunos (oredem de média)";
	}
	@Override
	public int compare (Aluno o1, Aluno o2) {
		double media1 = o1.calcularMedia();
		double media2 = o2.calcularMedia();
		
		if (media1 < media2) {
			return -1;
		}else if (media1 > media2) {
			return 1;
		}else {
			return super.compare(o1, o2);
		}
	}
}
