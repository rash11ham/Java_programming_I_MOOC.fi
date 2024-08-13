
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[2];
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        
        try (Scanner read = new Scanner(Paths.get(file))) {
            String name = "";
            int age = 0;
            // we read all the lines of the file
            while (read.hasNextLine()) {
                String line = read.nextLine();
                arr = line.split(",");
                name = arr[0];
                age = Integer.valueOf(arr[1]);
                System.out.println(name+", age: "+age+ " years");
            }
            
            
        } catch (Exception e) {
            System.out.println("Reading the file " +file+" failed.");
        }

    }
}
