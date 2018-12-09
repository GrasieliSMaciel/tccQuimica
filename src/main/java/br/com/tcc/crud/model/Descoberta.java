package br.com.tcc.crud.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Descoberta  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Column(length = 500)
	private String descobridor;
	
	
	private String descricao;

	
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescobridor() {
		return descobridor;
	}

	public void setDescobridor(String descobridor) {
		this.descobridor = descobridor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
