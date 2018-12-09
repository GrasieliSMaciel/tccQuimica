package br.com.tcc.crud.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.tcc.crud.exception.NegocioException;
import br.com.tcc.crud.model.Tarefa;

public class ModeloDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Tarefa salvar(Tarefa tarefa) {
		return manager.merge(tarefa);
	}
	
	public void excluir(Tarefa tarefa) {
		try {
			tarefa = porId(tarefa.getId());
			manager.remove(tarefa);
			manager.flush();
			
		} catch (Exception e) {			
			throw new NegocioException("Tarefa não pode ser excluída");
		}
	}

	public Tarefa porId(Long id) {		
		return manager.find(Tarefa.class, id);
	}
	
	public List<Tarefa> listAll() {
		return manager.createNativeQuery("SELECT * FROM Tarefa", Tarefa.class).getResultList();
	}

}
