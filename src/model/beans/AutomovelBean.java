
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

    public AutomovelBean(String codigo, String nome, float valor_locar_categoria) {
        super(codigo, nome, valor_locar_categoria);
    }

}
