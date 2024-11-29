/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_concepts_and_data_structures;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tapas
 */

// Overloading Example
public class PaymentProcessor_Overloading {
    // Can have multiple types of payment
    //  When there is a need to implement a functionality in a different ways or modes
    List<String> strings = new ArrayList();
    
    // Process payment by credit card
    public void processPayment(String cardNumber, double amount){
        System.out.println("Processing credit card payment of $" + amount);
    }
    
//    // Process payment by credit card with installment option
    public void processPayment(String cardNumber, double amount, int installments){
        System.out.println("Processing credit card payment of $" + amount + " in " + installments + " installments.");
    }
    
//    // Process payment by digital wallet
    public void processPayment(String walletId, double amount, String walletType) {
        System.out.println("Processing " + walletType + " wallet payment of $" + amount);
    }
}
