package br.com.tcc.crud.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.crud.exception.NegocioException;
import br.com.tcc.crud.model.Descoberta;

public class DescobertaDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Descoberta salvar(Descoberta descoberta) {
		return manager.merge(descoberta);
	}
	
	public void excluir(Descoberta descoberta) {
		try {
			descoberta = porId(descoberta.getId());
			manager.remove(descoberta);
			manager.flush();
			
		} catch (Exception e) {			
			throw new NegocioException("Descoberta não pode ser excluída");
		}
	}

	public Descoberta porId(Long id) {		
		return manager.find(Descoberta.class, id);
	}
	
	public List<Descoberta> listAll() {
		return manager.createNativeQuery("SELECT * FROM Descoberta", Descoberta.class).getResultList();
	}

}
