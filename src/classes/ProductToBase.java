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
    
    private String name;
    private Long price;
    private Integer quantity;
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

    public ProductToBase(String name, Long price, Integer quantity) {
        SingletonEM sem = SingletonEM.getInstanse();
        em = sem.getEntityManager();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public boolean addProduct(){
        
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
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
}
