/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Container {

    
    private String name;
    private int liters;

    public Container(String name) {
        this.name = name;
        this.liters = 0;
    }
    
    public int checkHundred(int liter){
        if(liter > 100){
            return 100;
        }
        return liter;
    }
    
    public void addLiters(int liter){
        if(liter > 0){
            this.liters += this.checkHundred(liter);
            this.liters = this.checkHundred(this.liters);
        }
    }
    
    public void moveLiters(int liter, Container second){
        if(liter > 0 && (!this.isEmpty())){
             if(liter >= 100){
                 second.addLiters(this.liters);
                 this.remove(this.liters);
             } else if(liter > this.liters){
                 second.addLiters(this.liters);
                 this.remove(this.liters);
             } else {
                 second.addLiters(liter);
                 this.remove(liter);
             }
        }
    }
    
    public void remove(int liter){
        if(!this.isEmpty()){
            if(liter >= 100 || liter > this.liters){
                this.liters = 0;
            } else {
                this.liters -= liter;
            }
        }
    }
    
    public boolean isEmpty(){
        if(this.liters > 0){
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.name+": "+String.valueOf(this.liters)+"/100\n";        
    }
}
