package model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name="CATEGORIA_CAMIONETA_PASSAGEIRO")
public class CamionetasPassageirosBean extends CategoriaBean{
    @Column(length = 50)
    private String tipo_air_bag;
    private boolean direcao_assistida, cintos_traseiros_retrateis, rodas_liga_leve, cont_poluicao_ar;

    public CamionetasPassageirosBean() {
    }

    public CamionetasPassageirosBean(String codigo, String nome) {
        super(codigo, nome);
    }

    public CamionetasPassageirosBean(String tipo_air_bag, boolean direcao_assistida, boolean cintos_traseiros_retrateis, boolean rodas_liga_leve, boolean cont_poluicao_ar, String codigo, String nome, String tamanho, String tipo_cambio, boolean ar_condicionado, boolean radio, boolean DVD, boolean MP3, boolean direcao_hidraulica, boolean camera_re) {
        super(codigo, nome, tamanho, tipo_cambio, ar_condicionado, radio, DVD, MP3, direcao_hidraulica, camera_re);
        this.tipo_air_bag = tipo_air_bag;
        this.direcao_assistida = direcao_assistida;
        this.cintos_traseiros_retrateis = cintos_traseiros_retrateis;
        this.rodas_liga_leve = rodas_liga_leve;
        this.cont_poluicao_ar = cont_poluicao_ar;
    }

    @Override
    public String toString() {
        return "CamionetasPassageirosBean{" + "tipo_air_bag=" + tipo_air_bag + ", direcao_assistida=" + direcao_assistida + ", cintos_traseiros_retrateis=" + cintos_traseiros_retrateis + ", rodas_liga_leve=" + rodas_liga_leve + ", cont_poluicao_ar=" + cont_poluicao_ar + '}';
    }

    public String getTipo_air_bag() {
        return tipo_air_bag;
    }

    public void setTipo_air_bag(String tipo_air_bag) {
        this.tipo_air_bag = tipo_air_bag;
    }

    public boolean isDirecao_assistida() {
        return direcao_assistida;
    }

    public void setDirecao_assistida(boolean direcao_assistida) {
        this.direcao_assistida = direcao_assistida;
    }

    public boolean isCintos_traseiros_retrateis() {
        return cintos_traseiros_retrateis;
    }

    public void setCintos_traseiros_retrateis(boolean cintos_traseiros_retrateis) {
        this.cintos_traseiros_retrateis = cintos_traseiros_retrateis;
    }

    public boolean isRodas_liga_leve() {
        return rodas_liga_leve;
    }

    public void setRodas_liga_leve(boolean rodas_liga_leve) {
        this.rodas_liga_leve = rodas_liga_leve;
    }

    public boolean isCont_poluicao_ar() {
        return cont_poluicao_ar;
    }

    public void setCont_poluicao_ar(boolean cont_poluicao_ar) {
        this.cont_poluicao_ar = cont_poluicao_ar;
    }

}
