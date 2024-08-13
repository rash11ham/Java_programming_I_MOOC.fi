
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        System.out.print("Where from?");
        int num = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i <= num; i++){
            System.out.println(sum = sum+i);
        }

    }
}
