
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int point = Integer.valueOf(scan.nextLine());
        if(point < 5000){
            System.out.println("No tax!");
        } else if (point >= 5000 && point < 25000) {
            System.out.println("Tax: "+(100+(point-5000)*0.08));
        } else if (point >= 25000 && point < 55000) {
            System.out.println("Tax: "+(1700+(point-25000)*0.10));
        } else if (point >= 55000 && point < 200000) {
            System.out.println("Tax: "+(4700+(point-55000)*0.12));
        } else if (point >= 200000 && point < 1000000) {
            System.out.println("Tax: "+(22100+(point-200000)*0.15));
        } else if (point > 1000000) {
            System.out.println("Tax: "+(142100+(point-1000000)*0.17));
        }

    }
}
