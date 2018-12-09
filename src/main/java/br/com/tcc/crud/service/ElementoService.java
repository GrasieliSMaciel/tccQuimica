package br.com.tcc.crud.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.tcc.crud.dao.ElementoDAO;
import br.com.tcc.crud.model.Elemento;
import br.com.tcc.crud.util.Transacional;

public class ElementoService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ElementoDAO elementoDAO;	
	
	
	@Transacional
	public void salvar(Elemento elemento) {
		if (elemento.isInclusao()) {
		}
		
		if (elemento.isEdicao()) {
		}
		
		elementoDAO.salvar(elemento);
	}
	
	@Transacional
	public void excluir(Elemento elemento) {
		elementoDAO.excluir(elemento);
	}
	
	
	public List<Elemento> listAll() {
		System.out.println("List all taref service");
		return elementoDAO.listAll();
	}
	
	public Elemento porId(Long id) {
		return elementoDAO.porId(id);
	}

}
