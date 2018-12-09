//package br.com.tcc.crud.mb;
//
//import java.io.Serializable;
//
//import javax.faces.view.ViewScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
//
//import br.com.tcc.crud.model.Substancia;
//import br.com.tcc.crud.service.SubstanciaService;
//
//@Named
//@ViewScoped
//public class CadastroSubstanciaMB implements Serializable{
//
//	private static final long serialVersionUID = 1L;
//	
//	private Substancia substancia = new Substancia();
//	
//	private Long idSubstancia;
//	
//	@Inject
//	private SubstanciaService substanciaService;	
//
//	
//	public void inicializar() {
//		
//		System.out.println("Cadastro substancia init da classe substancia");
//		
//		if (idSubstancia != null) {
//			substancia = substanciaService.porId(idSubstancia);
//			
//
//		}
//	}
//	
//	
//	public String salvar() {
//		
//		
//		System.out.println("Substancia: " + substancia);
//		substanciaService.salvar(substancia);
//		
//		
//		return "lista-substancias.xhtml?faces-redirect=true";
//	}
//	
//	public String excluir() {
//		
//		substanciaService.excluir(substancia);
//		
//		return "lista-substancias.xhtml?faces-redirect=true";
//	}
//
//	
//
//	
//
//}
