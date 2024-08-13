
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ArrayList<Integer> grades = new ArrayList();
        Grade grade = new Grade();
        
        
        while(true){
            System.out.println("Enter points totals, -1 stops:");
            int point = Integer.valueOf(scanner.nextLine());
            if(point == -1){
                System.out.println("Point average (all): "+grade.getAverage(grades));
                if(grade.getAverageOfPassingNumbers(grades) == -1){
                    System.out.println("Point average (passing):-");
                } else {
                    System.out.println("Point average (passing): "+grade.getAverageOfPassingNumbers(grades));
                }
                System.out.println("Pass percentage: "+grade.passPercent(grades));
                grade.printGrades(grade.countGradeRank(grades));
                break;
            }
            if(point > 0 && point <= 100){
                grades.add(point);
            }
                               
        }
    }
}
