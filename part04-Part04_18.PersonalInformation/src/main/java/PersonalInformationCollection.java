
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("First name: ");
            String fstName = scanner.nextLine();
            if(fstName.isEmpty()){               
                break;
            }
            
            System.out.println("Last name: ");
            String lstName = scanner.nextLine();
            System.out.println("Identification number: ");
            String idNum = scanner.nextLine();
            
            
            infoCollection.add(new PersonalInformation(fstName, lstName, idNum));
        }
        for(PersonalInformation pi : infoCollection){
            System.out.println(pi.getFirstName()+" "+pi.getLastName());
        }

    }
}
