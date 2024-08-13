
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("beginning number");
        int num1 = Integer.valueOf(scanner.nextInt());
        System.out.println("End number");
        int num2 = Integer.valueOf(scanner.nextInt());
        divisibleByThreeInRange(num1, num2);
        

    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for(int i=beginning; i<=end; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
