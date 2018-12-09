package br.com.tcc.crud.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.tcc.crud.dao.PropriedadesFisicasDAO;
import br.com.tcc.crud.model.PropriedadesFisicas;
import br.com.tcc.crud.util.Transacional;

public class PropriedadesFisicasService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PropriedadesFisicasDAO propriedadesFisicasDAO;	
	
	
	@Transacional
	public void salvar(PropriedadesFisicas propriedadesFisicas) {
		if (propriedadesFisicas.isInclusao()) {
		}
		
		if (propriedadesFisicas.isEdicao()) {
		}
		
		propriedadesFisicasDAO.salvar(propriedadesFisicas);
	}
	
	@Transacional
	public void excluir(PropriedadesFisicas propriedadesFisicas) {
		propriedadesFisicasDAO.excluir(propriedadesFisicas);
	}
	
	
	public List<PropriedadesFisicas> listAll() {
		System.out.println("List all taref service");
		return propriedadesFisicasDAO.listAll();
	}
	
	public PropriedadesFisicas porId(Long id) {
		return propriedadesFisicasDAO.porId(id);
	}

}
