
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        Container first = new Container("First");
        Container second = new Container("Second");

        while (true) {
            
            System.out.print(first);
            System.out.print(second);
            
            String input = scan.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
               // int addNum = Integer.valueOf(scan.nextLine());
                first.addLiters(amount);
            }
            
            if(command.equals("move")){
                //int addNum = Integer.valueOf(scan.nextLine());
                first.moveLiters(amount, second);
            }
            
            if(command.equals("remove")){
                //int addNum = Integer.valueOf(scan.nextLine());
                second.remove(amount);
            }
        }
    }

}
