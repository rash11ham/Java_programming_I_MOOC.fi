
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String str = scanner.nextLine();

            String[] splitted = str.split(" ");
            for(String s : splitted){
                if(s.contains("av")) System.out.println(s);
            }
            if(str.equals("")){
                break;
            }
        }

    }
}
