
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Paul", "Hey baby how are you doing today.");
        MessagingService msgService = new MessagingService();
        
        msgService.add(message);
        System.out.println(msgService);
        
        
    }
}
