/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author tapas
 */
public class CounterModel {
    private int counter; //Hold the data

    // Initialize counter value
    public CounterModel() {
        counter = 0;
    }
    
    
    // Bussiness Logic
    public void increment(){
        counter++;
    }
    
    public void decrement(){
        counter--;
    }

    public int getCounter() {
        return counter;
    }
    
}
