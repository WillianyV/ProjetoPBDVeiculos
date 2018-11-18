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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_cliente", sequenceName = "usuario_cliente", initialValue = 1, allocationSize = 1)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ClienteBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_cliente")
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Edereco", nullable = false)
    private EnderecoBean fkEndereco;

     public ClienteBean() {
    }

    public ClienteBean(String nome, EnderecoBean fkEndereco) {
        this.nome = nome;
        this.fkEndereco = fkEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.fkEndereco);
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
        final ClienteBean other = (ClienteBean) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fkEndereco, other.fkEndereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClienteBean{" + "id=" + id + ", nome=" + nome + ", fkEndereco=" + fkEndereco + '}';
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

    public EnderecoBean getFkEndereco() {
        return fkEndereco;
    }

    public void setFkEndereco(EnderecoBean fkEndereco) {
        this.fkEndereco = fkEndereco;
    }
    
}
