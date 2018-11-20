/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connenction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author willi
 */
public class ConnectionFactory {
     private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoPBD");
    
    public EntityManager getConnetion(){
        return emf.createEntityManager();
    }
}
