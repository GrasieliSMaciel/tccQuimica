package br.com.tcc.crud.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.tcc.crud.dao.DescobertaDAO;
import br.com.tcc.crud.model.Descoberta;
import br.com.tcc.crud.util.Transacional;

public class DescobertaService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private DescobertaDAO descobertaDAO;	
	
	
	@Transacional
	public void salvar(Descoberta descoberta) {
		if (descoberta.isInclusao()) {
		}
		
		if (descoberta.isEdicao()) {
		}
		
		descobertaDAO.salvar(descoberta);
	}
	
	@Transacional
	public void excluir(Descoberta descoberta) {
		descobertaDAO.excluir(descoberta);
	}
	
	
	public List<Descoberta> listAll() {
		System.out.println("List all taref service");
		return descobertaDAO.listAll();
	}
	
	public Descoberta porId(Long id) {
		return descobertaDAO.porId(id);
	}

}
