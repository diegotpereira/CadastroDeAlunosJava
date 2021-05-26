package br.com.java.dao;

import java.util.ArrayList;

import br.com.java.model.Aluno;

public interface Dao {
	
	void inserir(Aluno aluno);
	
	ArrayList<Aluno> listar();
	
	Aluno pesquisar(String matricula);
	
	void atualizar (Aluno aluno);
	
	void remover (Aluno aluno);
}
