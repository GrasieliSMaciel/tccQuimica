package br.com.tcc.crud.dao;


import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.crud.exception.NegocioException;
import br.com.tcc.crud.model.PropriedadesAtomicas;


public class PropriedadesAtomicasDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;

	public PropriedadesAtomicas salvar(PropriedadesAtomicas propriedadesAtomicas) {
		return manager.merge(propriedadesAtomicas);
	}
	
	public void excluir(PropriedadesAtomicas propriedadesAtomicas) {
		try {
			propriedadesAtomicas = porId(propriedadesAtomicas.getId());
			manager.remove(propriedadesAtomicas);
			manager.flush();
			
		} catch (Exception e) {			
			throw new NegocioException("Esta propriedade atomica n�o pode ser excluida");
		}
	}

	public PropriedadesAtomicas porId(Long id) {		
		return manager.find(PropriedadesAtomicas.class, id);
	}
	
	public List<PropriedadesAtomicas> listAll() {
		return manager.createNativeQuery("SELECT * FROM PropriedadesAtomicas", PropriedadesAtomicas.class).getResultList();
	}


}
