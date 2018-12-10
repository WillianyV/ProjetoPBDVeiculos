/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name="SEDE_FILIAL")
@SequenceGenerator(name = "sequencia_empresa", sequenceName = "empresa_seq", initialValue = 1, allocationSize = 1)
public class SedeFilialBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_empresa")
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(length = 20)
    private String tipo, CNPJ;
    @Column(nullable = false)
    private boolean status;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Endereco")
    private EnderecoBean fk_endereco;

    public SedeFilialBean() {
    }

    public SedeFilialBean(String nome, EnderecoBean fk_endereco) {
        this.nome = nome;
        this.fk_endereco = fk_endereco;
    }

    public SedeFilialBean(String nome, String tipo, String CNPJ, boolean status, EnderecoBean fk_endereco) {
        this.nome = nome;
        this.tipo = tipo;
        this.CNPJ = CNPJ;
        this.status = status;
        this.fk_endereco = fk_endereco;
    }

    @Override
    public String toString() {
        return "SedeFilialBean{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", CNPJ=" + CNPJ + ", status=" + status + ", fk_endereco=" + fk_endereco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.tipo);
        hash = 13 * hash + Objects.hashCode(this.CNPJ);
        hash = 13 * hash + (this.status ? 1 : 0);
        hash = 13 * hash + Objects.hashCode(this.fk_endereco);
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
        final SedeFilialBean other = (SedeFilialBean) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fk_endereco, other.fk_endereco)) {
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public EnderecoBean getFk_endereco() {
        return fk_endereco;
    }

    public void setFk_endereco(EnderecoBean fk_endereco) {
        this.fk_endereco = fk_endereco;
    }
    
}
