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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@Table(name="VEICULO")
@SequenceGenerator(name = "sequencia_veiculo", sequenceName = "veiculo_seq", initialValue = 1, allocationSize = 1)
public class VeiculoBean implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_veiculo")
    private Integer id;
    @Column(nullable = false)
    private int n_placa; 
    private int n_chassi, n_motor, toque_motor, quilometragem_atual, n_passageiros, n_porta;
    @Column(length = 100)
    private String cor, modelo, tipo_combustivel, fabricante;
    @Column(length = 50, nullable = false)
    private String status;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ano_fabricacao, ano_modelo;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Categoria", nullable = false)
    private CategoriaBean fk_categoria;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Sede_Filial", nullable = false)
    private SedeFilialBean fk_sede_filial;

    public VeiculoBean() {
    }

    public VeiculoBean(int n_placa, String status, CategoriaBean fk_categoria, SedeFilialBean fk_sede_filial) {
        this.n_placa = n_placa;
        this.status = status;
        this.fk_categoria = fk_categoria;
        this.fk_sede_filial = fk_sede_filial;
    }

    public VeiculoBean(int n_placa, int n_chassi, int n_motor, int toque_motor, int quilometragem_atual, int n_passageiros, int n_porta, String cor, String modelo, String tipo_combustivel, String fabricante, String status, Date ano_fabricacao, Date ano_modelo, CategoriaBean fk_categoria, SedeFilialBean fk_sede_filial) {
        this.n_placa = n_placa;
        this.n_chassi = n_chassi;
        this.n_motor = n_motor;
        this.toque_motor = toque_motor;
        this.quilometragem_atual = quilometragem_atual;
        this.n_passageiros = n_passageiros;
        this.n_porta = n_porta;
        this.cor = cor;
        this.modelo = modelo;
        this.tipo_combustivel = tipo_combustivel;
        this.fabricante = fabricante;
        this.status = status;
        this.ano_fabricacao = ano_fabricacao;
        this.ano_modelo = ano_modelo;
        this.fk_categoria = fk_categoria;
        this.fk_sede_filial = fk_sede_filial;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.n_placa;
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
        final VeiculoBean other = (VeiculoBean) obj;
        return true;
    }

    @Override
    public String toString() {
        return "VeiculoBean{" + "id=" + id + ", n_placa=" + n_placa + ", n_chassi=" + n_chassi + ", n_motor=" + n_motor + ", toque_motor=" + toque_motor + ", quilometragem_atual=" + quilometragem_atual + ", n_passageiros=" + n_passageiros + ", n_porta=" + n_porta + ", cor=" + cor + ", modelo=" + modelo + ", tipo_combustivel=" + tipo_combustivel + ", fabricante=" + fabricante + ", status=" + status + ", ano_fabricacao=" + ano_fabricacao + ", ano_modelo=" + ano_modelo + ", fk_categoria=" + fk_categoria + ", fk_sede_filial=" + fk_sede_filial + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getN_placa() {
        return n_placa;
    }

    public void setN_placa(int n_placa) {
        this.n_placa = n_placa;
    }

    public int getN_chassi() {
        return n_chassi;
    }

    public void setN_chassi(int n_chassi) {
        this.n_chassi = n_chassi;
    }

    public int getN_motor() {
        return n_motor;
    }

    public void setN_motor(int n_motor) {
        this.n_motor = n_motor;
    }

    public int getToque_motor() {
        return toque_motor;
    }

    public void setToque_motor(int toque_motor) {
        this.toque_motor = toque_motor;
    }

    public int getQuilometragem_atual() {
        return quilometragem_atual;
    }

    public void setQuilometragem_atual(int quilometragem_atual) {
        this.quilometragem_atual = quilometragem_atual;
    }

    public int getN_passageiros() {
        return n_passageiros;
    }

    public void setN_passageiros(int n_passageiros) {
        this.n_passageiros = n_passageiros;
    }

    public int getN_porta() {
        return n_porta;
    }

    public void setN_porta(int n_porta) {
        this.n_porta = n_porta;
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

    public String getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
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

    public Date getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(Date ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public Date getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(Date ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public CategoriaBean getFk_categoria() {
        return fk_categoria;
    }

    public void setFk_categoria(CategoriaBean fk_categoria) {
        this.fk_categoria = fk_categoria;
    }

    public SedeFilialBean getFk_sede_filial() {
        return fk_sede_filial;
    }

    public void setFk_sede_filial(SedeFilialBean fk_sede_filial) {
        this.fk_sede_filial = fk_sede_filial;
    }
    
}
