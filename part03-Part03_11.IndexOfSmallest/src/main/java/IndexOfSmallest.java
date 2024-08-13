
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList();
        while(true){
            System.out.println("Enter a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            list.add(input);
        }
        int min = 1000;
        int i = 0;
        for(int n=0; n<list.size(); n++) {  
            if(n < min){
                min = n;
                n = i;
            }
        }
        System.out.println("Smallest number: "+min);
        System.out.println("Fount at index: "+list.indexOf(min));
    }
}
