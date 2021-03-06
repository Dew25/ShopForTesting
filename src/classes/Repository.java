/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.Product;
import javax.persistence.EntityManager;

/**
 *
 * @author Melnikov
 */
public class Repository {
     EntityManager em;

    public Repository() {
        SingletonEM sem = SingletonEM.getInstanse();
        sem.setEntitiManager("ShopPU");
        em = sem.getEntityManager();
    }

     
    public Repository(String persistenceUnitName) {
        SingletonEM sem = SingletonEM.getInstanse();
        sem.setEntitiManager(persistenceUnitName);
        em = sem.getEntityManager();
    }
    
    public Product getProductByName(String name){
        try {
            return (Product) em.createQuery("SELECT p FROM Product p WHERE p.name=:name")
                    .setParameter("name", name)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    public Customer getCustomerByNameSurname(String name,String surname){
        try {
            return (Customer) em.createQuery("SELECT c FROM Customer c WHERE c.name=:name AND c.surname=:surname")
                    .setParameter("name", name)
                    .setParameter("surname", surname)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
}
