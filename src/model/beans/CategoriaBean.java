/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name="CATEGORIA")
@SequenceGenerator(name = "sequencia_categoria", sequenceName = "categoria_seq", initialValue = 1, allocationSize = 1)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CategoriaBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_categoria")
    private Integer id;
    @Column(nullable = false, length = 5)
    private String codigo;
    @Column(nullable = false)
    private String nome;
    @Column(length = 50)
    private String tamanho, tipo_cambio;
    private boolean ar_condicionado, radio, DVD, MP3, direcao_hidraulica, camera_re;

    public CategoriaBean() {
    }

    public CategoriaBean(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public CategoriaBean(String codigo, String nome, String tamanho, String tipo_cambio, boolean ar_condicionado, boolean radio, boolean DVD, boolean MP3, boolean direcao_hidraulica, boolean camera_re) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo_cambio = tipo_cambio;
        this.ar_condicionado = ar_condicionado;
        this.radio = radio;
        this.DVD = DVD;
        this.MP3 = MP3;
        this.direcao_hidraulica = direcao_hidraulica;
        this.camera_re = camera_re;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigo);
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
        final CategoriaBean other = (CategoriaBean) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CategoriaBean{" + "id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", tamanho=" + tamanho + ", tipo_cambio=" + tipo_cambio + ", ar_condicionado=" + ar_condicionado + ", radio=" + radio + ", DVD=" + DVD + ", MP3=" + MP3 + ", direcao_hidraulica=" + direcao_hidraulica + ", camera_re=" + camera_re + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo_cambio() {
        return tipo_cambio;
    }

    public void setTipo_cambio(String tipo_cambio) {
        this.tipo_cambio = tipo_cambio;
    }

    public boolean isAr_condicionado() {
        return ar_condicionado;
    }

    public void setAr_condicionado(boolean ar_condicionado) {
        this.ar_condicionado = ar_condicionado;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isDVD() {
        return DVD;
    }

    public void setDVD(boolean DVD) {
        this.DVD = DVD;
    }

    public boolean isMP3() {
        return MP3;
    }

    public void setMP3(boolean MP3) {
        this.MP3 = MP3;
    }

    public boolean isDirecao_hidraulica() {
        return direcao_hidraulica;
    }

    public void setDirecao_hidraulica(boolean direcao_hidraulica) {
        this.direcao_hidraulica = direcao_hidraulica;
    }

    public boolean isCamera_re() {
        return camera_re;
    }

    public void setCamera_re(boolean camera_re) {
        this.camera_re = camera_re;
    }

}
