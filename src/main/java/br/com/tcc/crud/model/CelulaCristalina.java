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
public class CelulaCristalina  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String estruturaGrade;
	
	private String parametrosGradeA;
	
	private String parametrosGradeC;
	
	private BigDecimal atitudeCA;
	
	private BigDecimal temperaturaDebye;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstruturaGrade() {
		return estruturaGrade;
	}

	public void setEstruturaGrade(String estruturaGrade) {
		this.estruturaGrade = estruturaGrade;
	}

	public String getParametrosGradeA() {
		return parametrosGradeA;
	}

	public void setParametrosGradeA(String parametrosGradeA) {
		this.parametrosGradeA = parametrosGradeA;
	}

	public String getParametrosGradeC() {
		return parametrosGradeC;
	}

	public void setParametrosGradeC(String parametrosGradeC) {
		this.parametrosGradeC = parametrosGradeC;
	}

	public BigDecimal getAtitudeCA() {
		return atitudeCA;
	}

	public void setAtitudeCA(BigDecimal atitudeCA) {
		this.atitudeCA = atitudeCA;
	}

	public BigDecimal getTemperaturaDebye() {
		return temperaturaDebye;
	}

	public void setTemperaturaDebye(BigDecimal temperaturaDebye) {
		this.temperaturaDebye = temperaturaDebye;
	}

	

//	@ManyToOne
//	@JoinColumn(nullable = false)
//	private Cidade cidade;
//	public Cidade getCidade() {
//		return cidade;
//	}
//
//	public void setCidade(Cidade cidade) {
//		this.cidade = cidade;
//	}
		
}
