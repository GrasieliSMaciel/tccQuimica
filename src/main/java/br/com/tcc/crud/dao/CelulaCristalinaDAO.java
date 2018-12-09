package br.com.tcc.crud.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.crud.exception.NegocioException;
import br.com.tcc.crud.model.CelulaCristalina;

public class CelulaCristalinaDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public CelulaCristalina salvar(CelulaCristalina celulaCristalina) {
		return manager.merge(celulaCristalina);
	}
	
	public void excluir(CelulaCristalina celulaCristalina) {
		try {
			celulaCristalina = porId(celulaCristalina.getId());
			manager.remove(celulaCristalina);
			manager.flush();
			
		} catch (Exception e) {			
			throw new NegocioException("CelulaCristalina n�o pode ser excluida");
		}
	}

	public CelulaCristalina porId(Long id) {		
		return manager.find(CelulaCristalina.class, id);
	}
	
	public List<CelulaCristalina> listAll() {
		return manager.createNativeQuery("SELECT * FROM CelulaCristalina", CelulaCristalina.class).getResultList();
	}

}
