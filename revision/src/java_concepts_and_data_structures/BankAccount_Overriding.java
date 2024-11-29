/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_concepts_and_data_structures;

/**
 *
 * @author tapas
 */

interface ParentBankAccount{
    public double getInterestRate();
}

public class BankAccount_Overriding implements ParentBankAccount{

    @Override
    public double getInterestRate() {
        return 3.5;
    }
    
}

class SavingsAccount extends BankAccount_Overriding {
    
    @Override
    public double getInterestRate() {
        return 4.0;
    }
}

class FixedDepositAccount extends BankAccount_Overriding {
    @Override
    public double getInterestRate() {
        return 5.5;
    }
}

class CurrentAccount extends BankAccount_Overriding{
    
}

class Driver{
    public static void main(String[] args) {
        CurrentAccount cr = new CurrentAccount();
        System.out.println("Curr A/c Rate: "+cr.getInterestRate());
    }
}



