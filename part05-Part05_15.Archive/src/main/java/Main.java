
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Input> list = new ArrayList<>();
        
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
             if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Input input = new Input(identifier, name);
            if(list.contains(input)){
                
            } else {
                list.add(input);
            }            
             
            
        }

        for(Input in: list){
            System.out.println(in);
        }

    }
}
