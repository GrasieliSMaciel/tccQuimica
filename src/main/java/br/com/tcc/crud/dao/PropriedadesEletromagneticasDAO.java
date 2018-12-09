package br.com.tcc.crud.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.crud.exception.NegocioException;
import br.com.tcc.crud.model.PropriedadesEletromagneticas;

public class PropriedadesEletromagneticasDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public PropriedadesEletromagneticas salvar(PropriedadesEletromagneticas propriedadesEletromagneticas) {
		return manager.merge(propriedadesEletromagneticas);
	}
	
	public void excluir(PropriedadesEletromagneticas propriedadesEletromagneticas) {
		try {
			propriedadesEletromagneticas = porId(propriedadesEletromagneticas.getId());
			manager.remove(propriedadesEletromagneticas);
			manager.flush();
			
		} catch (Exception e) {			
			throw new NegocioException("PropriedadesEletromagneticas não pode ser excluída");
		}
	}

	public PropriedadesEletromagneticas porId(Long id) {		
		return manager.find(PropriedadesEletromagneticas.class, id);
	}
	
	public List<PropriedadesEletromagneticas> listAll() {
		return manager.createNativeQuery("SELECT * FROM PropriedadesEletromagneticas", PropriedadesEletromagneticas.class).getResultList();
	}

}
