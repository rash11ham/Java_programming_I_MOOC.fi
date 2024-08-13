
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String str = scanner.nextLine();

            String[] splitted = str.split(" ");
            System.out.println(splitted[0]);
            if(str.equals("")){
                break;
            }
        }
    }
}
