
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String itemName = scanner.nextLine();
            if (itemName.isEmpty()) {
                System.out.println(items);
                break;
            }

        
            // Add to the list a new person
            // whose name is the previous user input
            items.add(new Item(itemName));
        }

    }
}
