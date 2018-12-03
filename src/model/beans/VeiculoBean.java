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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
    @Column(length = 10, nullable = false)
    private String n_placa; 
    @Column(length = 17)
    private String n_chassi, n_motor; 
    private double toque_motor, quilometragem_atual;
    private int n_passageiros, n_porta;
    @Column(length = 100)
    private String cor, modelo, tipo_combustivel, fabricante;
    @Column(length = 50, nullable = false)
    private boolean status;
    private int ano_fabricacao, ano_modelo;
    @ManyToOne()
    @JoinColumn(name = "Id_Categoria")
    private CategoriaBean fk_categoria;
    @ManyToOne()
    @JoinColumn(name = "Id_Sede_Filial")
    private SedeFilialBean fk_sede_filial;

    public VeiculoBean() {
    }

    public VeiculoBean(String n_placa, boolean status) {
        this.n_placa = n_placa;
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.n_placa);
        hash = 97 * hash + Objects.hashCode(this.n_chassi);
        hash = 97 * hash + Objects.hashCode(this.n_motor);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.toque_motor) ^ (Double.doubleToLongBits(this.toque_motor) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.quilometragem_atual) ^ (Double.doubleToLongBits(this.quilometragem_atual) >>> 32));
        hash = 97 * hash + this.n_passageiros;
        hash = 97 * hash + this.n_porta;
        hash = 97 * hash + Objects.hashCode(this.cor);
        hash = 97 * hash + Objects.hashCode(this.modelo);
        hash = 97 * hash + Objects.hashCode(this.tipo_combustivel);
        hash = 97 * hash + Objects.hashCode(this.fabricante);
        hash = 97 * hash + (this.status ? 1 : 0);
        hash = 97 * hash + this.ano_fabricacao;
        hash = 97 * hash + this.ano_modelo;
        hash = 97 * hash + Objects.hashCode(this.fk_categoria);
        hash = 97 * hash + Objects.hashCode(this.fk_sede_filial);
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
        if (Double.doubleToLongBits(this.toque_motor) != Double.doubleToLongBits(other.toque_motor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quilometragem_atual) != Double.doubleToLongBits(other.quilometragem_atual)) {
            return false;
        }
        if (this.n_passageiros != other.n_passageiros) {
            return false;
        }
        if (this.n_porta != other.n_porta) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (this.ano_fabricacao != other.ano_fabricacao) {
            return false;
        }
        if (this.ano_modelo != other.ano_modelo) {
            return false;
        }
        if (!Objects.equals(this.n_placa, other.n_placa)) {
            return false;
        }
        if (!Objects.equals(this.n_chassi, other.n_chassi)) {
            return false;
        }
        if (!Objects.equals(this.n_motor, other.n_motor)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.tipo_combustivel, other.tipo_combustivel)) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.fk_categoria, other.fk_categoria)) {
            return false;
        }
        if (!Objects.equals(this.fk_sede_filial, other.fk_sede_filial)) {
            return false;
        }
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

    public String getN_placa() {
        return n_placa;
    }

    public void setN_placa(String n_placa) {
        this.n_placa = n_placa;
    }

    public String getN_chassi() {
        return n_chassi;
    }

    public void setN_chassi(String n_chassi) {
        this.n_chassi = n_chassi;
    }

    public String getN_motor() {
        return n_motor;
    }

    public void setN_motor(String n_motor) {
        this.n_motor = n_motor;
    }

    public double getToque_motor() {
        return toque_motor;
    }

    public void setToque_motor(double toque_motor) {
        this.toque_motor = toque_motor;
    }

    public double getQuilometragem_atual() {
        return quilometragem_atual;
    }

    public void setQuilometragem_atual(double quilometragem_atual) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
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
