
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        System.out.print("Where to?");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int num2 = Integer.valueOf(scanner.nextLine());
        for(int i = num1; i <= num2; i++){
            System.out.println(sum+=i);
        }

    }
}
