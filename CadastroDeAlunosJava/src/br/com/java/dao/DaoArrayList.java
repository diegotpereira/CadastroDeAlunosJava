package br.com.java.dao;

import java.util.ArrayList;

import br.com.java.model.Aluno;

public class DaoArrayList implements Dao {
	
	private static ArrayList<Aluno> bd = new ArrayList<Aluno>();

	@Override
	public void inserir(Aluno aluno) {
		// TODO Auto-generated method stub
		bd.add(aluno);
	}

	@Override
	public ArrayList<Aluno> listar() {
		// TODO Auto-generated method stub
		return bd;
	}

	@Override
	public Aluno pesquisar(String matricula) {
		// TODO Auto-generated method stub
		
		Aluno resultado = null;
		
		for(int i = 0; i < bd.size(); i ++) {
			
			Aluno atual = bd.get(i);
			
			if (atual.getMatricula().equals(matricula)) {
				resultado  = atual;
				
				break;
			}
		}
		return resultado;
	}

	@Override
	public void atualizar(Aluno aluno) {
		// TODO Auto-generated method stub
		Aluno pesquisado = pesquisar(aluno.getMatricula());
		
		pesquisado.setNome(aluno.getNome());
		pesquisado.setP1(aluno.getP1());
		pesquisado.setP2(aluno.getP2());
	}

	@Override
	public void remover(Aluno aluno) {
		// TODO Auto-generated method stub
		bd.remove(aluno);
	}

}
