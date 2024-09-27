/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author tapas
 */
public class User {
    private String name; // Global Variable
    private String program;
    
    public User(String name, String program){
        this.name = name;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }
    
    
    
    
    void someFunction(){
        System.out.println("Name: "+name);
    }
}
