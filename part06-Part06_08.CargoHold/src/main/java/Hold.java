
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Hold {
    private ArrayList<Suitcase> luggages;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.luggages = new ArrayList();
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        this.luggages.add(suitcase);
        
        this.getTotalWeight();

        if(this.getTotalWeight() > this.maximumWeight){
            this.luggages.remove(suitcase);
        }  
           
    }
    
    public int getTotalWeight(){
        int totalWeight = 0;
        for(Suitcase s: this.luggages){
            totalWeight = totalWeight + s.totalWeight();
        }   
        return totalWeight;
    }
    
   
    
    public void printItems(){
        for(Suitcase s: this.luggages){
            s.printItems();
        }
    }
//    
//    public Item heaviestItem(){
//        Item item = new Item("",0);
//        for(Item i:this.luggages){
//            if(i.getWeight()>item.getWeight()){
//                item = i;
//            }
//        }
//        return item;
//    }
    
    public String toString(){
        if(this.luggages.size() == 0){
            return "no suitcases ("+this.getTotalWeight()+"kg)";
        }
        return this.luggages.size() +" suitcases ("+this.getTotalWeight()+"kg)";
    }
    
}
