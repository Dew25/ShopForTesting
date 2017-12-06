/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Melnikov
 */
public class SingletonEM {
    
    EntityManagerFactory emf;
    EntityManager em;
    private static SingletonEM instanse = new SingletonEM();
    
    private SingletonEM(){
        
    }
    
    public static SingletonEM getInstanse(){
        
        if(instanse == null){
            instanse = new SingletonEM();
        }
        return instanse;
       
    }
    
    public EntityManager getEntityManager(){
        return em;
    }
    
    public void setEntitiManager(String persistenceUnitName){
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        em = emf.createEntityManager();
    }
    
    public void close(){
        if(em != null){
            em.close();
        }
        if(emf != null){
            emf.close();
        }
    }
}
