
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author willi
 */
@Entity
@Table(name="LOCACAO")
@SequenceGenerator(name = "sequencia_locacao", sequenceName = "locacao_seq", initialValue = 1, allocationSize = 1)
public class LocacaoBean implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_locacao")
    private Integer id;
    
    @Column(length = 50,nullable = false)
    private String tipo_locacao;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date data_hora_retirada;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date data_hora_devolucao;
    
    private float taxa_higienização, taxa_combustivel,km_inicial,km_final, metade_valor_locacao;
    private boolean status;
    
   
    @OneToOne()
    @JoinColumn(name = "Id_Reserva")
    private ReservaBean fk_reserva;
    
    @ManyToOne()
    @JoinColumn(name = "Id_Usuario")
    private UsuarioBean fk_usuario;
    
    @ManyToOne()
    @JoinColumn(name = "Id_Cliente")
    private ClienteBean fk_cliente;
   
    @ManyToOne()
    @JoinColumn(name = "Id_Motorista")
    private MotoristaBean fk_motorista;
    
    @ManyToOne()
    @JoinColumn(name = "Id_Veiculo")
    private VeiculoBean fk_veiculo;

    public LocacaoBean() {
    }

    public LocacaoBean(String tipo_locacao, Date data_hora_retirada, MotoristaBean fk_motorista, VeiculoBean fk_veiculo) {
        this.tipo_locacao = tipo_locacao;
        this.data_hora_retirada = data_hora_retirada;
        this.fk_motorista = fk_motorista;
        this.fk_veiculo = fk_veiculo;
    }

    @Override
    public String toString() {
        return "LocacaoBean{" + "id=" + id + ", tipo_locacao=" + tipo_locacao + ", data_hora_retirada=" + data_hora_retirada + ", data_hora_devolucao=" + data_hora_devolucao + ", taxa_higieniza\u00e7\u00e3o=" + taxa_higienização + ", taxa_combustivel=" + taxa_combustivel + ", km_inicial=" + km_inicial + ", km_final=" + km_final + ", metade_valor_locacao=" + metade_valor_locacao + ", status=" + status + ", fk_reserva=" + fk_reserva + ", fk_usuario=" + fk_usuario + ", fk_cliente=" + fk_cliente + ", fk_motorista=" + fk_motorista + ", fk_veiculo=" + fk_veiculo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.tipo_locacao);
        hash = 97 * hash + Objects.hashCode(this.data_hora_retirada);
        hash = 97 * hash + Objects.hashCode(this.data_hora_devolucao);
        hash = 97 * hash + Float.floatToIntBits(this.taxa_higienização);
        hash = 97 * hash + Float.floatToIntBits(this.taxa_combustivel);
        hash = 97 * hash + Float.floatToIntBits(this.km_inicial);
        hash = 97 * hash + Float.floatToIntBits(this.km_final);
        hash = 97 * hash + Float.floatToIntBits(this.metade_valor_locacao);
        hash = 97 * hash + (this.status ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.fk_reserva);
        hash = 97 * hash + Objects.hashCode(this.fk_usuario);
        hash = 97 * hash + Objects.hashCode(this.fk_cliente);
        hash = 97 * hash + Objects.hashCode(this.fk_motorista);
        hash = 97 * hash + Objects.hashCode(this.fk_veiculo);
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
        final LocacaoBean other = (LocacaoBean) obj;
        if (Float.floatToIntBits(this.taxa_higienização) != Float.floatToIntBits(other.taxa_higienização)) {
            return false;
        }
        if (Float.floatToIntBits(this.taxa_combustivel) != Float.floatToIntBits(other.taxa_combustivel)) {
            return false;
        }
        if (Float.floatToIntBits(this.km_inicial) != Float.floatToIntBits(other.km_inicial)) {
            return false;
        }
        if (Float.floatToIntBits(this.km_final) != Float.floatToIntBits(other.km_final)) {
            return false;
        }
        if (Float.floatToIntBits(this.metade_valor_locacao) != Float.floatToIntBits(other.metade_valor_locacao)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.tipo_locacao, other.tipo_locacao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.data_hora_retirada, other.data_hora_retirada)) {
            return false;
        }
        if (!Objects.equals(this.data_hora_devolucao, other.data_hora_devolucao)) {
            return false;
        }
        if (!Objects.equals(this.fk_reserva, other.fk_reserva)) {
            return false;
        }
        if (!Objects.equals(this.fk_usuario, other.fk_usuario)) {
            return false;
        }
        if (!Objects.equals(this.fk_cliente, other.fk_cliente)) {
            return false;
        }
        if (!Objects.equals(this.fk_motorista, other.fk_motorista)) {
            return false;
        }
        if (!Objects.equals(this.fk_veiculo, other.fk_veiculo)) {
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

    public String getTipo_locacao() {
        return tipo_locacao;
    }

    public void setTipo_locacao(String tipo_locacao) {
        this.tipo_locacao = tipo_locacao;
    }

    public Date getData_hora_retirada() {
        return data_hora_retirada;
    }

    public void setData_hora_retirada(Date data_hora_retirada) {
        this.data_hora_retirada = data_hora_retirada;
    }

    public Date getData_hora_devolucao() {
        return data_hora_devolucao;
    }

    public void setData_hora_devolucao(Date data_hora_devolucao) {
        this.data_hora_devolucao = data_hora_devolucao;
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

    public float getKm_inicial() {
        return km_inicial;
    }

    public void setKm_inicial(float km_inicial) {
        this.km_inicial = km_inicial;
    }

    public float getKm_final() {
        return km_final;
    }

    public void setKm_final(float km_final) {
        this.km_final = km_final;
    }

    public float getMetade_valor_locacao() {
        return metade_valor_locacao;
    }

    public void setMetade_valor_locacao(float metade_valor_locacao) {
        this.metade_valor_locacao = metade_valor_locacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ReservaBean getFk_reserva() {
        return fk_reserva;
    }

    public void setFk_reserva(ReservaBean fk_reserva) {
        this.fk_reserva = fk_reserva;
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

    public VeiculoBean getFk_veiculo() {
        return fk_veiculo;
    }

    public void setFk_veiculo(VeiculoBean fk_veiculo) {
        this.fk_veiculo = fk_veiculo;
    }
    
    
    
}
