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
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_usuario", sequenceName = "usuario_seq", initialValue = 1, allocationSize = 1)
public class UsuarioBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_usuario")
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(length = 30)
    private String CPF, RG, CTPS;
    @Column(nullable = false,length = 30)
    private String tipoUsuario, login, senha;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DN;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Edereco", nullable = false)
    private EnderecoBean fkEndereco;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Sede_Filial", nullable = false)
    private SedeFilialBean fkSedeFilial;

    public UsuarioBean() {
    }

    public UsuarioBean(String nome, String tipoUsuario, String login, String senha, EnderecoBean fkEndereco, SedeFilialBean fkSedeFilial) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
        this.login = login;
        this.senha = senha;
        this.fkEndereco = fkEndereco;
        this.fkSedeFilial = fkSedeFilial;
    }

    public UsuarioBean(String nome, String CPF, String RG, String CTPS, String tipoUsuario, String login, String senha, Date DN, EnderecoBean fkEndereco, SedeFilialBean fkSedeFilial) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.CTPS = CTPS;
        this.tipoUsuario = tipoUsuario;
        this.login = login;
        this.senha = senha;
        this.DN = DN;
        this.fkEndereco = fkEndereco;
        this.fkSedeFilial = fkSedeFilial;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.CPF);
        hash = 41 * hash + Objects.hashCode(this.RG);
        hash = 41 * hash + Objects.hashCode(this.CTPS);
        hash = 41 * hash + Objects.hashCode(this.tipoUsuario);
        hash = 41 * hash + Objects.hashCode(this.login);
        hash = 41 * hash + Objects.hashCode(this.senha);
        hash = 41 * hash + Objects.hashCode(this.DN);
        hash = 41 * hash + Objects.hashCode(this.fkEndereco);
        hash = 41 * hash + Objects.hashCode(this.fkSedeFilial);
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
        final UsuarioBean other = (UsuarioBean) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.RG, other.RG)) {
            return false;
        }
        if (!Objects.equals(this.CTPS, other.CTPS)) {
            return false;
        }
        if (!Objects.equals(this.tipoUsuario, other.tipoUsuario)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.DN, other.DN)) {
            return false;
        }
        if (!Objects.equals(this.fkEndereco, other.fkEndereco)) {
            return false;
        }
        if (!Objects.equals(this.fkSedeFilial, other.fkSedeFilial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsuarioBean{" + "id=" + id + ", nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + ", CTPS=" + CTPS + ", tipoUsuario=" + tipoUsuario + ", login=" + login + ", senha=" + senha + ", DN=" + DN + ", fkEndereco=" + fkEndereco + ", fkSedeFilial=" + fkSedeFilial + '}';
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDN() {
        return DN;
    }

    public void setDN(Date DN) {
        this.DN = DN;
    }

    public EnderecoBean getFkEndereco() {
        return fkEndereco;
    }

    public void setFkEndereco(EnderecoBean fkEndereco) {
        this.fkEndereco = fkEndereco;
    }

    public SedeFilialBean getFkSedeFilial() {
        return fkSedeFilial;
    }

    public void setFkSedeFilial(SedeFilialBean fkSedeFilial) {
        this.fkSedeFilial = fkSedeFilial;
    }
    
    
    
    
}
