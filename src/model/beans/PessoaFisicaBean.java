/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
public class PessoaFisicaBean extends ClienteBean{
 
    @Column(nullable = false,length = 15)
    private String CPF;
    @Column(length = 10)
    private String sexo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DN;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Motorista", nullable = false)
    private MotoristaBean fkMotorista;

    public PessoaFisicaBean() {
    }

    public PessoaFisicaBean(String CPF, MotoristaBean fkMotorista) {
        this.CPF = CPF;
        this.fkMotorista = fkMotorista;
    }

    public PessoaFisicaBean(String CPF, MotoristaBean fkMotorista, String nome, EnderecoBean fkEndereco) {
        super(nome, fkEndereco);
        this.CPF = CPF;
        this.fkMotorista = fkMotorista;
    }

    public PessoaFisicaBean(String CPF, String sexo, Date DN, MotoristaBean fkMotorista, String nome, EnderecoBean fkEndereco) {
        super(nome, fkEndereco);
        this.CPF = CPF;
        this.sexo = sexo;
        this.DN = DN;
        this.fkMotorista = fkMotorista;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.CPF);
        hash = 67 * hash + Objects.hashCode(this.sexo);
        hash = 67 * hash + Objects.hashCode(this.DN);
        hash = 67 * hash + Objects.hashCode(this.fkMotorista);
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
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.DN, other.DN)) {
            return false;
        }
        if (!Objects.equals(this.fkMotorista, other.fkMotorista)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaFisicaBean{" + "CPF=" + CPF + ", sexo=" + sexo + ", DN=" + DN + ", fkMotorista=" + fkMotorista + '}';
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

    public MotoristaBean getFkMotorista() {
        return fkMotorista;
    }

    public void setFkMotorista(MotoristaBean fkMotorista) {
        this.fkMotorista = fkMotorista;
    }
    
}
