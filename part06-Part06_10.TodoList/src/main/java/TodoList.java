
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
public class TodoList {
    
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList();
    }
    
    
    public void add(String task){
       this.todoList.add(task);
    }
    
    public void print(){
        int count = 1;
        for(String s:this.todoList){
            System.out.println(count+": "+s);
            count++;
        }
    }
    
    public void remove(int number){
        for(int i=0; i<this.todoList.size(); i++){
            if((i+1) == number){
                this.todoList.remove(this.todoList.get(i));
            }
        }
    }
}
