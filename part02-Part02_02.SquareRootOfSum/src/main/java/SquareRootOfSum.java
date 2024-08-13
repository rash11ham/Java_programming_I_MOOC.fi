
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Give a number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        if(num1 >= 0 && num2 >=0){
            Double squareRoot = Math.sqrt(num1+num2);
            System.out.println(squareRoot);
        }
        

    }
}
