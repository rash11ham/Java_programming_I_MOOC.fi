
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
             String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }

            int number = Integer.valueOf(row);
            System.out.println(row);
        }
    }
}
