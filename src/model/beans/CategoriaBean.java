/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author willi
 */
@Entity
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
    private String tamanho, tipoCambio;
    private boolean arCondicionado, radio, DVD, MP3, direcaoHidraulica, cameraRe;

    public CategoriaBean() {
    }

    public CategoriaBean(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public CategoriaBean(String codigo, String nome, String tamanho, String tipoCambio, boolean arCondicionado, boolean radio, boolean DVD, boolean MP3, boolean direcaoHidraulica, boolean cameraRe) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipoCambio = tipoCambio;
        this.arCondicionado = arCondicionado;
        this.radio = radio;
        this.DVD = DVD;
        this.MP3 = MP3;
        this.direcaoHidraulica = direcaoHidraulica;
        this.cameraRe = cameraRe;
    }
    
    @Override
    public String toString() {
        return "CategoriaBean{" + "id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", tamanho=" + tamanho + ", tipoCambio=" + tipoCambio + ", arCondicionado=" + arCondicionado + ", radio=" + radio + ", DVD=" + DVD + ", MP3=" + MP3 + ", direcaoHidraulica=" + direcaoHidraulica + ", cameraRe=" + cameraRe + '}';
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

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
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

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isCameraRe() {
        return cameraRe;
    }

    public void setCameraRe(boolean cameraRe) {
        this.cameraRe = cameraRe;
    }

}
