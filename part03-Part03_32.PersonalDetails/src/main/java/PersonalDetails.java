
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String name = "";
        int sum = 0;
        int count = 0;
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            }
            String[] splitted = str.split(",");
            
            int ind = Integer.valueOf(splitted[1]);
            sum+=ind;
            count++;
            int nameLength = splitted[0].length();
            if(nameLength > max){
                max = nameLength;
                name = splitted[0];
            }
           
            
  
            
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+(1.0*sum/count));

    }
}
