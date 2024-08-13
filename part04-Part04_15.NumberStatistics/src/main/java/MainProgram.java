
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        
        Statistics sum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());

        while(true){
            System.out.println("Enter numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                System.out.println("Sum: "+sum.sum());
                System.out.println("Sum of even numbers: "+evenSum.sum());
                System.out.println("Sum of odd numbers: "+oddSum.sum());
                break;
            } else {
                sum.addNumber(number);
                if(number % 2 == 0){
                   evenSum.addNumber(number);
                } else{
                    oddSum.addNumber(number);
                }
            }
            
        }
        
        
    }
}
