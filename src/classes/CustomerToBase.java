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
    
    private String name;
    private String surname;
    private Long money;
    private String phone;
    private String city;
    private EntityManager em;
    public CustomerToBase() {
        SingletonEM sem = SingletonEM.getInstanse();
        em = sem.getEntityManager();
    }

    public CustomerToBase(String name, String surname, Long money, String phone, String city) {
        SingletonEM sem = SingletonEM.getInstanse();
        em = sem.getEntityManager();
        this.name = name;
        this.surname = surname;
        this.money = money;
        this.phone = phone;
        this.city = city;
    }
    
    
    public boolean addCustomer(){
        
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
