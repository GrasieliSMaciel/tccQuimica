package br.com.tcc.crud.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.tcc.crud.dao.PropriedadesAtomicasDAO;
import br.com.tcc.crud.model.PropriedadesAtomicas;
import br.com.tcc.crud.util.Transacional;

public class PropriedadesAtomicasService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PropriedadesAtomicasDAO propriedadesAtomicasDAO;	
	
	
	@Transacional
	public void salvar(PropriedadesAtomicas propriedadesAtomicas) {
		if (propriedadesAtomicas.isInclusao()) {
		}
		
		if (propriedadesAtomicas.isEdicao()) {
		}
		
		propriedadesAtomicasDAO.salvar(propriedadesAtomicas);
	}
	
	@Transacional
	public void excluir(PropriedadesAtomicas propriedadesAtomicas) {
		propriedadesAtomicasDAO.excluir(propriedadesAtomicas);
	}
	
	
	public List<PropriedadesAtomicas> listAll() {
		System.out.println("List all taref service");
		return propriedadesAtomicasDAO.listAll();
	}
	
	public PropriedadesAtomicas porId(Long id) {
		return propriedadesAtomicasDAO.porId(id);
	}

}
