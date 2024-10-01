/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.CounterModel;

/**
 *
 * @author tapas
 */
public class MainController {
    CounterModel counterModel;

    public MainController() {
        counterModel = new CounterModel();
    }
    
    public int increase(){
        counterModel.increment(); // Call the increment business logic
        return counterModel.getCounter(); // returning the increased value
    }
    
    public int decrease(){
        counterModel.decrement(); // Call the decrement logic
        return counterModel.getCounter(); // returning the increased value
    }
    
    public int getCounterValue(){
        return counterModel.getCounter();
    }
    
}
