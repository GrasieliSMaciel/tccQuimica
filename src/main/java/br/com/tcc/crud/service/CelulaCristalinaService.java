package br.com.tcc.crud.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.tcc.crud.dao.CelulaCristalinaDAO;
import br.com.tcc.crud.model.CelulaCristalina;
import br.com.tcc.crud.util.Transacional;

public class CelulaCristalinaService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CelulaCristalinaDAO celulaCristalinaDAO;	
	
	
	@Transacional
	public void salvar(CelulaCristalina celulaCristalina) {
		
		celulaCristalinaDAO.salvar(celulaCristalina);
	}
	
	@Transacional
	public void excluir(CelulaCristalina celulaCristalina) {
		celulaCristalinaDAO.excluir(celulaCristalina);
	}
	
	
	public List<CelulaCristalina> listAll() {
		System.out.println("List all taref service");
		return celulaCristalinaDAO.listAll();
	}
	
	public CelulaCristalina porId(Long id) {
		return celulaCristalinaDAO.porId(id);
	}

}
