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
import javax.persistence.SequenceGenerator;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_endereco", sequenceName = "endereco_seq", allocationSize=1)
public class EnderecoBean implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_endereco")
    private Integer id;
    @Column(nullable = false,length = 100)
    private String logradouro;
    @Column(nullable = false,length = 50)
    private String bairro;
    @Column(nullable = false,length = 100)
    private String cidade;
    @Column(nullable = false,length = 2)
    private String uf;
    @Column(nullable = false,length = 10)
    private String cep;
    @Column(nullable = false)
    private int numero;

    public EnderecoBean() {
    }

    public EnderecoBean(Integer id, String logradouro, String bairro, String cidade, String uf, String cep, int numero) {
        this.id = id;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.numero = numero;
    }
    /*
    EQUALS() AND HASCODE()
    */
    @Override
    public String toString() {
        return "EnderecoBean{" + "id=" + id + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + ", numero=" + numero + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
