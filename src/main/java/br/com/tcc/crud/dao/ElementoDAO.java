package br.com.tcc.crud.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.crud.exception.NegocioException;
import br.com.tcc.crud.model.Elemento;

public class ElementoDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Elemento salvar(Elemento elemento) {
		return manager.merge(elemento);
	}
	
	public void excluir(Elemento elemento) {
		try {
			elemento = porId(elemento.getId());
			manager.remove(elemento);
			manager.flush();
			
		} catch (Exception e) {			
			throw new NegocioException("Elemento não pode ser excluída");
		}
	}

	public Elemento porId(Long id) {		
		return manager.find(Elemento.class, id);
	}
	
	public List<Elemento> listAll() {
		return manager.createNativeQuery("SELECT * FROM Elemento", Elemento.class).getResultList();
	}

}
