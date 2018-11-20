
package model.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name="CATEGORIA_AUTOMOVEL")
public class AutomovelBean extends CategoriaBean{

    public AutomovelBean() {
    }

    public AutomovelBean(String codigo, String nome) {
        super(codigo, nome);
    }

    public AutomovelBean(String codigo, String nome, String tamanho, String tipo_cambio, boolean ar_condicionado, boolean radio, boolean DVD, boolean MP3, boolean direcao_hidraulica, boolean camera_re) {
        super(codigo, nome, tamanho, tipo_cambio, ar_condicionado, radio, DVD, MP3, direcao_hidraulica, camera_re);
    }
    
}
