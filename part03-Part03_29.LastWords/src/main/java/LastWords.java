
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String str = scanner.nextLine();

            String[] splitted = str.split(" ");
            System.out.println(splitted[splitted.length-1]);
            if(str.equals("")){
                break;
            }
        }
    }
}
