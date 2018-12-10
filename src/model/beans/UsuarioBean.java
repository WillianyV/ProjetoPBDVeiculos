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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@Table(name="USUARIO")
@SequenceGenerator(name = "sequencia_usuario", sequenceName = "usuario_seq", initialValue = 1, allocationSize = 1)
public class UsuarioBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_usuario")
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private boolean status;
    @Column(length = 30)
    private String CPF, RG, CTPS;
    @Column(nullable = false,length = 30)
    private String tipo_usuario;
    @Column(nullable = false,length = 20, unique = true)
    private String login;
    @Column(nullable = false)
    private String senha;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DN;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Endereco")
    private EnderecoBean fk_endereco;
    @OneToOne()
    @JoinColumn(name = "Id_Sede_Filial")
    private SedeFilialBean fk_sede_filial;

    public UsuarioBean() {
    }

    public UsuarioBean(String nome, boolean status, String tipo_usuario, String login, String senha) {
        this.nome = nome;
        this.status = status;
        this.tipo_usuario = tipo_usuario;
        this.login = login;
        this.senha = senha;
    }

    public UsuarioBean(String nome, boolean status, String CPF, String RG, String CTPS, String tipo_usuario, String login, String senha, Date DN, EnderecoBean fk_endereco, SedeFilialBean fk_sede_filial) {
        this.nome = nome;
        this.status = status;
        this.CPF = CPF;
        this.RG = RG;
        this.CTPS = CTPS;
        this.tipo_usuario = tipo_usuario;
        this.login = login;
        this.senha = senha;
        this.DN = DN;
        this.fk_endereco = fk_endereco;
        this.fk_sede_filial = fk_sede_filial;
    }

    @Override
    public String toString() {
        return "UsuarioBean{" + "id=" + id + ", nome=" + nome + ", status=" + status + ", CPF=" + CPF + ", RG=" + RG + ", CTPS=" + CTPS + ", tipo_usuario=" + tipo_usuario + ", login=" + login + ", senha=" + senha + ", DN=" + DN + ", fk_endereco=" + fk_endereco + ", fk_sede_filial=" + fk_sede_filial + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + (this.status ? 1 : 0);
        hash = 11 * hash + Objects.hashCode(this.CPF);
        hash = 11 * hash + Objects.hashCode(this.RG);
        hash = 11 * hash + Objects.hashCode(this.CTPS);
        hash = 11 * hash + Objects.hashCode(this.tipo_usuario);
        hash = 11 * hash + Objects.hashCode(this.login);
        hash = 11 * hash + Objects.hashCode(this.senha);
        hash = 11 * hash + Objects.hashCode(this.DN);
        hash = 11 * hash + Objects.hashCode(this.fk_endereco);
        hash = 11 * hash + Objects.hashCode(this.fk_sede_filial);
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
        if (this.status != other.status) {
            return false;
        }
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
        if (!Objects.equals(this.tipo_usuario, other.tipo_usuario)) {
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
        if (!Objects.equals(this.fk_endereco, other.fk_endereco)) {
            return false;
        }
        if (!Objects.equals(this.fk_sede_filial, other.fk_sede_filial)) {
            return false;
        }
        return true;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
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

    public EnderecoBean getFk_endereco() {
        return fk_endereco;
    }

    public void setFk_endereco(EnderecoBean fk_endereco) {
        this.fk_endereco = fk_endereco;
    }

    public SedeFilialBean getFk_sede_filial() {
        return fk_sede_filial;
    }

    public void setFk_sede_filial(SedeFilialBean fk_sede_filial) {
        this.fk_sede_filial = fk_sede_filial;
    }

}
