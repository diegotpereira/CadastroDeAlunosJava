package br.com.java.menus;

import br.com.java.dao.Dao;
import br.com.java.dao.DaoArrayList;
import br.com.java.io.Leitor;

public abstract class ItemDeMenu {
	
	protected Leitor leitor;
	protected Dao dao;
	
	
	public ItemDeMenu() {
		leitor = new Leitor();
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();
	
	public abstract boolean executar();
}
