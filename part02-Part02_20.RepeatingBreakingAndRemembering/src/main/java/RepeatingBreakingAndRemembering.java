
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int evenCount = 0;
        int oddCount = 0;
        double avg = 0;
        int count = 0;
        int sum = 0;
        while(true){
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                System.out.println("Thx1 Bye!");
                break;
            }
            if(num != -1){
                count++;
                sum = sum+num;
                avg = (double)sum/count;  
            }
            if(num % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
            
        }
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+count);
        System.out.println("Average: "+avg);
        System.out.println("Even: "+evenCount);
        System.out.println("Odd: "+oddCount);
        

    }
}
