
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n"
                + "What is the main character called?");
        String greet = scanner.nextLine();
        System.out.println("What is their job?");
        String greet1 = scanner.nextLine();
        System.out.println("Here is the story:\n" +
                    "Once upon a time there was "+greet+", who was "+greet1+".\n" +
                    "On the way to work, "+greet+" reflected on life.\n" +
                    "Perhaps "+greet+" will not be "+greet1+" forever.");
        
       

    }
}
