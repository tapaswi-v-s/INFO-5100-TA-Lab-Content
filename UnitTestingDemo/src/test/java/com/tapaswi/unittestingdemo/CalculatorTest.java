/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tapaswi.unittestingdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tapas
 */
public class CalculatorTest {
    Calculator calc = null;
    
    public CalculatorTest() {
        calc = new Calculator();
    }
    
    

    @Test
    public void testAdd() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(5, calc.add(2, 3));
    }
    
    @Test
    public void testDivide() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(2, calc.divide(4, 2));
        assertThrows(ArithmeticException.class, 
                () -> calc.divide(2, 0));
    }
    
}
