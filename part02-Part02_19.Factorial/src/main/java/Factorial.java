
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int fac = 1;
        System.out.print("Give a number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        for(int i = num2; i > 0; i--){
            System.out.println("Factorial: "+(fac=fac*i));
        }

    }
}
