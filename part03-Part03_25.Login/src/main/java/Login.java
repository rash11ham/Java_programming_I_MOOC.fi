
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] array = {"alex", "sunshine", "emma", "haskell"};
        
        System.out.println("Enter username");
        String user = scanner.nextLine();
        System.out.println("Enter password");
        String pass = scanner.nextLine();
        if(user.equals(array[0]) && pass.equals(array[1])){
            System.out.println("You have successfully logged in!");
        } else if(user.equals(array[2]) && pass.equals(array[3])){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
