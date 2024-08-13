
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double avg = 0;
        int count = 0;
        int sum = 0;
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
             
            if(num == 0){
                
                break;
            } else if(num > 0) {
                count++;
                sum = sum+num;
                avg =(double)sum/count;
            }
        }
        if(count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(avg);
        }
        

    }
}
