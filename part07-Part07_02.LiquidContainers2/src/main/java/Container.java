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
   
    private int liters;

    

    public Container() {
        this.liters = 0;

    }
    
    
    public int contains(){
        return this.liters;
    }
    
    public int checkHundred(int liter){
        if(liter > 100){
            return 100;
        }
        return liter;
    }
    
    public void add(int liter){
        if(liter > 0){
            this.liters += this.checkHundred(liter);
            this.liters = this.checkHundred(this.liters);
        }
    }
    
    public void moveLiters(int liter, Container second){
        if(liter > 0 && (!this.isEmpty())){
             if(liter >= 100){
                 second.add(this.liters);
                 this.remove(this.liters);
             } else if(liter > this.liters){
                 second.add(this.liters);
                 this.remove(this.liters);
             } else {
                 second.add(liter);
                 this.remove(liter);
             }
        }
    }
    
    public void remove(int liter){
        if(!this.isEmpty() && liter > 0){
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
        return this.liters+"/100";        
    }
}
