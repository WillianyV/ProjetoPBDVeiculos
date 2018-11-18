
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
import javax.persistence.OneToMany;
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
    private String tipoLocacao;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false)
    private Date dataRetirada, hotaRetirada;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDevolucao, horaDevolucao;
    private float taxaHigienizacao, taxaCombustivel;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Reserva")
    private ReservaBean fkReservaBean;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Categoria", nullable = false)
    private CategoriaBean fkCategoria;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Usuario", nullable = false)
    private UsuarioBean fkUsuario;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Cliente", nullable = false)
    private ClienteBean fkCliente;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Motorista", nullable = false)
    private MotoristaBean fkMotorista;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_Controle_Financeiro")
    private ControleFinanceiroBean fkControleFinanceiro;

    public LocacaoBean() {
    }

    public LocacaoBean(String tipoLocacao, Date dataRetirada, Date hotaRetirada, CategoriaBean fkCategoria, UsuarioBean fkUsuario, ClienteBean fkCliente, MotoristaBean fkMotorista) {
        this.tipoLocacao = tipoLocacao;
        this.dataRetirada = dataRetirada;
        this.hotaRetirada = hotaRetirada;
        this.fkCategoria = fkCategoria;
        this.fkUsuario = fkUsuario;
        this.fkCliente = fkCliente;
        this.fkMotorista = fkMotorista;
    }

    public LocacaoBean(String tipoLocacao, Date dataRetirada, Date hotaRetirada, Date dataDevolucao, Date horaDevolucao, float taxaHigienizacao, float taxaCombustivel, ReservaBean fkReservaBean, CategoriaBean fkCategoria, UsuarioBean fkUsuario, ClienteBean fkCliente, MotoristaBean fkMotorista, ControleFinanceiroBean fkControleFinanceiro) {
        this.tipoLocacao = tipoLocacao;
        this.dataRetirada = dataRetirada;
        this.hotaRetirada = hotaRetirada;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.taxaHigienizacao = taxaHigienizacao;
        this.taxaCombustivel = taxaCombustivel;
        this.fkReservaBean = fkReservaBean;
        this.fkCategoria = fkCategoria;
        this.fkUsuario = fkUsuario;
        this.fkCliente = fkCliente;
        this.fkMotorista = fkMotorista;
        this.fkControleFinanceiro = fkControleFinanceiro;
    }

    @Override
    public String toString() {
        return "LocacaoBean{" + "id=" + id + ", tipoLocacao=" + tipoLocacao + ", dataRetirada=" + dataRetirada + ", hotaRetirada=" + hotaRetirada + ", dataDevolucao=" + dataDevolucao + ", horaDevolucao=" + horaDevolucao + ", taxaHigienizacao=" + taxaHigienizacao + ", taxaCombustivel=" + taxaCombustivel + ", fkReservaBean=" + fkReservaBean + ", fkCategoria=" + fkCategoria + ", fkUsuario=" + fkUsuario + ", fkCliente=" + fkCliente + ", fkMotorista=" + fkMotorista + ", fkControleFinanceiro=" + fkControleFinanceiro + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoLocacao() {
        return tipoLocacao;
    }

    public void setTipoLocacao(String tipoLocacao) {
        this.tipoLocacao = tipoLocacao;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getHotaRetirada() {
        return hotaRetirada;
    }

    public void setHotaRetirada(Date hotaRetirada) {
        this.hotaRetirada = hotaRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Date horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public float getTaxaHigienizacao() {
        return taxaHigienizacao;
    }

    public void setTaxaHigienizacao(float taxaHigienizacao) {
        this.taxaHigienizacao = taxaHigienizacao;
    }

    public float getTaxaCombustivel() {
        return taxaCombustivel;
    }

    public void setTaxaCombustivel(float taxaCombustivel) {
        this.taxaCombustivel = taxaCombustivel;
    }

    public ReservaBean getFkReservaBean() {
        return fkReservaBean;
    }

    public void setFkReservaBean(ReservaBean fkReservaBean) {
        this.fkReservaBean = fkReservaBean;
    }

    public CategoriaBean getFkCategoria() {
        return fkCategoria;
    }

    public void setFkCategoria(CategoriaBean fkCategoria) {
        this.fkCategoria = fkCategoria;
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

    public MotoristaBean getFkMotorista() {
        return fkMotorista;
    }

    public void setFkMotorista(MotoristaBean fkMotorista) {
        this.fkMotorista = fkMotorista;
    }

    public ControleFinanceiroBean getFkControleFinanceiro() {
        return fkControleFinanceiro;
    }

    public void setFkControleFinanceiro(ControleFinanceiroBean fkControleFinanceiro) {
        this.fkControleFinanceiro = fkControleFinanceiro;
    }
   
}
