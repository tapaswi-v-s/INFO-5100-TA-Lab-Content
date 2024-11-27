/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author tapas
 */
public class Task {
    private String name;
    private boolean status;

    public Task(String name, boolean status) {
        this.name = name;
        this.status = status;
    }
    
    // Bussiness Logic
    
    public void markAsCompleted(){
        this.status = true;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
