
package model.beans;

import javax.persistence.Entity;

/**
 *
 * @author willi
 */
@Entity
public class AutomovelBean extends CategoriaBean{

    public AutomovelBean() {
    }

    public AutomovelBean(String codigo, String nome) {
        super(codigo, nome);
    }
    
    
}
