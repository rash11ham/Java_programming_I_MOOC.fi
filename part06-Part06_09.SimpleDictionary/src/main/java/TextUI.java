
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
       
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(command.equals("add")){
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word,translation);
            } else if(command.equals("search")){
                System.out.println("To be translated: ");
                String word = scanner.nextLine();
                if(getTrans(word).equals("")){
                    System.out.println("Word "+word+" was not found");
                } else {
                    
                    System.out.println("Translation: "+getTrans(word));
                }
            }
            
            else {
                System.out.println("Unknown command");
            }
        }
    }
    
    public String getTrans(String word){
        String value = "";
        for(Entry<String, String> entry: this.simpleDictionary.getTranslation().entrySet()){
            if(word.equals(entry.getKey())){
                value = entry.getValue();
            }
        }
        return value;
    }
}
