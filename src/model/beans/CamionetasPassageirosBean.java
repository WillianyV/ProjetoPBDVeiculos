package model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author willi
 */
@Entity
public class CamionetasPassageirosBean extends CategoriaBean{
    @Column(length = 50)
    private String tipoAirBag;
    private boolean direcaoAssistida, cintosTraseirosRetrateis, rodasLigaLeve, contPoluicaoAr;

    public CamionetasPassageirosBean() {
    }

    public CamionetasPassageirosBean(String codigo, String nome) {
        super(codigo, nome);
    }

    /**
     *
     * @param tipoAirBag
     * @param direcaoAssistida
     * @param cintosTraseirosRetrateis
     * @param rodasLigaLeve
     * @param contPoluicaoAr
     * @param codigo
     * @param nome
     */
    public CamionetasPassageirosBean(String tipoAirBag, boolean direcaoAssistida, boolean cintosTraseirosRetrateis, boolean rodasLigaLeve, boolean contPoluicaoAr, String codigo, String nome) {
        super(codigo, nome);
        this.tipoAirBag = tipoAirBag;
        this.direcaoAssistida = direcaoAssistida;
        this.cintosTraseirosRetrateis = cintosTraseirosRetrateis;
        this.rodasLigaLeve = rodasLigaLeve;
        this.contPoluicaoAr = contPoluicaoAr;
    }

    @Override
    public String toString() {
        return "CamionetasPassageiros{" + "tipoAirBag=" + tipoAirBag + ", direcaoAssistida=" + direcaoAssistida + ", cintosTraseirosRetrateis=" + cintosTraseirosRetrateis + ", rodasLigaLeve=" + rodasLigaLeve + ", contPoluicaoAr=" + contPoluicaoAr + '}';
    }

    public String getTipoAirBag() {
        return tipoAirBag;
    }

    public void setTipoAirBag(String tipoAirBag) {
        this.tipoAirBag = tipoAirBag;
    }

    public boolean isDirecaoAssistida() {
        return direcaoAssistida;
    }

    public void setDirecaoAssistida(boolean direcaoAssistida) {
        this.direcaoAssistida = direcaoAssistida;
    }

    public boolean isCintosTraseirosRetrateis() {
        return cintosTraseirosRetrateis;
    }

    public void setCintosTraseirosRetrateis(boolean cintosTraseirosRetrateis) {
        this.cintosTraseirosRetrateis = cintosTraseirosRetrateis;
    }

    public boolean isRodasLigaLeve() {
        return rodasLigaLeve;
    }

    public void setRodasLigaLeve(boolean rodasLigaLeve) {
        this.rodasLigaLeve = rodasLigaLeve;
    }

    public boolean isContPoluicaoAr() {
        return contPoluicaoAr;
    }

    public void setContPoluicaoAr(boolean contPoluicaoAr) {
        this.contPoluicaoAr = contPoluicaoAr;
    }
   
}
