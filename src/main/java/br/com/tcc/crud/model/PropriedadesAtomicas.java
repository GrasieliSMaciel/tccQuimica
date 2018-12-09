package br.com.tcc.crud.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PropriedadesAtomicas implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 255)
	private String propriedades;
	
	@Column(length = 400)
	private String descricao;
	
	@Column(length = 100)
	private String configuracaoEletronica;
	
	@Column(length = 50)
	private String estadosOxidacao;
	
	@Column(length = 50)
	private String cargaIons;
	
	@Column(length = 50)
	private String eletronsCamada;
	
	@Column(length = 20)
	private BigDecimal raioAtomico;
	
	@Column(length = 20)
	private BigDecimal raioCovalente;
	
	@Column(length = 20)
	private BigDecimal raioVanDerWaals;

	
	public boolean isInclusao() {
		return getId() == null ? true : false;
	}
	
	public boolean isEdicao() {
		return !isInclusao();
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPropriedades() {
		return propriedades;
	}

	public void setPropriedades(String propriedades) {
		this.propriedades = propriedades;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConfiguracaoEletronica() {
		return configuracaoEletronica;
	}

	public void setConfiguracaoEletronica(String configuracaoEletronica) {
		this.configuracaoEletronica = configuracaoEletronica;
	}

	public String getEstadosOxidacao() {
		return estadosOxidacao;
	}

	public void setEstadosOxidacao(String estadosOxidacao) {
		this.estadosOxidacao = estadosOxidacao;
	}

	public String getCargaIons() {
		return cargaIons;
	}

	public void setCargaIons(String cargaIons) {
		this.cargaIons = cargaIons;
	}

	public String getEletronsCamada() {
		return eletronsCamada;
	}

	public void setEletronsCamada(String eletronsCamada) {
		this.eletronsCamada = eletronsCamada;
	}

	public BigDecimal getRaioAtomico() {
		return raioAtomico;
	}

	public void setRaioAtomico(BigDecimal raioAtomico) {
		this.raioAtomico = raioAtomico;
	}

	public BigDecimal getRaioCovalente() {
		return raioCovalente;
	}

	public void setRaioCovalente(BigDecimal raioCovalente) {
		this.raioCovalente = raioCovalente;
	}

	public BigDecimal getRaioVanDerWaals() {
		return raioVanDerWaals;
	}

	public void setRaioVanDerWaals(BigDecimal raioVanDerWaals) {
		this.raioVanDerWaals = raioVanDerWaals;
	}
	
		
}
