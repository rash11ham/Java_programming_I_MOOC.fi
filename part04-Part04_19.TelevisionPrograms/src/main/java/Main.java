import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Name: ");
            String fstName = scanner.nextLine();
            if(fstName.isEmpty()){  
                System.out.println("Program's maximum duration?");
                int maxDuration = Integer.valueOf(scanner.nextLine());
                for(TelevisionProgram n : programs){
                    if(n.getDuration() <= maxDuration){
                        System.out.println(n.getName()+", "+ n.getDuration());
                    }
                }
                break;
            }
            
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            
            
            programs.add(new TelevisionProgram(fstName, duration));
        }
    }
}
