/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.HashMap;
import java.util.Map;

/**
 *  An implementation of Spanish dictionary
 * @author tapas
 * @version 2.0
 * @since version 2.0
 */
public class SpanishDictionary {
    /** The actual dictionary to look up*/
    Map<String, String> dictionary = new HashMap<String, String>();
    
    /**
     * A method to find defination from the dictionary
     * @param word - the word to be searched in the dictionary.
     * @return String - the definitation of the word.
     * {@link Dictionary}
     * @see Dictionary#lookUp(java.lang.String) 
     */
    public String lookUp(String word){
        return dictionary.get(word);
    }
}
