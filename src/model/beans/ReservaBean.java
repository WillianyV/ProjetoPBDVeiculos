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
@SequenceGenerator(name = "sequencia_reserva", sequenceName = "reserva_seq", initialValue = 1, allocationSize = 1)
public class ReservaBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_reserva")
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataReserva, horaReserva;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false)
    private Date diaDesejaLocar;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_usuario", nullable = false)
    private UsuarioBean fkUsuario;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_cliente", nullable = false)
    private ClienteBean fkCliente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_categoria", nullable = false)
    private CategoriaBean fkCategoria;

    public ReservaBean() {
    }

    public ReservaBean(Date diaDesejaLocar, UsuarioBean fkUsuario, ClienteBean fkCliente, CategoriaBean fkCategoria) {
        this.diaDesejaLocar = diaDesejaLocar;
        this.fkUsuario = fkUsuario;
        this.fkCliente = fkCliente;
        this.fkCategoria = fkCategoria;
    }

    public ReservaBean(Date dataReserva, Date horaReserva, Date diaDesejaLocar, UsuarioBean fkUsuario, ClienteBean fkCliente, CategoriaBean fkCategoria) {
        this.dataReserva = dataReserva;
        this.horaReserva = horaReserva;
        this.diaDesejaLocar = diaDesejaLocar;
        this.fkUsuario = fkUsuario;
        this.fkCliente = fkCliente;
        this.fkCategoria = fkCategoria;
    }

    @Override
    public String toString() {
        return "ReservaBean{" + "id=" + id + ", dataReserva=" + dataReserva + ", horaReserva=" + horaReserva + ", diaDesejaLocar=" + diaDesejaLocar + ", fkUsuario=" + fkUsuario + ", fkCliente=" + fkCliente + ", fkCategoria=" + fkCategoria + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(Date horaReserva) {
        this.horaReserva = horaReserva;
    }

    public Date getDiaDesejaLocar() {
        return diaDesejaLocar;
    }

    public void setDiaDesejaLocar(Date diaDesejaLocar) {
        this.diaDesejaLocar = diaDesejaLocar;
    }

    public UsuarioBean getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(UsuarioBean fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public ClienteBean getFkCliente() {
        return fkCliente;
    }

    public void setFkCliente(ClienteBean fkCliente) {
        this.fkCliente = fkCliente;
    }

    public CategoriaBean getFkCategoria() {
        return fkCategoria;
    }

    public void setFkCategoria(CategoriaBean fkCategoria) {
        this.fkCategoria = fkCategoria;
    }
    
}
