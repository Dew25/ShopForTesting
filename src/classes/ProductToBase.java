/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import javax.persistence.EntityManager;

/**
 *
 * @author Melnikov
 */
public class ProductToBase {

    EntityManager em;

    public ProductToBase() {
        SingletonEM sem = SingletonEM.getInstanse();
        sem.setEntitiManager("ShopPU");
        em = sem.getEntityManager();
    }
    
    public ProductToBase(String persistenUnitName) {
        SingletonEM sem = SingletonEM.getInstanse();
        sem.setEntitiManager(persistenUnitName);
        em = sem.getEntityManager();
    }

    
    public boolean addProduct(String name, Long price, Integer quantity){
        
        Product p = new Product(name, price, quantity);
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
