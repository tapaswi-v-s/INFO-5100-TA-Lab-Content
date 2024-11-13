/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.HashMap;
import java.util.Map;

/**
 * An implementation of the Dictionary
 * @author tapas
 * @version 1.0
 * @since 0.5
 */
public class Dictionary {
    
    /** The actual dictionary to look up*/
    Map<String, String> dictionary = new HashMap<String, String>();
    
    /**
     * A method to find defination from the dictionary
     * @param word - the word to be searched in the dictionary.
     * @return String - the definitation of the word.
     */
    public String lookUp(String word){
        return dictionary.get(word);
    }
}
