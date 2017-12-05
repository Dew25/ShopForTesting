/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import classes.CustomerToBase;
import classes.ProductToBase;
import classes.Purchase;
import classes.Repository;
import classes.SingletonEM;
import entity.Customer;
import entity.Product;

/**
 *
 * @author jvm
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingletonEM sem = SingletonEM.getInstanse();
        
        CustomerToBase newCustomer = new CustomerToBase();
        newCustomer.addCustomer("Ivan", "Ivanov", 10000L, "45454545", "Kohtla-Jarve");
        newCustomer.addCustomer("Peter","Petrov",10000L,"56596857","Johvi");
        newCustomer.addCustomer("Andrey", "Andreyev", 11100L, "45565445", "Johvi");
     
        ProductToBase newProduct = new ProductToBase();
        newProduct.addProduct("Хлеб", 200L, 10);
        newProduct.addProduct("Колбаса", 400L, 10);
        
        Repository r = new Repository();
        Customer customer = r.getCustomerByCode("Peter", "Petrov");
        Product product = r.getProductByName("Хлеб");
        Purchase purchase = new Purchase();
        if(product != null && customer != null){
            System.out.println("Состояние продукта до покупки: "+product.toString());
            System.out.println("Состояние покупателя до покупки: "+customer.toString());
            if(purchase.doPurchase(customer, product, 2)){
                System.out.println("Покупка совершена");
            }else{
                System.out.println("Покупку совершить не удалось");
            }
            System.out.println("Состояние продукта после покупки: "+product.toString());
            System.out.println("Состояние покупателя после покупки: "+customer.toString());
        }else{
            System.out.println("Покупку совершить не удалось");
        }
        
        sem.close();
    }
        
//        Customer customer1 = new Customer("Ivan", "Ivanov", 10000L, "45454545", "Kohtla-Jarve");
//        Customer customer2 = new Customer("Peter", "Petrov", 11000L, "45454445", "Kohtla-Jarve");
//        Customer customer3 = new Customer("Andrey", "Andreyev", 11100L, "45565445", "Johvi");
//        Customer customer4 = new Customer("Priit", "Tomme", 11110L, "45546786", "Puru");
//        Customer customer5 = new Customer("Nadezda", "Nikolayeva", 10200L, "45754345", "Narva");
//        
//        Product product1 = new Product("Хлеб", 200L, 10);
//        Product product2 = new Product("Кефир", 300L, 10);
//        Product product3 = new Product("Колбаса", 400L, 10);
//        Product product4 = new Product("Яйца 10 шт", 150L, 10);
//        Product product5 = new Product("Молоко", 130L, 10);
//        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShopPU");
//        EntityManager em = emf.createEntityManager();
//        try {
//            em.getTransaction().begin();
//            em.persist(customer1);
//            em.persist(customer2);
//            em.persist(customer3);
//            em.persist(customer4);
//            em.persist(customer5);
//            em.persist(product1);
//            em.persist(product2);
//            em.persist(product3);
//            em.persist(product4);
//            em.persist(product5);
//
//            Calendar d = new GregorianCalendar();
//            History history1 = new History(d.getTime(), customer1, product1, 1);
//            em.persist(history1);
//
//            d = new GregorianCalendar();
//            History history3 = new History(d.getTime(), customer1, product3, 2);
//            em.persist(history3);
//            d = new GregorianCalendar();
//            History history4 = new History(d.getTime(), customer1, product2, 1);
//            em.persist(history4);
//            d = new GregorianCalendar();
//            History history5 = new History(d.getTime(), customer1, product4, 1);
//            em.persist(history5);
//            d = new GregorianCalendar();
//            History history6 = new History(d.getTime(), customer1, product5, 3);
//            em.persist(history6);
//            try {
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//                d = new GregorianCalendar();
//            History history7 = new History(d.getTime(), customer2, product1, 2);
//            em.persist(history7);
//            d = new GregorianCalendar();
//            History history8 = new History(d.getTime(), customer2, product2, 1);
//            em.persist(history8);
//            d = new GregorianCalendar();
//            History history9 = new History(d.getTime(), customer2, product3, 1);
//            em.persist(history9);
//            d = new GregorianCalendar();
//            History history10 = new History(d.getTime(), customer2, product3, 1);
//            em.persist(history10);
//            d = new GregorianCalendar();
//            History history11 = new History(d.getTime(), customer2, product4, 1);
//            em.persist(history11);
//
//            try {
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//                d = new GregorianCalendar();
//            History history13 = new History(d.getTime(), customer3, product1, 1);
//            em.persist(history13);
//            d = new GregorianCalendar();
//            History history14 = new History(d.getTime(), customer3, product2, 1);
//            em.persist(history14);
//            d = new GregorianCalendar();
//            History history15 = new History(d.getTime(), customer3, product3, 1);
//            em.persist(history15);
//            d = new GregorianCalendar();
//            History history16 = new History(d.getTime(), customer3, product3, 1);
//            em.persist(history16);
//            d = new GregorianCalendar();
//            History history17 = new History(d.getTime(), customer3, product4, 1);
//            em.persist(history17);
//            d = new GregorianCalendar();
//            History history18 = new History(d.getTime(), customer3, product5, 1);
//            em.persist(history18);
//
//            try {
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//                 d = new GregorianCalendar();
//            History history19 = new History(d.getTime(), customer4, product1, 1);
//            em.persist(history19);
//            d = new GregorianCalendar();
//            History history20 = new History(d.getTime(), customer4, product2, 4);
//            em.persist(history20);
//            d = new GregorianCalendar();
//            History history21 = new History(d.getTime(), customer4, product3, 1);
//            em.persist(history21);
//            d = new GregorianCalendar();
//            History history22 = new History(d.getTime(), customer4, product3, 3);
//            em.persist(history22);
//            d = new GregorianCalendar();
//            History history23 = new History(d.getTime(), customer4, product4, 2);
//            em.persist(history23);
//            d = new GregorianCalendar();
//            History history24 = new History(d.getTime(), customer4, product5, 1);
//            em.persist(history24);
//            try {
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//                 d = new GregorianCalendar();
//            History history25 = new History(d.getTime(), customer5, product1, 1);
//            em.persist(history25);
//            d = new GregorianCalendar();
//            History history26= new History(d.getTime(), customer5, product2, 3);
//            em.persist(history26);
//            d = new GregorianCalendar();
//            History history27 = new History(d.getTime(), customer5, product3, 1);
//            em.persist(history27);
//            d = new GregorianCalendar();
//            History history28 = new History(d.getTime(), customer5, product3, 1);
//            em.persist(history28);
//            d = new GregorianCalendar();
//            History history29 = new History(d.getTime(), customer5, product4, 5);
//            em.persist(history29);
//            d = new GregorianCalendar();
//            History history30 = new History(d.getTime(), customer5, product5, 1);
//            em.persist(history30);
//            em.getTransaction().commit();
//
//            em.getTransaction().begin();
//
//            String city="Kohtla-Jarve";
//
//            List<History> historyList = em.createQuery("SELECT h FROM History h WHERE h.customer.city=:city ORDER BY h.transactionDate ASC")
//                    .setParameter("city", city)
//                    .getResultList();
//            em.getTransaction().commit();
//
//            HashSet<Customer> customerSet = new HashSet();
//            for (int i = 0; i < historyList.size(); i++) {
//                History history = historyList.get(i);
//                customerSet.add(history.getCustomer());
//            }
//            System.out.println();
//            System.out.printf("Покупатели из города %s: %n",city);
//            Iterator iter = customerSet.iterator();
//
//            while (iter.hasNext()) {
//               Customer customerFromCity=(Customer)iter.next();
//                System.out.printf("Покупатель %s купил:%n",customerFromCity.getName()+" "+customerFromCity.getSurname());
//                Double sum=0.0;
//                Double price=0.0;
//                for (int i = 0; i < historyList.size(); i++) {
//                    History history=historyList.get(i);
//                    if(customerFromCity.equals(history.getCustomer())){
//                        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy h:m:s");
//                        price = history.getProduct().getPrice().doubleValue()/100;
//                        System.out.println(format1.format(history.getTransactionDate())+" "+history.getProduct().getName()+" - "+history.getNum()+" шт. по цене: "+price+" EUR");
//                        sum+=history.getProduct().getPrice()*history.getNum();
//                    }
//                }
//                System.out.printf("Затратил: %.2f EUR%n%n",sum/100);
//            }
//            System.out.println();
//            
//            
//            em.getTransaction().begin();
//                historyList = em.createQuery("SELECT h FROM History h WHERE h.product.name=:productName")
//                        .setParameter("productName", "Хлеб")
//                        .getResultList();
//            em.getTransaction().commit();
//            for (int i = 0; i < historyList.size(); i++) {
//                History get = historyList.get(i);
//                System.out.println(get);
//            }
//            
//            
//            
//        } finally {
//            em.close();
//            emf.close();
//        }
//        
//    }
    
}
