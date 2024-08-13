
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner read = new Scanner(Paths.get(file))) {
            int count = 0;
            // we read all the lines of the file
            while (read.hasNextInt()) {
                list.add(read.nextInt());
            }
            for(Integer l : list){
                if(l>=lowerBound && l <=upperBound){
                    count++;
                }
            }
            System.out.println("Numbers: "+count);
        } catch (Exception e) {
            System.out.println("Reading the file " +file+" failed.");
        }

    }

}
