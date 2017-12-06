/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import javax.persistence.EntityManager;

/**
 *
 * @author Melnikov
 */
public class CustomerToBase {
    
 
    private EntityManager em;
    
    public CustomerToBase(){
        SingletonEM sem = SingletonEM.getInstanse();
        sem.setEntitiManager("ShopPU");
        em = sem.getEntityManager();
    }
    
    public CustomerToBase(String persistenUnitName) {
        SingletonEM sem = SingletonEM.getInstanse();
        sem.setEntitiManager(persistenUnitName);
        em = sem.getEntityManager();
    }

      
    public boolean addCustomer(String name, String surname, Long money, String phone, String city){
        Customer c = new Customer(name,surname,money,phone,city);
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
}
