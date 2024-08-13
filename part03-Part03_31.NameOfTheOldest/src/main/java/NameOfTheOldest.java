
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String name = "";
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            }
            String[] splitted = str.split(",");
            
            int ind = Integer.valueOf(splitted[1]);
            if(ind > max){
                max = ind;
                name = splitted[0];
            } 
            
        }
        System.out.println("Age of the oldest: "+name);

    }
}
