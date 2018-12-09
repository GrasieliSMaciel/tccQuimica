package br.com.tcc.crud.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.tcc.crud.dao.PropriedadesEletromagneticasDAO;
import br.com.tcc.crud.model.PropriedadesEletromagneticas;
import br.com.tcc.crud.util.Transacional;

public class PropriedadesEletromagneticasService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PropriedadesEletromagneticasDAO propriedadesEletromagneticasDAO;	
	
	
	@Transacional
	public void salvar(PropriedadesEletromagneticas propriedadesEletromagneticas) {
		if (propriedadesEletromagneticas.isInclusao()) {
		}
		
		if (propriedadesEletromagneticas.isEdicao()) {
		}
		
		propriedadesEletromagneticasDAO.salvar(propriedadesEletromagneticas);
	}
	
	@Transacional
	public void excluir(PropriedadesEletromagneticas propriedadesEletromagneticas) {
		propriedadesEletromagneticasDAO.excluir(propriedadesEletromagneticas);
	}
	
	
	public List<PropriedadesEletromagneticas> listAll() {
		System.out.println("List all taref service");
		return propriedadesEletromagneticasDAO.listAll();
	}
	
	public PropriedadesEletromagneticas porId(Long id) {
		return propriedadesEletromagneticasDAO.porId(id);
	}

}
