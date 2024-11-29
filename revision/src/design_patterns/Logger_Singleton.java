/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design_patterns;

/**
 *
 * @author tapas
 */
public class Logger_Singleton {
    private static Logger_Singleton instance;

    private Logger_Singleton() {
        // private constructor to prevent instantiation
    }

    public static synchronized Logger_Singleton getInstance() {
        if (instance == null) {
            instance = new Logger_Singleton();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

// Usage
class Application {
    public static void main(String[] args) {
        Logger_Singleton logger = Logger_Singleton.getInstance();
        logger.log("Application started");
        
        Logger_Singleton logger2 = Logger_Singleton.getInstance();
        logger2.log("Application Ended");
    }
}

