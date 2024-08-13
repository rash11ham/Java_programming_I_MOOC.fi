
import java.util.ArrayList;
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
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner, ArrayList<Bird> birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start(){
        while(true){
            System.out.println("?");
            String command = getInput();
            if(command.equals("Add")){
                addBird();                
            }
            if(command.equals("Observation")){
                obsCount();   
            }
            if(command.equals("One")){
                printOne();
            }
            if(command.equals("All")){
                printAll();
            }
            if(command.equals("Quit")){
                break;
            }
     
        }
    }  
    
    public String getInput(){
        String input = scanner.nextLine();
        return input;
    }
    
    public void addBird(){
        System.out.println("Name:");
        String name = getInput();
        System.out.println("Name in latin:");
        String latName = getInput();
        this.birds.add(new Bird(name, latName));
        System.out.println(this.birds);
    }
    
    public void obsCount(){
        System.out.println("Bird?");
        String name = getInput();
        
        for(Bird bird: birds){
            if(bird.getEnglishName().equals(name)){
                bird.setObservation(bird.getObservation()+1);
            } else if(!(bird.getEnglishName().equals(name))){
                System.out.println("Not a bird!");
            }
        }
        
    }
    
    public void printOne(){
        System.out.println("Bird?");
        String name = getInput();
        for(Bird bird: birds){
            if(bird.getEnglishName().contains(name)){
                System.out.println(bird);
            } 
        }
    }
    
    public void printAll(){
        for(Bird bird: birds){
            System.out.println(bird);
        }
    }
    
    
}
