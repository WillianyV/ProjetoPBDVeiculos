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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@Table(name="CONTROLE_FINANCEIRO")
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
    @JoinColumn(name = "Id_Usuario", nullable = false)
    private UsuarioBean fk_usuario;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Formas_Pagamento", nullable = false)
    private FormasPagamentosBean fk_formas_pagamento;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Locacao", nullable = false)
    private LocacaoBean fk_locacao;

    public ControleFinanceiroBean() {
    }

    public ControleFinanceiroBean(String descricao, float valor, Date dataFincanceiro, String tipo, UsuarioBean fk_usuario, FormasPagamentosBean fk_formas_pagamento, LocacaoBean fk_locacao) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataFincanceiro = dataFincanceiro;
        this.tipo = tipo;
        this.fk_usuario = fk_usuario;
        this.fk_formas_pagamento = fk_formas_pagamento;
        this.fk_locacao = fk_locacao;
    }

    @Override
    public String toString() {
        return "ControleFinanceiroBean{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", dataFincanceiro=" + dataFincanceiro + ", tipo=" + tipo + ", fk_usuario=" + fk_usuario + ", fk_formas_pagamento=" + fk_formas_pagamento + ", fk_locacao=" + fk_locacao + '}';
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

    public UsuarioBean getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(UsuarioBean fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public FormasPagamentosBean getFk_formas_pagamento() {
        return fk_formas_pagamento;
    }

    public void setFk_formas_pagamento(FormasPagamentosBean fk_formas_pagamento) {
        this.fk_formas_pagamento = fk_formas_pagamento;
    }

    public LocacaoBean getFk_locacao() {
        return fk_locacao;
    }

    public void setFk_locacao(LocacaoBean fk_locacao) {
        this.fk_locacao = fk_locacao;
    }


}
