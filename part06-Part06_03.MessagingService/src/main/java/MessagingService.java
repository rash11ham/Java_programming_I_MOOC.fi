
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
public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList();
    }
    
    public void add(Message message){
        int count = 0;
        String str = message.getContent();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!= ' '){
                count++;
            }
        }
        if(count <= 280){
            messages.add(message);
        }
    }
    public ArrayList<Message> getMessages(){
        return this.messages;
    }

    @Override
    public String toString() {
        return "MessagingService{" + "messages=" + messages + '}';
    }
    
    
}
