package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.CamionetasPassageirosBean;

/**
 *
 * @author willi
 */
public class CamionetasPassageirosDAO {
    public CamionetasPassageirosBean persist(CamionetasPassageirosBean cPassageiro) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(cPassageiro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Camioneta de passageiro" + e);
            //Mensagem.mensagemErro("Erro ao salvar Camioneta de passageiro", "ERRO: Camioneta de passageiro");
        } finally {
            em.close();
        }
        return cPassageiro;

    }

    public CamionetasPassageirosBean merge(CamionetasPassageirosBean cp) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(cp);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Camioneta de passageiro" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Camioneta de passageiro", "ERRO: Camioneta de passageiro");
        } finally {
            em.close();
        }

        return cp;
    }

    public CamionetasPassageirosBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        CamionetasPassageirosBean cp = null;
        try {
            cp = em.find(CamionetasPassageirosBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Camioneta de passageiro" + e);
            //Mensagem.mensagemErro("Erro ao buscar Camioneta de passageiro", "ERRO: Camioneta de passageiro");
        } finally {
            em.close();
        }

        return cp;
    }

    public List<CamionetasPassageirosBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<CamionetasPassageirosBean> cp = null;
        try {
            cp = em.createQuery("from PessoaFisicaBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Camionetas de passageiros" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Camionetas de passageiros", "ERRO: Camionetas de passageiros");
        }finally{
            em.close();
        }
        
        return cp;
    }
   
    public  CamionetasPassageirosBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        CamionetasPassageirosBean cp = null;
    
        try {
            cp = em.find(CamionetasPassageirosBean.class, id);
            em.getTransaction().begin();
            em.remove(cp);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover Camioneta de passageiro" + e);
            //Mensagem.mensagemErro("Erro ao remover Camioneta de passageiro", "ERRO: Camioneta de passageiro");
        }finally{
            em.close();
        }
        
        return cp;    
    }
}
