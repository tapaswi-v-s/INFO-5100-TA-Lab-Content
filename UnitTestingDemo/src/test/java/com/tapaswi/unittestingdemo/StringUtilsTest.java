/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tapaswi.unittestingdemo;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tapas
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
        
    }

    @Test
    public void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        List<String> strings = new ArrayList();
        strings.add("racecar");
        strings.add("A man a plan a canal Panama");
        strings.add("Was it a car or a cat I saw?");
        for (String s : strings){
            assertTrue(StringUtils.isPalindrome(s));
        }
        
    }
    
    
    @Test
    void testIsPalindrome_invalidPalindromes() {
        List<String> strings = new ArrayList();
        strings.add("Hello");
        strings.add("world");
        strings.add("java");
        for (String s : strings){
            assertFalse(StringUtils.isPalindrome(s));
        }
    }

    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", 
                StringUtils.concatenate("Hello", "World"));
        assertEquals("", StringUtils.concatenate());
        assertNull(StringUtils.concatenate((String[]) null));
    }
    
}
