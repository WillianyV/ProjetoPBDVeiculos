/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.beans;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@Table(name="RESERVA")
@SequenceGenerator(name = "sequencia_reserva", sequenceName = "reserva_seq", initialValue = 1, allocationSize = 1)
public class ReservaBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_reserva")
    private Integer id;
    
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date data_hora_reserva;
    
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_deseja_locar;
    
    @ManyToOne()
    @JoinColumn(name = "Id_Usuario")
    private UsuarioBean fk_usuario;
    
    @ManyToOne()
    @JoinColumn(name = "Id_Cliente")
    private ClienteBean fk_cliente;
    
    @ManyToOne()
    @JoinColumn(name = "Id_Categoria")
    private CategoriaBean fk_categoria;
    
    private float valorLocacao;
    private boolean status;

    public ReservaBean() {
    }

    public ReservaBean(Date data_deseja_locar, ClienteBean fk_cliente, CategoriaBean fk_categoria, boolean status) {
        this.data_deseja_locar = data_deseja_locar;
        this.fk_cliente = fk_cliente;
        this.fk_categoria = fk_categoria;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReservaBean{" + "id=" + id + ", data_hora_reserva=" + data_hora_reserva + ", data_deseja_locar=" + data_deseja_locar + ", fk_usuario=" + fk_usuario + ", fk_cliente=" + fk_cliente + ", fk_categoria=" + fk_categoria + ", valorLocacao=" + valorLocacao + ", status=" + status + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.data_hora_reserva);
        hash = 97 * hash + Objects.hashCode(this.data_deseja_locar);
        hash = 97 * hash + Objects.hashCode(this.fk_usuario);
        hash = 97 * hash + Objects.hashCode(this.fk_cliente);
        hash = 97 * hash + Objects.hashCode(this.fk_categoria);
        hash = 97 * hash + Float.floatToIntBits(this.valorLocacao);
        hash = 97 * hash + (this.status ? 1 : 0);
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
        final ReservaBean other = (ReservaBean) obj;
        if (Float.floatToIntBits(this.valorLocacao) != Float.floatToIntBits(other.valorLocacao)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.data_hora_reserva, other.data_hora_reserva)) {
            return false;
        }
        if (!Objects.equals(this.data_deseja_locar, other.data_deseja_locar)) {
            return false;
        }
        if (!Objects.equals(this.fk_usuario, other.fk_usuario)) {
            return false;
        }
        if (!Objects.equals(this.fk_cliente, other.fk_cliente)) {
            return false;
        }
        if (!Objects.equals(this.fk_categoria, other.fk_categoria)) {
            return false;
        }
        return true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData_hora_reserva() {
        return data_hora_reserva;
    }

    public void setData_hora_reserva(Date data_hora_reserva) {
        this.data_hora_reserva = data_hora_reserva;
    }

    public Date getData_deseja_locar() {
        return data_deseja_locar;
    }

    public void setData_deseja_locar(Date data_deseja_locar) {
        this.data_deseja_locar = data_deseja_locar;
    }

    public UsuarioBean getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(UsuarioBean fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public ClienteBean getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente(ClienteBean fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    public CategoriaBean getFk_categoria() {
        return fk_categoria;
    }

    public void setFk_categoria(CategoriaBean fk_categoria) {
        this.fk_categoria = fk_categoria;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
