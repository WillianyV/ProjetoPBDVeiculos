
package model.beans;

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

    public CamionetasCargaBean(String codigo, String nome) {
        super(codigo, nome);
    }

    public CamionetasCargaBean(float capacidade_carga, float desempenho, float potencia_motor, float volume_abastecimento, float distancia_eixos, String tipo_embreagem, String codigo, String nome, String tamanho, String tipo_cambio, boolean ar_condicionado, boolean radio, boolean DVD, boolean MP3, boolean direcao_hidraulica, boolean camera_re) {
        super(codigo, nome, tamanho, tipo_cambio, ar_condicionado, radio, DVD, MP3, direcao_hidraulica, camera_re);
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
