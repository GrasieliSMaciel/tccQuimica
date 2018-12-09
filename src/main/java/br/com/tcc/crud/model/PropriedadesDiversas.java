package br.com.tcc.crud.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PropriedadesDiversas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal numeroAtomico;
	
	private BigDecimal eletronegatividade;
	
	private BigDecimal calorEspecifico;
	
	private BigDecimal potencialIonizacao1;
	
	private BigDecimal potencialIonizacao2;
	
	private BigDecimal potencialIonizacao3;
	
	private BigDecimal potencialIonizacao4;
	
	private BigDecimal potencialIonizacao5;
	
	private BigDecimal potencialIonizacao6;
	
	private BigDecimal potencialIonizacao7;
	
	private BigDecimal potencialIonizacao8;
	
	
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

	public BigDecimal getNumeroAtomico() {
		return numeroAtomico;
	}

	public void setNumeroAtomico(BigDecimal numeroAtomico) {
		this.numeroAtomico = numeroAtomico;
	}

	public BigDecimal getEletronegatividade() {
		return eletronegatividade;
	}

	public void setEletronegatividade(BigDecimal eletronegatividade) {
		this.eletronegatividade = eletronegatividade;
	}

	public BigDecimal getCalorEspecifico() {
		return calorEspecifico;
	}

	public void setCalorEspecifico(BigDecimal calorEspecifico) {
		this.calorEspecifico = calorEspecifico;
	}

	public BigDecimal getPotencialIonizacao1() {
		return potencialIonizacao1;
	}

	public void setPotencialIonizacao1(BigDecimal potencialIonizacao1) {
		this.potencialIonizacao1 = potencialIonizacao1;
	}

	public BigDecimal getPotencialIonizacao2() {
		return potencialIonizacao2;
	}

	public void setPotencialIonizacao2(BigDecimal potencialIonizacao2) {
		this.potencialIonizacao2 = potencialIonizacao2;
	}

	public BigDecimal getPotencialIonizacao3() {
		return potencialIonizacao3;
	}

	public void setPotencialIonizacao3(BigDecimal potencialIonizacao3) {
		this.potencialIonizacao3 = potencialIonizacao3;
	}

	public BigDecimal getPotencialIonizacao4() {
		return potencialIonizacao4;
	}

	public void setPotencialIonizacao4(BigDecimal potencialIonizacao4) {
		this.potencialIonizacao4 = potencialIonizacao4;
	}

	public BigDecimal getPotencialIonizacao5() {
		return potencialIonizacao5;
	}

	public void setPotencialIonizacao5(BigDecimal potencialIonizacao5) {
		this.potencialIonizacao5 = potencialIonizacao5;
	}

	public BigDecimal getPotencialIonizacao6() {
		return potencialIonizacao6;
	}

	public void setPotencialIonizacao6(BigDecimal potencialIonizacao6) {
		this.potencialIonizacao6 = potencialIonizacao6;
	}

	public BigDecimal getPotencialIonizacao7() {
		return potencialIonizacao7;
	}

	public void setPotencialIonizacao7(BigDecimal potencialIonizacao7) {
		this.potencialIonizacao7 = potencialIonizacao7;
	}

	public BigDecimal getPotencialIonizacao8() {
		return potencialIonizacao8;
	}

	public void setPotencialIonizacao8(BigDecimal potencialIonizacao8) {
		this.potencialIonizacao8 = potencialIonizacao8;
	}




		
}
