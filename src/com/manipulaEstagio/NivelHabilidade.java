package com.manipulaEstagio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table ( name = "nivel_habilidade")
public class NivelHabilidade implements Serializable{
	@Column ( name = "id_nivel_habilidade" )
	int id_nivel_habilidade;
	@Column ( name = "ds_nivel_habilidade" )
	String desc_nivel_habilidade;
	
	public int getId_nivel_habilidade() {
		return id_nivel_habilidade;
	}
	public void setId_nivel_habilidade(int id_nivel_habilidade) {
		this.id_nivel_habilidade = id_nivel_habilidade;
	}
	public String getDesc_nivel_habilidade() {
		return desc_nivel_habilidade;
	}
	public void setDesc_nivel_habilidade(String desc_nivel_habilidade) {
		this.desc_nivel_habilidade = desc_nivel_habilidade;
	}
	@Override
	public String toString() {
		return id_nivel_habilidade+ ", " + desc_nivel_habilidade;
	}
	
	

}
