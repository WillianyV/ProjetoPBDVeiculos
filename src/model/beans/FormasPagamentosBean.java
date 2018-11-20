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
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name="FORMAS_DE_PAGAMENTO")
@SequenceGenerator(name = "sequencia_formas_pagamento", sequenceName = "formas_pagamento_seq", initialValue = 1, allocationSize = 1)
public class FormasPagamentosBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_formas_pagamento")
    private Integer id;
    @Column(length = 50)
    private String tipo;
    private int n_parcelas;

    public FormasPagamentosBean() {
    }

    public FormasPagamentosBean(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "FormasPagamentosBean{" + "id=" + id + ", tipo=" + tipo + ", n_parcelas=" + n_parcelas + '}';
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

    public int getN_parcelas() {
        return n_parcelas;
    }

    public void setN_parcelas(int n_parcelas) {
        this.n_parcelas = n_parcelas;
    }

}
