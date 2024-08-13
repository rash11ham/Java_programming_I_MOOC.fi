
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
    
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String word = scanner.nextLine();
            if(word.equals("stop")){
                break;
            }
            if(word.equals("add")){
                System.out.println("To add: ");
                String wordAdd = scanner.nextLine();
                this.list.add(wordAdd);
            }
            if(word.equals("list")){
                this.list.print();
            }
            if(word.equals("remove")){
                System.out.println("Which one is removed? ");
                int id = Integer.valueOf(scanner.nextLine());
                this.list.remove(id);
            }
        }
    }
    
}
