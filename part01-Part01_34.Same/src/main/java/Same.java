
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String first = scan.nextLine();
        System.out.println("Enter the second string:");
        String second = scan.nextLine();
        if (first.equals(second)) {
            System.out.println("The strings were the Same!");
        } else {
            System.out.println("The strings were Different!");
        }
    }
}
