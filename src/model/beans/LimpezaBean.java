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
@SequenceGenerator(name = "sequencia_limpeza", sequenceName = "limpeza_seq", initialValue = 1, allocationSize = 1)
public class LimpezaBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_limpeza")
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataUltimaLipeza, dataSaida, horaSaida;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEntrada;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Veiculo", nullable = false)
    private VeiculoBean fkVeiculo;
    
    public LimpezaBean() {
    }

    public LimpezaBean(Date dataEntrada, VeiculoBean fkVeiculo) {
        this.dataEntrada = dataEntrada;
        this.fkVeiculo = fkVeiculo;
    }

    public LimpezaBean(Date dataUltimaLipeza, Date dataSaida, Date horaSaida, Date dataEntrada, VeiculoBean fkVeiculo) {
        this.dataUltimaLipeza = dataUltimaLipeza;
        this.dataSaida = dataSaida;
        this.horaSaida = horaSaida;
        this.dataEntrada = dataEntrada;
        this.fkVeiculo = fkVeiculo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.dataUltimaLipeza);
        hash = 59 * hash + Objects.hashCode(this.dataSaida);
        hash = 59 * hash + Objects.hashCode(this.horaSaida);
        hash = 59 * hash + Objects.hashCode(this.dataEntrada);
        hash = 59 * hash + Objects.hashCode(this.fkVeiculo);
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
        final LimpezaBean other = (LimpezaBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataUltimaLipeza, other.dataUltimaLipeza)) {
            return false;
        }
        if (!Objects.equals(this.dataSaida, other.dataSaida)) {
            return false;
        }
        if (!Objects.equals(this.horaSaida, other.horaSaida)) {
            return false;
        }
        if (!Objects.equals(this.dataEntrada, other.dataEntrada)) {
            return false;
        }
        if (!Objects.equals(this.fkVeiculo, other.fkVeiculo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LimpezaBean{" + "id=" + id + ", dataUltimaLipeza=" + dataUltimaLipeza + ", dataSaida=" + dataSaida + ", horaSaida=" + horaSaida + ", dataEntrada=" + dataEntrada + ", fkVeiculo=" + fkVeiculo + '}';
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataUltimaLipeza() {
        return dataUltimaLipeza;
    }

    public void setDataUltimaLipeza(Date dataUltimaLipeza) {
        this.dataUltimaLipeza = dataUltimaLipeza;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public VeiculoBean getFkVeiculo() {
        return fkVeiculo;
    }

    public void setFkVeiculo(VeiculoBean fkVeiculo) {
        this.fkVeiculo = fkVeiculo;
    }
    
}
