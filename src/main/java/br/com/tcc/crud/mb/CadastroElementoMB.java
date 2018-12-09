package br.com.tcc.crud.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.tcc.crud.model.CelulaCristalina;
import br.com.tcc.crud.model.Descoberta;
import br.com.tcc.crud.model.Elemento;
import br.com.tcc.crud.model.PropriedadesAtomicas;
import br.com.tcc.crud.model.PropriedadesDiversas;
import br.com.tcc.crud.model.PropriedadesEletromagneticas;
import br.com.tcc.crud.model.PropriedadesFisicas;
import br.com.tcc.crud.service.CelulaCristalinaService;
import br.com.tcc.crud.service.DescobertaService;
import br.com.tcc.crud.service.ElementoService;
import br.com.tcc.crud.service.PropriedadesAtomicasService;
import br.com.tcc.crud.service.PropriedadesDiversasService;
import br.com.tcc.crud.service.PropriedadesEletromagneticasService;
import br.com.tcc.crud.service.PropriedadesFisicasService;




@Named
@ViewScoped
public class CadastroElementoMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Elemento elemento = new Elemento();
	private PropriedadesFisicas propriedadesFisicas  = new PropriedadesFisicas();
	private PropriedadesAtomicas propriedadesAtomicas = new PropriedadesAtomicas();
	private PropriedadesEletromagneticas propriedadesEletromagneticas = new PropriedadesEletromagneticas();
	private PropriedadesDiversas propriedadesDiversas = new PropriedadesDiversas();
	private CelulaCristalina celulaCristalina = new CelulaCristalina();
	private Descoberta descoberta = new Descoberta();
	
	private Long idElemento;
	private Long idPropriedadesFisicas;
	private Long idPropriedadesAtomicas;
	private Long idPropriedadesEletromagneticas;
	private Long idPropriedadesDiversas;
	private Long idCelulaCristalina;
	private Long idDescoberta;
	
	@Inject
	private ElementoService elementoService;	
	@Inject
	private PropriedadesAtomicasService propriedadesAtomicasService;	
	@Inject
	private PropriedadesEletromagneticasService propriedadesEletromagneticasService;	
	@Inject
	private PropriedadesFisicasService propriedadesFisicasService;	
	@Inject
	private PropriedadesDiversasService propriedadesDiversasService;
	@Inject
	private CelulaCristalinaService celulaCristalinaService;
	@Inject
	private DescobertaService descobertaService;
	
	public void inicializar() {
		
		System.out.println("Cadastro elemento init da classe elemento");
		
		if (idElemento != null) {
			elemento = elementoService.porId(idElemento);
			
			if(idPropriedadesFisicas != null) {
				propriedadesFisicas = propriedadesFisicasService.porId(idPropriedadesFisicas);
			}
			
			if(idPropriedadesAtomicas != null) {
				propriedadesAtomicas = propriedadesAtomicasService.porId(idPropriedadesAtomicas);
			}
			
			if(idPropriedadesDiversas != null) {
				propriedadesDiversas = propriedadesDiversasService.porId(idPropriedadesDiversas);
			}
			
			if(idPropriedadesEletromagneticas != null) {
				propriedadesEletromagneticas = propriedadesEletromagneticasService.porId(idPropriedadesEletromagneticas);
			}
			
			if(idCelulaCristalina != null) {
				celulaCristalina = celulaCristalinaService.porId(idCelulaCristalina);
			}
			
			if(idDescoberta != null) {
				descoberta = descobertaService.porId(idDescoberta);
			}
		}
	}
	
	
	public String salvar() {
		
		System.out.println("Descoberta: " + descoberta);
		
		System.out.println("Descoberta descobrifor: " + descoberta.getDescobridor());
		
//		descoberta.setDescricao("descri��o for�ada");
		
//		descobertaService.salvar(descoberta);	
		
		
		celulaCristalina.setParametrosGradeC("teste grade C");
		celulaCristalina.setParametrosGradeA("teste grade a");
		celulaCristalina.setEstruturaGrade("estrutura grade");
//		celulaCristalinaService.salvar(celulaCristalina);
		
		elemento.setDescoberta(descoberta);
		elemento.setPropriedadesAtomicas(propriedadesAtomicas);
		elemento.setPropriedadesEletromagneticas(propriedadesEletromagneticas);
		elemento.setCelulaCristalina(celulaCristalina);
		elemento.setPropriedadesFisicas(propriedadesFisicas);
		elemento.setPropriedadesDiversas(propriedadesDiversas);
		
		System.out.println("Elemento: " + elemento);
		elementoService.salvar(elemento);
		
		
		return "lista-elementos.xhtml?faces-redirect=true";
	}
	
	public String excluir() {
		
		elementoService.excluir(elemento);
//		descobertaService.excluir(descoberta);
		
		return "lista-elementos.xhtml?faces-redirect=true";
	}


	public Elemento getElemento() {
		System.out.println("entrou em get elemento...");
		return elemento;
	}


	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public Long getIdElemento() {
		return idElemento;
	}

	public void setIdElemento(Long idElemento) {
		this.idElemento = idElemento;
	}

	public PropriedadesFisicas getPropriedadesFisicas() {
		return propriedadesFisicas;
	}

	public void setPropriedadesFisicas(PropriedadesFisicas propriedadesFisicas) {
		this.propriedadesFisicas = propriedadesFisicas;
	}

	public PropriedadesAtomicas getPropriedadesAtomicas() {
		return propriedadesAtomicas;
	}
	
	public void setPropriedadesAtomicas(PropriedadesAtomicas propriedadesAtomicas) {
		this.propriedadesAtomicas = propriedadesAtomicas;
	}

	public PropriedadesEletromagneticas getPropriedadesEletromagneticas() {
		return propriedadesEletromagneticas;
	}

	public void setPropriedadesEletromagneticas(PropriedadesEletromagneticas propriedadesEletromagneticas) {
		this.propriedadesEletromagneticas = propriedadesEletromagneticas;
	}

	public PropriedadesDiversas getPropriedadesDiversas() {
		return propriedadesDiversas;
	}

	public void setPropriedadesDiversas(PropriedadesDiversas propriedadesDiversas) {
		this.propriedadesDiversas = propriedadesDiversas;
	}

	public CelulaCristalina getCelulaCristalina() {
		return celulaCristalina;
	}

	public void setCelulaCristalina(CelulaCristalina celulaCristalina) {
		this.celulaCristalina = celulaCristalina;
	}

	public Descoberta getDescoberta() {
		return descoberta;
	}

	public void setDescoberta(Descoberta descoberta) {
		this.descoberta = descoberta;
	}

	public Long getIdPropriedadesFisicas() {
		return idPropriedadesFisicas;
	}

	public void setIdPropriedadesFisicas(Long idPropriedadesFisicas) {
		this.idPropriedadesFisicas = idPropriedadesFisicas;
	}

	public Long getIdPropriedadesAtomicas() {
		return idPropriedadesAtomicas;
	}

	public void setIdPropriedadesAtomicas(Long idPropriedadesAtomicas) {
		this.idPropriedadesAtomicas = idPropriedadesAtomicas;
	}

	public Long getIdPropriedadesEletromagneticas() {
		return idPropriedadesEletromagneticas;
	}

	public void setIdPropriedadesEletromagneticas(Long idPropriedadesEletromagneticas) {
		this.idPropriedadesEletromagneticas = idPropriedadesEletromagneticas;
	}

	public Long getIdPropriedadesDiversas() {
		return idPropriedadesDiversas;
	}

	public void setIdPropriedadesDiversas(Long idPropriedadesDiversas) {
		this.idPropriedadesDiversas = idPropriedadesDiversas;
	}

	public Long getIdCelulaCristalina() {
		return idCelulaCristalina;
	}

	public void setIdCelulaCristalina(Long idCelulaCristalina) {
		this.idCelulaCristalina = idCelulaCristalina;
	}

	public Long getIdDescoberta() {
		return idDescoberta;
	}

	public void setIdDescoberta(Long idDescoberta) {
		this.idDescoberta = idDescoberta;
	}	
	

}
