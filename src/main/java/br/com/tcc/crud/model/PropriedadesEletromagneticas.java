package br.com.tcc.crud.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class PropriedadesEletromagneticas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal propriedades;
	
	private BigDecimal condutividadeEletrica;
	
	private BigDecimal condutividadeTermica;
	
	private String tipoEletrico;
	
	private String tipoMagnetico;
	
	private BigDecimal sensibilidadeMagneticaVolume;
	
	private BigDecimal sensibilidadeMagneticaMassa;
	
	private BigDecimal sensibilidadeMagnetica;
	
	private BigDecimal resistividade;
	
	private String pontoSuperconducao;
	
	
	public boolean isInclusao() {
		return getId() == null ? true : false;
	}
	
	public boolean isEdicao() {
		return !isInclusao();
	}
	
	

	public BigDecimal getPropriedades() {
		return propriedades;
	}

	public void setPropriedades(BigDecimal propriedades) {
		this.propriedades = propriedades;
	}

	public BigDecimal getCondutividadeEletrica() {
		return condutividadeEletrica;
	}

	public void setCondutividadeEletrica(BigDecimal condutividadeEletrica) {
		this.condutividadeEletrica = condutividadeEletrica;
	}

	public String getTipoEletrico() {
		return tipoEletrico;
	}

	public void setTipoEletrico(String tipoEletrico) {
		this.tipoEletrico = tipoEletrico;
	}

	public String getTipoMagnetico() {
		return tipoMagnetico;
	}

	public void setTipoMagnetico(String tipoMagnetico) {
		this.tipoMagnetico = tipoMagnetico;
	}

	public BigDecimal getSensibilidadeMagneticaVolume() {
		return sensibilidadeMagneticaVolume;
	}

	public void setSensibilidadeMagneticaVolume(BigDecimal sensibilidadeMagneticaVolume) {
		this.sensibilidadeMagneticaVolume = sensibilidadeMagneticaVolume;
	}

	public BigDecimal getSensibilidadeMagneticaMassa() {
		return sensibilidadeMagneticaMassa;
	}

	public void setSensibilidadeMagneticaMassa(BigDecimal sensibilidadeMagneticaMassa) {
		this.sensibilidadeMagneticaMassa = sensibilidadeMagneticaMassa;
	}

	public BigDecimal getSensibilidadeMagnetica() {
		return sensibilidadeMagnetica;
	}

	public void setSensibilidadeMagnetica(BigDecimal sensibilidadeMagnetica) {
		this.sensibilidadeMagnetica = sensibilidadeMagnetica;
	}

	public BigDecimal getResistividade() {
		return resistividade;
	}

	public void setResistividade(BigDecimal resistividade) {
		this.resistividade = resistividade;
	}

	public String getPontoSuperconducao() {
		return pontoSuperconducao;
	}

	public void setPontoSuperconducao(String pontoSuperconducao) {
		this.pontoSuperconducao = pontoSuperconducao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getCondutividadeTermica() {
		return condutividadeTermica;
	}

	public void setCondutividadeTermica(BigDecimal condutividadeTermica) {
		this.condutividadeTermica = condutividadeTermica;
	}
	
	
		
}
