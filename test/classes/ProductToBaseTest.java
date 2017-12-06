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
 * @author jvm
 */
public class ProductToBaseTest {
    
     /**
     * Test of addProduct method, of class ProductToBase.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String name = "Колбаса";
        Long price = 140L;
        Integer quantity = 10;
        ProductToBase instance = new ProductToBase("ShopTestPU");
        boolean expResult = true;
        boolean result = instance.addProduct(name, price, quantity);
        assertEquals(expResult, result);
    }


    
}
