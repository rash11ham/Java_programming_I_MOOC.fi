
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        while(true){
            String str = scanner.nextLine();

            String[] splitted = str.split(" ");
            for(String s : splitted){
                System.out.println(s);
            }
            if(str.equals("")){
                break;
            }
        }

    }
}
