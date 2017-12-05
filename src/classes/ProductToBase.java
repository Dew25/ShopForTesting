/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShopPU");
        EntityManager em = emf.createEntityManager();
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShopPU");
        EntityManager em = emf.createEntityManager();
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
