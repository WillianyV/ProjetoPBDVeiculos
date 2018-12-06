
package model.beans;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name="CATEGORIA_CAMINONETA_CARGA")
public class CamionetasCargaBean extends CategoriaBean{
    
    private float capacidade_carga, desempenho, potencia_motor, volume_abastecimento, distancia_eixos;
    private String tipo_embreagem;

    public CamionetasCargaBean() {
    }

    public CamionetasCargaBean(String codigo, String nome, float valor_locar_categoria, boolean status) {
        super(codigo, nome, valor_locar_categoria, status);
    }

    public CamionetasCargaBean(float capacidade_carga, float desempenho, float potencia_motor, float volume_abastecimento, float distancia_eixos, String tipo_embreagem, String codigo, String nome, float valor_locar_categoria, boolean status) {
        super(codigo, nome, valor_locar_categoria, status);
        this.capacidade_carga = capacidade_carga;
        this.desempenho = desempenho;
        this.potencia_motor = potencia_motor;
        this.volume_abastecimento = volume_abastecimento;
        this.distancia_eixos = distancia_eixos;
        this.tipo_embreagem = tipo_embreagem;
    }
    
    @Override
    public String toString() {
        return "CamionetasCargaBean{" + "capacidade_carga=" + capacidade_carga + ", desempenho=" + desempenho + ", potencia_motor=" + potencia_motor + ", volume_abastecimento=" + volume_abastecimento + ", distancia_eixos=" + distancia_eixos + ", tipo_embreagem=" + tipo_embreagem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Float.floatToIntBits(this.capacidade_carga);
        hash = 59 * hash + Float.floatToIntBits(this.desempenho);
        hash = 59 * hash + Float.floatToIntBits(this.potencia_motor);
        hash = 59 * hash + Float.floatToIntBits(this.volume_abastecimento);
        hash = 59 * hash + Float.floatToIntBits(this.distancia_eixos);
        hash = 59 * hash + Objects.hashCode(this.tipo_embreagem);
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
        final CamionetasCargaBean other = (CamionetasCargaBean) obj;
        if (Float.floatToIntBits(this.capacidade_carga) != Float.floatToIntBits(other.capacidade_carga)) {
            return false;
        }
        if (Float.floatToIntBits(this.desempenho) != Float.floatToIntBits(other.desempenho)) {
            return false;
        }
        if (Float.floatToIntBits(this.potencia_motor) != Float.floatToIntBits(other.potencia_motor)) {
            return false;
        }
        if (Float.floatToIntBits(this.volume_abastecimento) != Float.floatToIntBits(other.volume_abastecimento)) {
            return false;
        }
        if (Float.floatToIntBits(this.distancia_eixos) != Float.floatToIntBits(other.distancia_eixos)) {
            return false;
        }
        if (!Objects.equals(this.tipo_embreagem, other.tipo_embreagem)) {
            return false;
        }
        return true;
    }

    public float getCapacidade_carga() {
        return capacidade_carga;
    }

    public void setCapacidade_carga(float capacidade_carga) {
        this.capacidade_carga = capacidade_carga;
    }

    public float getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }

    public float getPotencia_motor() {
        return potencia_motor;
    }

    public void setPotencia_motor(float potencia_motor) {
        this.potencia_motor = potencia_motor;
    }

    public float getVolume_abastecimento() {
        return volume_abastecimento;
    }

    public void setVolume_abastecimento(float volume_abastecimento) {
        this.volume_abastecimento = volume_abastecimento;
    }

    public float getDistancia_eixos() {
        return distancia_eixos;
    }

    public void setDistancia_eixos(float distancia_eixos) {
        this.distancia_eixos = distancia_eixos;
    }

    public String getTipo_embreagem() {
        return tipo_embreagem;
    }

    public void setTipo_embreagem(String tipo_embreagem) {
        this.tipo_embreagem = tipo_embreagem;
    }

   
}
