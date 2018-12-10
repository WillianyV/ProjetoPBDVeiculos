package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import model.beans.CamionetasCargaBean;

/**
 *
 * @author willi
 */
public class CamionetasCargaDAO {
    public void persist(CamionetasCargaBean cCarga) {        
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

    public ArrayList<CamionetasCargaBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<CamionetasCargaBean> cCarga = null;
        try {
            cCarga = (ArrayList)em.createQuery("from CamionetasCargaBean e").getResultList();
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
        CamionetasCargaBean cCarga;
        cCarga = em.find(CamionetasCargaBean.class, id);
        try {            
            em.getTransaction().begin();
            em.remove(cCarga);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            cCarga.setStatus(false);
            merge(cCarga);
            System.err.println("Erro ao remover Camioneta de carga, pois esta sendo utilizada.\nO Status da Camuoneta irá mudar para falso");
            //Mensagem.mensagemErro("Erro ao remover Camioneta de carga", "ERRO: Camioneta de carga");
        }finally{
            em.close();
        }
        
        return cCarga;    
    }
}
