package model.beans;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author willi
 */
@Entity
@Table(name="CLIENTE_PESSOA_JURIDICA")
public class PessoaJuridicaBean extends ClienteBean{
    
    @Column(nullable = false,length = 30)
    private String CNPJ;
    @Column(length = 30)
    private String insc_estadual;

    public PessoaJuridicaBean() {
    }

    public PessoaJuridicaBean(String CNPJ, String nome, EnderecoBean fk_endereco) {
        super(nome, fk_endereco);
        this.CNPJ = CNPJ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.CNPJ);
        hash = 97 * hash + Objects.hashCode(this.insc_estadual);
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
        final PessoaJuridicaBean other = (PessoaJuridicaBean) obj;
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        if (!Objects.equals(this.insc_estadual, other.insc_estadual)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "PessoaJuridicaBean{" + "CNPJ=" + CNPJ + ", insc_estadual=" + insc_estadual + '}';
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInsc_estadual() {
        return insc_estadual;
    }

    public void setInsc_estadual(String insc_estadual) {
        this.insc_estadual = insc_estadual;
    }

}
