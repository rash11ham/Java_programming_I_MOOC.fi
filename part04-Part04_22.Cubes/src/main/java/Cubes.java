      
        
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }
            int cube = Integer.valueOf(row);
            int cubes = cube*cube*cube;
            
            System.out.println(cubes);
        }

    }
}
