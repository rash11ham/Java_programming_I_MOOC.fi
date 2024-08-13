
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Grade {
    private int number;

    public Grade() {
        this.number = 0;
    }
    
    
    
    public double getAverage(ArrayList<Integer> numbers){
       int sum = 0;
       for(int s: numbers){
           sum+=s;
       }
       return 1.0*sum/numbers.size();
    }
    
    public double getAverageOfPassingNumbers(ArrayList<Integer> numbers){
        
        ArrayList<Integer> temp = new ArrayList();
        for(int i: numbers){
            if(i >= 50){
                temp.add(i);    
            }
        }
        if(temp.size() > 0){
            return this.getAverage(temp);
        }else {
            return -1;
        }
    }
    
    public double passPercent(ArrayList<Integer> numbers){
        int count = 0;
        for(int i: numbers){
            if(i >= 50){
                count++;    
            }
        }
        return (100.0*count/numbers.size());
    }
    
  
    
    
    public int[] countGradeRank(ArrayList<Integer> numbers){
        int[] grade = new int[6];
        int fives = 0, fours = 0, threes = 0, twos = 0, ones = 0, zeros = 0;
        for(Integer i: numbers){
            if(i < 50){
                grade[0]++;
            }else if(i < 60){
                grade[1]++;
            }else if(i < 70){
                grade[2]++;
            }else if(i < 80){
                grade[3]++;
            }else if(i < 90){
                grade[4]++;
            }else{
                grade[5]++;
            }
        }
        return grade;
    }
    
    public void printGrades(int[] grades) {
        System.out.print("5: ");
        printStar(grades[5]);
        System.out.print("4: ");
        printStar(grades[4]);
        System.out.print("3: ");
        printStar(grades[3]);
        System.out.print("2: ");
        printStar(grades[2]);
        System.out.print("1: ");
        printStar(grades[1]);
        System.out.print("0: ");
        printStar(grades[0]);

    }

    public void printStar(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    
}
