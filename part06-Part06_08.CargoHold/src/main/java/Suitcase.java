
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList();
    }
    
    public void addItem(Item item){
        
        this.items.add(item);
        
        this.getItemsWeight();

        if(this.getItemsWeight() > this.maximumWeight){
            this.items.remove(item);
        }  
           
    }
    
    public int getItemsWeight(){
        int totalWeight = 0;
        for(Item i: this.items){
            totalWeight = totalWeight + i.getWeight();
        }   
        return totalWeight;
    }
    
    public int totalWeight(){
        return getItemsWeight();
    }
    
    public void printItems(){
        for(Item i: this.items){
            System.out.println(i.getName()+"("+i.getWeight()+"kg)");
        }
    }
    
    public Item heaviestItem(){
        Item item = new Item("",0);
        
        if(this.items.isEmpty()){
            return null;
        }
        for(Item i:this.items){
            if(i.getWeight()>item.getWeight()){
                item = i;
            }
        }
        return item;
    }
    
    public String toString(){
        if(this.items.size() == 0){
            return "no items ("+this.getItemsWeight()+" kg)";
        }
        if(this.items.size() == 1){
            return this.items.size() +" item ("+this.getItemsWeight()+" kg)";
        }
        return this.items.size() +" items ("+this.getItemsWeight()+" kg)";
    }
    
    
}
