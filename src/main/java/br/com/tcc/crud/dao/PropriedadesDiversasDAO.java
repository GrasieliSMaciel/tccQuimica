package br.com.tcc.crud.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.crud.exception.NegocioException;
import br.com.tcc.crud.model.PropriedadesDiversas;

public class PropriedadesDiversasDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public PropriedadesDiversas salvar(PropriedadesDiversas propriedadesDiversas) {
		return manager.merge(propriedadesDiversas);
	}
	
	public void excluir(PropriedadesDiversas propriedadesDiversas) {
		try {
			propriedadesDiversas = porId(propriedadesDiversas.getId());
			manager.remove(propriedadesDiversas);
			manager.flush();
			
		} catch (Exception e) {			
			throw new NegocioException("PropriedadesDiversas não pode ser excluída");
		}
	}

	public PropriedadesDiversas porId(Long id) {		
		return manager.find(PropriedadesDiversas.class, id);
	}
	
	public List<PropriedadesDiversas> listAll() {
		return manager.createNativeQuery("SELECT * FROM PropriedadesDiversas", PropriedadesDiversas.class).getResultList();
	}

}
