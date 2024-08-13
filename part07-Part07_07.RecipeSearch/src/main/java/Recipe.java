
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
public class Recipe {
     private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe() {
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

   
    
    public void add(String rcp){
        String[] parts = rcp.split(",");
        this.name = parts[0];
        this.time = Integer.valueOf(parts[1]);
        for(int i = 2; i < parts.length; i++){
            if(!parts[i].equals("")){
                this.ingredients.add(parts[i]);
            }
        }
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: "+this.time;
    }
    
}
