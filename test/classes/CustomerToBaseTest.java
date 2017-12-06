/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melnikov
 */
public class CustomerToBaseTest {
    
    public CustomerToBaseTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCustomer method, of class CustomerToBase.
     */
    //@Test
    public void testAddCustomer_0args() {
        System.out.println("addCustomer");
        CustomerToBase instance = new CustomerToBase("ShopTestPU");
        boolean expResult = false;
        boolean result = instance.addCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

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
        boolean expResult = false;
        boolean result = instance.addCustomer(name, surname, money, phone, city);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class CustomerToBase.
     */
    //@Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CustomerToBase instance = new CustomerToBase();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class CustomerToBase.
     */
   // @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        CustomerToBase instance = new CustomerToBase();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoney method, of class CustomerToBase.
     */
   // @Test
    public void testSetMoney() {
        System.out.println("setMoney");
        Long money = null;
        CustomerToBase instance = new CustomerToBase();
        instance.setMoney(money);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class CustomerToBase.
     */
    //@Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        CustomerToBase instance = new CustomerToBase();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class CustomerToBase.
     */
   // @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        CustomerToBase instance = new CustomerToBase();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
