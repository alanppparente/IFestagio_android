/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manipulaUsuario;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 *
 * @author Keylla
 */
@Entity
@Table ( name = "rede_social")
public class RedeSocial implements Serializable{
	@Column ( name = "id_rede_social" )
    private int id_rede_social;
	@Column ( name = "tipo_rede_social_id_tipo_rede_social" )
    private int id_tp_rede_social;
	@Column ( name = "ds_rede_social" )
    private String des_rede_social;

    public int getId_rede_social() {
        return id_rede_social;
    }

    public void setId_rede_social(int id_rede_social) {
        this.id_rede_social = id_rede_social;
    }

    public int getId_tp_rede_social() {
        return id_tp_rede_social;
    }

    public void setId_tp_rede_social(int id_tp_rede_social) {
        this.id_tp_rede_social = id_tp_rede_social;
    }

    public String getDes_rede_social() {
        return des_rede_social;
    }

    public void setDes_rede_social(String des_rede_social) {
        this.des_rede_social = des_rede_social;
    }

    @Override
    public String toString() {
        return id_rede_social + ", " + id_tp_rede_social + ", " + des_rede_social;
    }
    
    
}
