
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner read = new Scanner(Paths.get(file))) {
            boolean found = false;
            // we read all the lines of the file
            while (read.hasNextLine()) {
                list.add(read.nextLine());
                if(list.contains(searchedFor)){
                    System.out.println("Found!");
                    found = true;
                    break;
                } 
                found = false;
            }
            if(found == false){
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " +file+" failed.");
        }

    }
}
