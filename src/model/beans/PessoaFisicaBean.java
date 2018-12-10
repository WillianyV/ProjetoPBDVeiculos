/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@Table(name="CLIENTE_PESSOA_FISICA")
public class PessoaFisicaBean extends ClienteBean{
 
    @Column(nullable = false,length = 15, unique = true)
    private String CPF;
    @Column(length = 10)
    private String sexo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DN;
    
    public PessoaFisicaBean() {
    }

    public PessoaFisicaBean(String CPF, String nome, boolean status, EnderecoBean fk_endereco) {
        super(nome, status, fk_endereco);
        this.CPF = CPF;
    }

    public PessoaFisicaBean(String CPF, String sexo, Date DN, String nome, boolean status, EnderecoBean fk_endereco) {
        super(nome, status, fk_endereco);
        this.CPF = CPF;
        this.sexo = sexo;
        this.DN = DN;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.CPF);
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
        final PessoaFisicaBean other = (PessoaFisicaBean) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaFisicaBean{" + "CPF=" + CPF + ", sexo=" + sexo + ", DN=" + DN + '}';
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDN() {
        return DN;
    }

    public void setDN(Date DN) {
        this.DN = DN;
    }

    
}
