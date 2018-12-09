package br.com.tcc.crud.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PropriedadesFisicas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String numeroAtomico;
	
	private BigDecimal pesoAtomico;
	
	private BigDecimal densidade;
	
	private BigDecimal pontoFusao;
	
	private BigDecimal pontoEbulicao;
	
	private String fase;
	
	private Integer periodo;
	
	private String grupo;
	
	private String quadra;
	
	private String entalpiaFusao;
	
	private String volumeMolar;
	
	private String pressaoVapor;
	
	
	
	public boolean isInclusao() {
		return getId() == null ? true : false;
	}
	
	public boolean isEdicao() {
		return !isInclusao();
	}
	

	public String getNumeroAtomico() {
		return numeroAtomico;
	}

	public void setNumeroAtomico(String numeroAtomico) {
		this.numeroAtomico = numeroAtomico;
	}

	public BigDecimal getPesoAtomico() {
		return pesoAtomico;
	}

	public void setPesoAtomico(BigDecimal pesoAtomico) {
		this.pesoAtomico = pesoAtomico;
	}

	public BigDecimal getDensidade() {
		return densidade;
	}

	public void setDensidade(BigDecimal densidade) {
		this.densidade = densidade;
	}

	public BigDecimal getPontoFusao() {
		return pontoFusao;
	}

	public void setPontoFusao(BigDecimal pontoFusao) {
		this.pontoFusao = pontoFusao;
	}

	public BigDecimal getPontoEbulicao() {
		return pontoEbulicao;
	}

	public void setPontoEbulicao(BigDecimal pontoEbulicao) {
		this.pontoEbulicao = pontoEbulicao;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEntalpiaFusao() {
		return entalpiaFusao;
	}

	public void setEntalpiaFusao(String entalpiaFusao) {
		this.entalpiaFusao = entalpiaFusao;
	}

	public String getVolumeMolar() {
		return volumeMolar;
	}

	public void setVolumeMolar(String volumeMolar) {
		this.volumeMolar = volumeMolar;
	}

	public String getPressaoVapor() {
		return pressaoVapor;
	}

	public void setPressaoVapor(String pressaoVapor) {
		this.pressaoVapor = pressaoVapor;
	}
	
	
	

		
}
