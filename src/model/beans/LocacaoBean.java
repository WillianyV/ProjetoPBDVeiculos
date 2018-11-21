
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_locacao", sequenceName = "locacao_seq", initialValue = 1, allocationSize = 1)
public class LocacaoBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_locacao")
    private Integer id;
    @Column(length = 50,nullable = false)
    private String tipo_locacao;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false)
    private Date data_retirada, hora_retirada;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_devolucao, hora_devolucao;
    private float taxa_higienização, taxa_combustivel;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Reserva")
    private ReservaBean fk_reserva;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Categoria", nullable = false)
    private CategoriaBean fk_categoria;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Usuario", nullable = false)
    private UsuarioBean fk_usuario;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Cliente", nullable = false)
    private ClienteBean fk_cliente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Motorista", nullable = false)
    private MotoristaBean fk_motorista;

    public LocacaoBean() {
    }

    public LocacaoBean(String tipo_locacao, Date data_retirada, Date hora_retirada, CategoriaBean fk_categoria, UsuarioBean fk_usuario, ClienteBean fk_cliente, MotoristaBean fk_motorista) {
        this.tipo_locacao = tipo_locacao;
        this.data_retirada = data_retirada;
        this.hora_retirada = hora_retirada;
        this.fk_categoria = fk_categoria;
        this.fk_usuario = fk_usuario;
        this.fk_cliente = fk_cliente;
        this.fk_motorista = fk_motorista;
    }

    @Override
    public String toString() {
        return "LocacaoBean{" + "id=" + id + ", tipo_locacao=" + tipo_locacao + ", data_retirada=" + data_retirada + ", hora_retirada=" + hora_retirada + ", data_devolucao=" + data_devolucao + ", hora_devolucao=" + hora_devolucao + ", taxa_higieniza\u00e7\u00e3o=" + taxa_higienização + ", taxa_combustivel=" + taxa_combustivel + ", fk_reserva=" + fk_reserva + ", fk_categoria=" + fk_categoria + ", fk_usuario=" + fk_usuario + ", fk_cliente=" + fk_cliente + ", fk_motorista=" + fk_motorista + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo_locacao() {
        return tipo_locacao;
    }

    public void setTipo_locacao(String tipo_locacao) {
        this.tipo_locacao = tipo_locacao;
    }

    public Date getData_retirada() {
        return data_retirada;
    }

    public void setData_retirada(Date data_retirada) {
        this.data_retirada = data_retirada;
    }

    public Date getHora_retirada() {
        return hora_retirada;
    }

    public void setHora_retirada(Date hora_retirada) {
        this.hora_retirada = hora_retirada;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Date getHora_devolucao() {
        return hora_devolucao;
    }

    public void setHora_devolucao(Date hora_devolucao) {
        this.hora_devolucao = hora_devolucao;
    }

    public float getTaxa_higienização() {
        return taxa_higienização;
    }

    public void setTaxa_higienização(float taxa_higienização) {
        this.taxa_higienização = taxa_higienização;
    }

    public float getTaxa_combustivel() {
        return taxa_combustivel;
    }

    public void setTaxa_combustivel(float taxa_combustivel) {
        this.taxa_combustivel = taxa_combustivel;
    }

    public ReservaBean getFk_reserva() {
        return fk_reserva;
    }

    public void setFk_reserva(ReservaBean fk_reserva) {
        this.fk_reserva = fk_reserva;
    }

    public CategoriaBean getFk_categoria() {
        return fk_categoria;
    }

    public void setFk_categoria(CategoriaBean fk_categoria) {
        this.fk_categoria = fk_categoria;
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

    public MotoristaBean getFk_motorista() {
        return fk_motorista;
    }

    public void setFk_motorista(MotoristaBean fk_motorista) {
        this.fk_motorista = fk_motorista;
    }
  
}
