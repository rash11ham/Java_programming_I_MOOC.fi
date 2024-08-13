
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        ArrayList<Bird> bird = new ArrayList();
        
        UserInterface userFacing = new UserInterface(scan, bird);
        
        userFacing.start();
               

    }

}
