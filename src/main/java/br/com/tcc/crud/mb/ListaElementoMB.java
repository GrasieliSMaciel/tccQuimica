package br.com.tcc.crud.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.tcc.crud.model.Elemento;
import br.com.tcc.crud.service.ElementoService;
import br.com.tcc.crud.util.FacesUtil;

@Named
@ViewScoped
public class ListaElementoMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ElementoService elementoService;
	
	private List<Elemento> elementos = new ArrayList<>();
	
	private List<Elemento> elementosSelecionados = new ArrayList<>();
	
	private String teste1;
	
	@PostConstruct
	public void inicializar() {
		System.out.println("Init lista elemento MB");
		elementos = elementoService.listAll();
		System.out.println("Inicializou!!");
		teste1 = "Grasi";
	}
	
	public void testa(String teste) {
		System.out.println("Teste: " + teste);
	}
	
	public void excluirSelecionados() {
		
		System.out.println("Excluir selecionados");
		
		for (Elemento elemento : elementosSelecionados) {
			elementoService.excluir(elemento);
			elementos.remove(elemento);
		}
		
		FacesUtil.addInfoMessage("Elemento(s) exclu�dos com sucesso!");
	}
	
	

	public ElementoService getElementoService() {
		System.out.println("Get elemento");
		return elementoService;
	}

	public void setElementoService(ElementoService elementoService) {
		this.elementoService = elementoService;
	}

	public List<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(List<Elemento> elementos) {
		this.elementos = elementos;
	}

	public List<Elemento> getElementosSelecionados() {
		return elementosSelecionados;
	}

	public void setElementosSelecionados(List<Elemento> elementosSelecionados) {
		this.elementosSelecionados = elementosSelecionados;
	}

	public String getTeste1() {
		return teste1;
	}

	public void setTeste1(String teste1) {
		this.teste1 = teste1;
	}
	

	
}
