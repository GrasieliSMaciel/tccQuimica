package br.com.tcc.crud.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.tcc.crud.dao.PropriedadesDiversasDAO;
import br.com.tcc.crud.model.PropriedadesDiversas;
import br.com.tcc.crud.util.Transacional;

public class PropriedadesDiversasService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PropriedadesDiversasDAO propriedadesDiversasDAO;	
	
	
	@Transacional
	public void salvar(PropriedadesDiversas propriedadesDiversas) {
		if (propriedadesDiversas.isInclusao()) {
		}
		
		if (propriedadesDiversas.isEdicao()) {
		}
		
		propriedadesDiversasDAO.salvar(propriedadesDiversas);
	}
	
	@Transacional
	public void excluir(PropriedadesDiversas propriedadesDiversas) {
		propriedadesDiversasDAO.excluir(propriedadesDiversas);
	}
	
	
	public List<PropriedadesDiversas> listAll() {
		System.out.println("List all taref service");
		return propriedadesDiversasDAO.listAll();
	}
	
	public PropriedadesDiversas porId(Long id) {
		return propriedadesDiversasDAO.porId(id);
	}

}
