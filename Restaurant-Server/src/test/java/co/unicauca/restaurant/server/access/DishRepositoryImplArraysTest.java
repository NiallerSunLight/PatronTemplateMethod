/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.server.access;

import co.unicauca.restaurant.commons.domain.Dish;
import co.unicauca.restaurant.services.DishService;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author EDWIN ADRADA
 */
public class DishRepositoryImplArraysTest {
    
    public DishRepositoryImplArraysTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findDish method, of class DishRepositoryImplArrays.
     */
    @Test
    public void testFindDish() {
        System.out.println("findDish");
        String id = "001";
        IDishRepository repo = Factory.getInstance().getRepository();
        DishService instance = new DishService(repo);
        String expResult = "001";
        Dish result = instance.findDish(id);
        assertEquals(expResult, result.getId());
    }

    /**
     * Test of createDish method, of class DishRepositoryImplArrays.
     */
    @Test
    public void testCreateDish() {
        System.out.println("createDish");
        Dish dish = new Dish();
        dish.setId("005");
        dish.setName("Ensalada de verduras");
        dish.setDescription("Plato de diferentes verduras como pepino, lechuga, tomate y brocoli.");
        dish.setPrice("5000");
        dish.setSize("HALF");
        
        IDishRepository repo = Factory.getInstance().getRepository();
        DishService instance = new DishService(repo);
        String expResult = "005";
        String result = instance.createDish(dish);
        assertEquals(expResult, result);
        
    }
    
}
