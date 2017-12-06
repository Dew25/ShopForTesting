/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.History;
import entity.Product;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;

/**
 *
 * @author Melnikov
 */
public class Purchase {
    private Customer customer;
    private Product product;
    private Integer quantity;
    private EntityManager em;

    public Purchase() {
        SingletonEM sem = SingletonEM.getInstanse();
        sem.setEntitiManager("ShopPU");
        em = sem.getEntityManager();
    }
    
    
    public Purchase(String persistenUnitName) {
        SingletonEM sem = SingletonEM.getInstanse();
        sem.setEntitiManager(persistenUnitName);
        em = sem.getEntityManager();
    }

    public Purchase(Customer customer, Product product, Integer quantity) {
        SingletonEM sem = SingletonEM.getInstanse();
        em = sem.getEntityManager();
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
    public boolean doPurchase(){
        History history = new History();
        history.setCustomer(customer);
        history.setNum(quantity);
        history.setProduct(product);
       
        try {
            if((customer.getMoney()-product.getPrice()*quantity)<= customer.getMoney() 
                    && (product.getQuantity()-quantity > 0)){
                em.getTransaction().begin();
                customer.setMoney(customer.getMoney()-product.getPrice()*quantity);
                product.setQuantity(product.getQuantity()-quantity);
                em.merge(customer);
                em.merge(product);
                em.persist(history);
                em.getTransaction().commit();
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    public boolean doPurchase(Customer customer, Product product, Integer quantity){
        Calendar date = new GregorianCalendar();
        
        History history = new History();
        history.setTransactionDate(date.getTime());
        history.setCustomer(customer);
        history.setNum(quantity);
        history.setProduct(product);
        try {
            if(((customer.getMoney()-product.getPrice()*quantity) <= customer.getMoney()) 
                    && ((product.getQuantity()-quantity) > 0)){
                em.getTransaction().begin();
                customer.setMoney(customer.getMoney()-product.getPrice()*quantity);
                product.setQuantity(product.getQuantity()-quantity);
                em.merge(customer);
                em.merge(product);
                em.persist(history);
                em.getTransaction().commit();
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            return false;
        }
    }
}
