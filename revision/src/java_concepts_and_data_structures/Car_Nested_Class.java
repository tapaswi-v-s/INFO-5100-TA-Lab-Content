/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_concepts_and_data_structures;

/**
 *
 * @author tapas
 */
public class Car_Nested_Class {
    private String model;

    Car_Nested_Class(String model) {
        this.model = model;
    }

    // Static nested class
    static class Engine {
        void startEngine() {
            System.out.println("Engine started.");
        }
    }

    // Inner class
    class Wheel {
        void rotate() {
            System.out.println("Wheels are rotating.");
        }
    }
    
    public void displayCarInfo() {
        System.out.println("Car model: " + model);
        Engine engine = new Engine();
        engine.startEngine();
        
        Wheel wheel = new Wheel();
        wheel.rotate();
    }
}

class Driver{
    public static void main(String[] args) {
        Car_Nested_Class cs = new Car_Nested_Class("Model s");
//        Car_Nested_Class.Wheel
    }
}
