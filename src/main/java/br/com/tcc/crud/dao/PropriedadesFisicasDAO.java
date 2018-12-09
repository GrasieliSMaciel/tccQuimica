package br.com.tcc.crud.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.crud.exception.NegocioException;
import br.com.tcc.crud.model.PropriedadesFisicas;

public class PropriedadesFisicasDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public PropriedadesFisicas salvar(PropriedadesFisicas propriedadesFisicas) {
		return manager.merge(propriedadesFisicas);
	}
	
	public void excluir(PropriedadesFisicas propriedadesFisicas) {
		try {
			propriedadesFisicas = porId(propriedadesFisicas.getId());
			manager.remove(propriedadesFisicas);
			manager.flush();
			
		} catch (Exception e) {			
			throw new NegocioException("Esta propriedade n�o f�sica n�o pode ser exclu�da");
		}
	}

	public PropriedadesFisicas porId(Long id) {		
		return manager.find(PropriedadesFisicas.class, id);
	}
	
	public List<PropriedadesFisicas> listAll() {
		return manager.createNativeQuery("SELECT * FROM PropriedadesFisicas", PropriedadesFisicas.class).getResultList();
	}

}
