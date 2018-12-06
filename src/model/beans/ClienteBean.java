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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name="CLIENTE")
@SequenceGenerator(name = "sequencia_cliente", sequenceName = "cliente_seq", initialValue = 1, allocationSize = 1)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ClienteBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_cliente")
    private Integer id;
    
    @Column(nullable = false)
    private String nome;
    
    private boolean status;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Endereco")
    private EnderecoBean fk_endereco;
    
    public ClienteBean() {
    }

    public ClienteBean(String nome, boolean status, EnderecoBean fk_endereco) {
        this.nome = nome;
        this.status = status;
        this.fk_endereco = fk_endereco;
    }
    
    @Override
    public String toString() {
        return "ClienteBean{" + "id=" + id + ", nome=" + nome + ", fk_endereco=" + fk_endereco + ", status=" + status + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.fk_endereco);
        hash = 89 * hash + (this.status ? 1 : 0);
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
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
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

    public EnderecoBean getFk_endereco() {
        return fk_endereco;
    }

    public void setFk_endereco(EnderecoBean fk_endereco) {
        this.fk_endereco = fk_endereco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
