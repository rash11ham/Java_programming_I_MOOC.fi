/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Debt {
        
    private double balance;
    private double interstRate;
    
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interstRate = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println(this.balance);
    }
    
    public void waitOneYear(){
        this.balance = this.balance * this.interstRate;
    }
}
