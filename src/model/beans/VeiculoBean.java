/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import java.util.Date;
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
@SequenceGenerator(name = "sequencia_veiculo", sequenceName = "veiculo_seq", initialValue = 1, allocationSize = 1)
public class VeiculoBean implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_veiculo")
    private Integer id;
    @Column(nullable = false)
    private int nPlaca; 
    private int nChassi, nMotor, toqueMotor, quilometragemAtual, nPassageiros, nPorta;
    @Column(length = 100)
    private String cor, modelo, tipoCombustivel, fabricante;
    @Column(length = 50, nullable = false)
    private String status;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date anoFabricacao, anoModelo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_categoria", nullable = false)
    private CategoriaBean fkCategoria;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_sede_filial", nullable = false)
    private SedeFilialBean fkSedeFilial;

    public VeiculoBean() {
    }

    public VeiculoBean(int nPlaca, String status, CategoriaBean fkCategoria, SedeFilialBean fkSedeFilial) {
        this.nPlaca = nPlaca;
        this.status = status;
        this.fkCategoria = fkCategoria;
        this.fkSedeFilial = fkSedeFilial;
    }

    public VeiculoBean(int nPlaca, int nChassi, int nMotor, int toqueMotor, int quilometragemAtual, int nPassageiros, int nPorta, String cor, String modelo, String tipoCombustivel, String fabricante, String status, Date anoFabricacao, Date anoModelo, CategoriaBean fkCategoria, SedeFilialBean fkSedeFilial) {
        this.nPlaca = nPlaca;
        this.nChassi = nChassi;
        this.nMotor = nMotor;
        this.toqueMotor = toqueMotor;
        this.quilometragemAtual = quilometragemAtual;
        this.nPassageiros = nPassageiros;
        this.nPorta = nPorta;
        this.cor = cor;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.fabricante = fabricante;
        this.status = status;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.fkCategoria = fkCategoria;
        this.fkSedeFilial = fkSedeFilial;
    }

    @Override
    public String toString() {
        return "VeiculoBean{" + "id=" + id + ", nPlaca=" + nPlaca + ", nChassi=" + nChassi + ", nMotor=" + nMotor + ", toqueMotor=" + toqueMotor + ", quilometragemAtual=" + quilometragemAtual + ", nPassageiros=" + nPassageiros + ", nPorta=" + nPorta + ", cor=" + cor + ", modelo=" + modelo + ", tipoCombustivel=" + tipoCombustivel + ", fabricante=" + fabricante + ", status=" + status + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", fkCategoria=" + fkCategoria + ", fkSedeFilial=" + fkSedeFilial + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(int nPlaca) {
        this.nPlaca = nPlaca;
    }

    public int getnChassi() {
        return nChassi;
    }

    public void setnChassi(int nChassi) {
        this.nChassi = nChassi;
    }

    public int getnMotor() {
        return nMotor;
    }

    public void setnMotor(int nMotor) {
        this.nMotor = nMotor;
    }

    public int getToqueMotor() {
        return toqueMotor;
    }

    public void setToqueMotor(int toqueMotor) {
        this.toqueMotor = toqueMotor;
    }

    public int getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public void setQuilometragemAtual(int quilometragemAtual) {
        this.quilometragemAtual = quilometragemAtual;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }

    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    public int getnPorta() {
        return nPorta;
    }

    public void setnPorta(int nPorta) {
        this.nPorta = nPorta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public CategoriaBean getFkCategoria() {
        return fkCategoria;
    }

    public void setFkCategoria(CategoriaBean fkCategoria) {
        this.fkCategoria = fkCategoria;
    }

    public SedeFilialBean getFkSedeFilial() {
        return fkSedeFilial;
    }

    public void setFkSedeFilial(SedeFilialBean fkSedeFilial) {
        this.fkSedeFilial = fkSedeFilial;
    }
    
}
