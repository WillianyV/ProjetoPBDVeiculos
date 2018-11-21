
package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.ReservaBean;

/**
 *
 * @author willi
 */
public class ReservaDAO {
    public ReservaBean persist(ReservaBean reserva) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(reserva);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Reserva" + e);
            //Mensagem.mensagemErro("Erro ao salvar Reserva", "ERRO: Reserva");
        } finally {
            em.close();
        }
        return reserva;

    }

    public ReservaBean merge(ReservaBean reserva) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(reserva);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Reserva" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Reserva", "ERRO: Reserva");
        } finally {
            em.close();
        }

        return reserva;
    }

    public ReservaBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        ReservaBean reserva = null;
        try {
            reserva = em.find(ReservaBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Reserva" + e);
            //Mensagem.mensagemErro("Erro ao buscar Reserva", "ERRO: Reserva não encontrado");
        } finally {
            em.close();
        }

        return reserva;
    }

    public List<ReservaBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<ReservaBean> reservas = null;
        try {
            reservas = em.createQuery("from ReservaBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar as Reservas" + e);
            //Mensagem.mensagemErro("Erro ao buscar as Reservas", "ERRO: Reserva");
        }finally{
            em.close();
        }
        
        return reservas;
    }
   
    public  ReservaBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        ReservaBean reserva = null;
    
        try {
            reserva = em.find(ReservaBean.class, id);
            em.getTransaction().begin();
            em.remove(reserva);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover Reserva" + e);
            //Mensagem.mensagemErro("Erro ao remover Reserva", "ERRO: Reserva");
        }finally{
            em.close();
        }
        
        return reserva;    
    }
}