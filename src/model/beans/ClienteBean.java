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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Endereco", nullable = false)
    private EnderecoBean fk_endereco;

    public ClienteBean() {
    }

    public ClienteBean(String nome, EnderecoBean fk_endereco) {
        this.nome = nome;
        this.fk_endereco = fk_endereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.nome);
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
        return true;
    }

    @Override
    public String toString() {
        return "ClienteBean{" + "id=" + id + ", nome=" + nome + ", fk_endereco=" + fk_endereco + '}';
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
}
