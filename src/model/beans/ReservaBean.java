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
@Table(name="RESERVA")
@SequenceGenerator(name = "sequencia_reserva", sequenceName = "reserva_seq", initialValue = 1, allocationSize = 1)
public class ReservaBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_reserva")
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_reserva, hora_reserva;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false)
    private Date dia_deseja_locar;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Usuario", nullable = false)
    private UsuarioBean fk_usuario;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Cliente", nullable = false)
    private ClienteBean fk_cliente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Categoria", nullable = false)
    private CategoriaBean fk_categoria;

    public ReservaBean() {
    }

    public ReservaBean(Date dia_deseja_locar, UsuarioBean fk_usuario, CategoriaBean fk_categoria) {
        this.dia_deseja_locar = dia_deseja_locar;
        this.fk_usuario = fk_usuario;
        this.fk_categoria = fk_categoria;
    }

    public ReservaBean(Date data_reserva, Date hora_reserva, Date dia_deseja_locar, UsuarioBean fk_usuario, ClienteBean fk_cliente, CategoriaBean fk_categoria) {
        this.data_reserva = data_reserva;
        this.hora_reserva = hora_reserva;
        this.dia_deseja_locar = dia_deseja_locar;
        this.fk_usuario = fk_usuario;
        this.fk_cliente = fk_cliente;
        this.fk_categoria = fk_categoria;
    }

    @Override
    public String toString() {
        return "ReservaBean{" + "id=" + id + ", data_reserva=" + data_reserva + ", hora_reserva=" + hora_reserva + ", dia_deseja_locar=" + dia_deseja_locar + ", fk_usuario=" + fk_usuario + ", fk_cliente=" + fk_cliente + ", fk_categoria=" + fk_categoria + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(Date data_reserva) {
        this.data_reserva = data_reserva;
    }

    public Date getHora_reserva() {
        return hora_reserva;
    }

    public void setHora_reserva(Date hora_reserva) {
        this.hora_reserva = hora_reserva;
    }

    public Date getDia_deseja_locar() {
        return dia_deseja_locar;
    }

    public void setDia_deseja_locar(Date dia_deseja_locar) {
        this.dia_deseja_locar = dia_deseja_locar;
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
    
}
