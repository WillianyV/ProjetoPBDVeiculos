/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_formas_pagamento", sequenceName = "formas_pagamento_seq", initialValue = 1, allocationSize = 1)
public class FormasPagamentosBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_formas_pagamento")
    private Integer id;
    @Column(length = 50)
    private String tipo;
    private int nParcelas;

    public FormasPagamentosBean() {
    }

    public FormasPagamentosBean(String tipo) {
        this.tipo = tipo;
    }

    public FormasPagamentosBean(String tipo, int nParcelas) {
        this.tipo = tipo;
        this.nParcelas = nParcelas;
    }
    
    @Override
    public String toString() {
        return "FormasPagamentosBean{" + "id=" + id + ", tipo=" + tipo + ", nParcelas=" + nParcelas + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnParcelas() {
        return nParcelas;
    }

    public void setnParcelas(int nParcelas) {
        this.nParcelas = nParcelas;
    }
    
}
