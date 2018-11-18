package model.beans;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author willi
 */
@Entity
public class PessoaJuridicaBean extends ClienteBean{
    
    @Column(nullable = false,length = 30)
    private String CNPJ;
    @Column(length = 30)
    private String inscEstadual;

    public PessoaJuridicaBean() {
    }

    public PessoaJuridicaBean(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public PessoaJuridicaBean(String CNPJ, String inscEstadual, String nome, EnderecoBean fkEndereco) {
        super(nome, fkEndereco);
        this.CNPJ = CNPJ;
        this.inscEstadual = inscEstadual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.CNPJ);
        hash = 79 * hash + Objects.hashCode(this.inscEstadual);
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
        if (!Objects.equals(this.inscEstadual, other.inscEstadual)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaJuridicaBean{" + "CNPJ=" + CNPJ + ", inscEstadual=" + inscEstadual + '}';
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
    
    
}
