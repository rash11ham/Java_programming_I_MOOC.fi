
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
               // int addNum = Integer.valueOf(scan.nextLine());
                first.add(amount);
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
