/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
    private String forma_pagamento;
    @ManyToOne()
    @JoinColumn(name = "Id_Usuario")
    private UsuarioBean fk_usuario;
    @ManyToOne()
    @JoinColumn(name = "Id_Locacao")
    private LocacaoBean fk_locacao;

    public ControleFinanceiroBean() {
    }

    public ControleFinanceiroBean(String descricao, float valor, Date dataFincanceiro, String tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataFincanceiro = dataFincanceiro;
        this.tipo = tipo;
    }

    public ControleFinanceiroBean(String descricao, float valor, Date dataFincanceiro, String tipo, String forma_pagamento, UsuarioBean fk_usuario, LocacaoBean fk_locacao) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataFincanceiro = dataFincanceiro;
        this.tipo = tipo;
        this.forma_pagamento = forma_pagamento;
        this.fk_usuario = fk_usuario;
        this.fk_locacao = fk_locacao;
    }
    
    @Override
    public String toString() {
        return "ControleFinanceiroBean{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", dataFincanceiro=" + dataFincanceiro + ", tipo=" + tipo + ", forma_pagamento=" + forma_pagamento + ", fk_usuario=" + fk_usuario + ", fk_locacao=" + fk_locacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.descricao);
        hash = 23 * hash + Float.floatToIntBits(this.valor);
        hash = 23 * hash + Objects.hashCode(this.dataFincanceiro);
        hash = 23 * hash + Objects.hashCode(this.tipo);
        hash = 23 * hash + Objects.hashCode(this.forma_pagamento);
        hash = 23 * hash + Objects.hashCode(this.fk_usuario);
        hash = 23 * hash + Objects.hashCode(this.fk_locacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControleFinanceiroBean other = (ControleFinanceiroBean) obj;
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.forma_pagamento, other.forma_pagamento)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataFincanceiro, other.dataFincanceiro)) {
            return false;
        }
        if (!Objects.equals(this.fk_usuario, other.fk_usuario)) {
            return false;
        }
        if (!Objects.equals(this.fk_locacao, other.fk_locacao)) {
            return false;
        }
        return true;
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

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public UsuarioBean getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(UsuarioBean fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public LocacaoBean getFk_locacao() {
        return fk_locacao;
    }

    public void setFk_locacao(LocacaoBean fk_locacao) {
        this.fk_locacao = fk_locacao;
    }


}
