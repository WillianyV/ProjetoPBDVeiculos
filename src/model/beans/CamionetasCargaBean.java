
package model.beans;

import javax.persistence.Entity;

/**
 *
 * @author willi
 */
@Entity
public class CamionetasCargaBean extends CategoriaBean{
    
    private float capacidadeCarga, desempenho, potenciaMotor, volumeAbastecimento, distanciaEixos;
    private String tipoEmbreagem;

    public CamionetasCargaBean() {
    }

    public CamionetasCargaBean(String codigo, String nome) {
        super(codigo, nome);
    }

    public CamionetasCargaBean(float capacidadeCarga, float desempenho, float potenciaMotor, float volumeAbastecimento, float distanciaEixos, String tipoEmbreagem, String codigo, String nome) {
        super(codigo, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.desempenho = desempenho;
        this.potenciaMotor = potenciaMotor;
        this.volumeAbastecimento = volumeAbastecimento;
        this.distanciaEixos = distanciaEixos;
        this.tipoEmbreagem = tipoEmbreagem;
    }

    @Override
    public String toString() {
        return "CamionetasCarga{" + "capacidadeCarga=" + capacidadeCarga + ", desempenho=" + desempenho + ", potenciaMotor=" + potenciaMotor + ", volumeAbastecimento=" + volumeAbastecimento + ", distanciaEixos=" + distanciaEixos + ", tipoEmbreagem=" + tipoEmbreagem + '}';
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public float getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }

    public float getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(float potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public float getVolumeAbastecimento() {
        return volumeAbastecimento;
    }

    public void setVolumeAbastecimento(float volumeAbastecimento) {
        this.volumeAbastecimento = volumeAbastecimento;
    }

    public float getDistanciaEixos() {
        return distanciaEixos;
    }

    public void setDistanciaEixos(float distanciaEixos) {
        this.distanciaEixos = distanciaEixos;
    }

    public String getTipoEmbreagem() {
        return tipoEmbreagem;
    }

    public void setTipoEmbreagem(String tipoEmbreagem) {
        this.tipoEmbreagem = tipoEmbreagem;
    }
    
}
