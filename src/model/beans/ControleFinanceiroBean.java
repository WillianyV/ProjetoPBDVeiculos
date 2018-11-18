/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_controle_financeiro", sequenceName = "controle_financeiro_seq", initialValue = 1, allocationSize = 1)
public class ControleFinanceiroBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_controle_financeiro")
    private Integer id;
    private String descricao;
    @Column(nullable = false)
    private float valor;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFincanceiro;
    @Column(nullable = false)
    private String tipo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_usuario", nullable = false)
    private UsuarioBean fkUsuario;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_formas_pagamento", nullable = false)
    private FormasPagamentosBean fkFormasPagamentos;

    public ControleFinanceiroBean() {
    }

    public ControleFinanceiroBean(float valor, String tipo, UsuarioBean fkUsuario, FormasPagamentosBean fkFormasPagamentos) {
        this.valor = valor;
        this.tipo = tipo;
        this.fkUsuario = fkUsuario;
        this.fkFormasPagamentos = fkFormasPagamentos;
    }

    public ControleFinanceiroBean(String descricao, float valor, Date dataFincanceiro, String tipo, UsuarioBean fkUsuario, FormasPagamentosBean fkFormasPagamentos) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataFincanceiro = dataFincanceiro;
        this.tipo = tipo;
        this.fkUsuario = fkUsuario;
        this.fkFormasPagamentos = fkFormasPagamentos;
    }

    @Override
    public String toString() {
        return "ControleFinanceiroBean{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", dataFincanceiro=" + dataFincanceiro + ", tipo=" + tipo + ", fkUsuario=" + fkUsuario + ", fkFormasPagamentos=" + fkFormasPagamentos + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataFincanceiro() {
        return dataFincanceiro;
    }

    public void setDataFincanceiro(Date dataFincanceiro) {
        this.dataFincanceiro = dataFincanceiro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public UsuarioBean getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(UsuarioBean fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public FormasPagamentosBean getFkFormasPagamentos() {
        return fkFormasPagamentos;
    }

    public void setFkFormasPagamentos(FormasPagamentosBean fkFormasPagamentos) {
        this.fkFormasPagamentos = fkFormasPagamentos;
    }
        
}
