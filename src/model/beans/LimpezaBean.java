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
@Table(name="LIMPEZA")	
@SequenceGenerator(name = "sequencia_limpeza", sequenceName = "limpeza_seq", initialValue = 1, allocationSize = 1)
public class LimpezaBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_limpeza")
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_ultima_lipeza, data_saida, hora_saida;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_entrada;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Veiculo", nullable = false)
    private VeiculoBean fk_veiculo;

    public LimpezaBean() {
    }

    public LimpezaBean(Date data_entrada, VeiculoBean fk_veiculo) {
        this.data_entrada = data_entrada;
        this.fk_veiculo = fk_veiculo;
    }

    @Override
    public String toString() {
        return "LimpezaBean{" + "id=" + id + ", data_ultima_lipeza=" + data_ultima_lipeza + ", data_saida=" + data_saida + ", hora_saida=" + hora_saida + ", data_entrada=" + data_entrada + ", fk_veiculo=" + fk_veiculo + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData_ultima_lipeza() {
        return data_ultima_lipeza;
    }

    public void setData_ultima_lipeza(Date data_ultima_lipeza) {
        this.data_ultima_lipeza = data_ultima_lipeza;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public Date getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(Date hora_saida) {
        this.hora_saida = hora_saida;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public VeiculoBean getFk_veiculo() {
        return fk_veiculo;
    }

    public void setFk_veiculo(VeiculoBean fk_veiculo) {
        this.fk_veiculo = fk_veiculo;
    }
    
}
