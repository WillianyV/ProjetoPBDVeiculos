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
@SequenceGenerator(name = "sequencia_revisao", sequenceName = "revisao_seq", initialValue = 1, allocationSize = 1)
public class RevisaoBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_revisao")
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataUltimaRevisao, dataSaida, horaSaida;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEntrada;
    @Column(nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Veiculo", nullable = false)
    private VeiculoBean fkVeiculo;

    public RevisaoBean() {
    }

    public RevisaoBean(Date dataEntrada, VeiculoBean fkVeiculo) {
        this.dataEntrada = dataEntrada;
        this.fkVeiculo = fkVeiculo;
    }

    public RevisaoBean(Date dataUltimaRevisao, Date dataSaida, Date horaSaida, Date dataEntrada, VeiculoBean fkVeiculo) {
        this.dataUltimaRevisao = dataUltimaRevisao;
        this.dataSaida = dataSaida;
        this.horaSaida = horaSaida;
        this.dataEntrada = dataEntrada;
        this.fkVeiculo = fkVeiculo;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.dataUltimaRevisao);
        hash = 23 * hash + Objects.hashCode(this.dataSaida);
        hash = 23 * hash + Objects.hashCode(this.horaSaida);
        hash = 23 * hash + Objects.hashCode(this.dataEntrada);
        hash = 23 * hash + Objects.hashCode(this.fkVeiculo);
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
        final RevisaoBean other = (RevisaoBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataUltimaRevisao, other.dataUltimaRevisao)) {
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
        return "RevisaoBean{" + "id=" + id + ", dataUltimaRevisao=" + dataUltimaRevisao + ", dataSaida=" + dataSaida + ", horaSaida=" + horaSaida + ", dataEntrada=" + dataEntrada + ", fkVeiculo=" + fkVeiculo + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataUltimaRevisao() {
        return dataUltimaRevisao;
    }

    public void setDataUltimaRevisao(Date dataUltimaRevisao) {
        this.dataUltimaRevisao = dataUltimaRevisao;
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
