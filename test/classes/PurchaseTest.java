/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.Product;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jvm
 */
public class PurchaseTest {
    
    
    public PurchaseTest() {
    }
    
  
    /**
     * Test of doPurchase method, of class Purchase.
     */
    @Test
    public void testDoPurchase() {
        System.out.println("doPurchase");
        
        CustomerToBase ctb = new CustomerToBase("ShopTestPU");
        ctb.addCustomer("ivan", "ivanov", 1000L, "54545454", "Johvi");
        
        ProductToBase ptb = new ProductToBase("ShopTestPU");
        ptb.addProduct("Хлеб", 140L, 5);
        
        Repository r = new Repository("ShopTestPU");
        Customer c = r.getCustomerByNameSurname("ivan", "ivanov");
        Product p = r.getProductByName("Хлеб");
        Integer quantity = 2;
        
        Purchase instance = new Purchase("ShopTestPU");
        
        boolean expResult = true;
        
        boolean result = instance.doPurchase(c, p, quantity);
        
        assertEquals(expResult, result);
    }
    
}
