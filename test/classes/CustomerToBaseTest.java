/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melnikov
 */
public class CustomerToBaseTest {
    
   
    /**
     * Test of addCustomer method, of class CustomerToBase.
     */
    @Test
    public void testAddCustomer_5args() {
        System.out.println("addCustomer");
        String name = "Peter";
        String surname = "Petrov";
        Long money = 10000L;
        String phone = "45454545";
        String city = "Johvi";
        CustomerToBase instance = new CustomerToBase("ShopTestPU");
        boolean expResult = true;
        boolean result = instance.addCustomer(name, surname, money, phone, city);
        assertEquals(expResult, result);
    }

   
    
}
