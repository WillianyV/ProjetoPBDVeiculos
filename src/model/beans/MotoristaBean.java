/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_motorista", sequenceName = "motorista_seq", initialValue = 1, allocationSize = 1)
public class MotoristaBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_motorista")
    private Integer id;
    private String nome;
    @Column(nullable = false, length = 20) 
    private String CNH;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false)
    private Date dataVencimentoCHN, DN;

    public MotoristaBean() {
    }

    public MotoristaBean(String CNH, Date dataVencimentoCHN, Date DN) {
        this.CNH = CNH;
        this.dataVencimentoCHN = dataVencimentoCHN;
        this.DN = DN;
    }

    public MotoristaBean(String nome, String CNH, Date dataVencimentoCHN, Date DN) {
        this.nome = nome;
        this.CNH = CNH;
        this.dataVencimentoCHN = dataVencimentoCHN;
        this.DN = DN;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.CNH);
        hash = 41 * hash + Objects.hashCode(this.dataVencimentoCHN);
        hash = 41 * hash + Objects.hashCode(this.DN);
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
        final MotoristaBean other = (MotoristaBean) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.CNH, other.CNH)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataVencimentoCHN, other.dataVencimentoCHN)) {
            return false;
        }
        if (!Objects.equals(this.DN, other.DN)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MotoristaBean{" + "id=" + id + ", nome=" + nome + ", CNH=" + CNH + ", dataVencimentoCHN=" + dataVencimentoCHN + ", DN=" + DN + '}';
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

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public Date getDataVencimentoCHN() {
        return dataVencimentoCHN;
    }

    public void setDataVencimentoCHN(Date dataVencimentoCHN) {
        this.dataVencimentoCHN = dataVencimentoCHN;
    }

    public Date getDN() {
        return DN;
    }

    public void setDN(Date DN) {
        this.DN = DN;
    }
    
}
