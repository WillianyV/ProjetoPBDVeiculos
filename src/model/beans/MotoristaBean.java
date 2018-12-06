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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@Table(name="MOTORISTA")
@SequenceGenerator(name = "sequencia_motorista", sequenceName = "motorista_seq", initialValue = 1, allocationSize = 1)
public class MotoristaBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_motorista")
    private Integer id;
    private String nome;
    @Column(nullable = false)
    private boolean status;
    @Column(nullable = false, length = 20, unique = true) 
    private String CNH;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false)
    private Date data_vencimento_CHN, DN;

    public MotoristaBean() {
    }

    public MotoristaBean(String CNH, Date data_vencimento_CHN, Date DN) {
        this.CNH = CNH;
        this.data_vencimento_CHN = data_vencimento_CHN;
        this.DN = DN;
    }

    public MotoristaBean(String nome, boolean status, String CNH, Date data_vencimento_CHN, Date DN) {
        this.nome = nome;
        this.status = status;
        this.CNH = CNH;
        this.data_vencimento_CHN = data_vencimento_CHN;
        this.DN = DN;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.CNH);
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
        if (!Objects.equals(this.CNH, other.CNH)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MotoristaBean{" + "id=" + id + ", nome=" + nome + ", CNH=" + CNH + ", data_vencimento_CHN=" + data_vencimento_CHN + ", DN=" + DN + '}';
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

    public Date getData_vencimento_CHN() {
        return data_vencimento_CHN;
    }

    public void setData_vencimento_CHN(Date data_vencimento_CHN) {
        this.data_vencimento_CHN = data_vencimento_CHN;
    }

    public Date getDN() {
        return DN;
    }

    public void setDN(Date DN) {
        this.DN = DN;
    }
    
}
