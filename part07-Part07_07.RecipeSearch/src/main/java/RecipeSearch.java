
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList();
        
        Interface face = new Interface(scanner, recipes);
        
        face.start();
    }
    
    //class Recipe with rows:
        //name -String
        //cooking time -integer
        // ingrediants -possibly a list
    
    //read and list the recipes from the file
        //command list 
        // lists the recipe name and cooking time
        // not the ingredients 
    
    //Find recipe by name (a string contained in the name: ex roll - tufo rolls)
    
    //Find by cooking time - will filter any time under the given time
    
    //Find by ingredients will look for the exact match of one of the ingredients
    // such as egg or sugar not gg ugar.
}
  