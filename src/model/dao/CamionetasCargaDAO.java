package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.CamionetasCargaBean;

/**
 *
 * @author willi
 */
public class CamionetasCargaDAO {
    public CamionetasCargaBean persist(CamionetasCargaBean cCarga) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(cCarga);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Camioneta de carga" + e);
            //Mensagem.mensagemErro("Erro ao salvar Camioneta de carga", "ERRO: Camioneta de carga");
        } finally {
            em.close();
        }
        return cCarga;

    }

    public CamionetasCargaBean merge(CamionetasCargaBean cCarga) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(cCarga);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Camioneta de carga" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Camioneta de carga", "ERRO: Camioneta de carga");
        } finally {
            em.close();
        }

        return cCarga;
    }

    public CamionetasCargaBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        CamionetasCargaBean cCarga = null;
        try {
            cCarga = em.find(CamionetasCargaBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Camioneta de carga" + e);
            //Mensagem.mensagemErro("Erro ao buscar Camioneta de carga", "ERRO: Camioneta de carga");
        } finally {
            em.close();
        }

        return cCarga;
    }

    public List<CamionetasCargaBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<CamionetasCargaBean> cCarga = null;
        try {
            cCarga = em.createQuery("from CamionetasCargaBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Camionetas de cargas" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Camionetas de cargas", "ERRO: Camionetas de cargas");
        }finally{
            em.close();
        }
        
        return cCarga;
    }
   
    public  CamionetasCargaBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        CamionetasCargaBean cCarga = null;
    
        try {
            cCarga = em.find(CamionetasCargaBean.class, id);
            em.getTransaction().begin();
            em.remove(cCarga);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover Camioneta de carga" + e);
            //Mensagem.mensagemErro("Erro ao remover Camioneta de carga", "ERRO: Camioneta de carga");
        }finally{
            em.close();
        }
        
        return cCarga;    
    }
}
