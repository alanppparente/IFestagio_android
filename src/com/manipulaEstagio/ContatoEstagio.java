package com.manipulaEstagio;

public class ContatoEstagio {
	
	int id_contato_estagio;
	String desc_contato_estagio;
	public int getId_contato_estagio() {
		return id_contato_estagio;
	}
	public void setId_contato_estagio(int id_contato_estagio) {
		this.id_contato_estagio = id_contato_estagio;
	}
	public String getDesc_contato_estagio() {
		return desc_contato_estagio;
	}
	public void setDesc_contato_estagio(String desc_contato_estagio) {
		this.desc_contato_estagio = desc_contato_estagio;
	}
	@Override
	public String toString() {
		return "ContatoEstagio [id_contato_estagio=" + id_contato_estagio
				+ ", desc_contato_estagio=" + desc_contato_estagio + "]";
	}
	
	

}
