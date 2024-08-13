
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {9,11,9,3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);

    }

    public static int smallest(int[] array){
        // write your code here
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    
    public static int indexOfSmallest(int[] array){
        // write your code here
        int min = smallest(array);
        int index = 0;
        for(int i=0; i<array.length; i++){
            if(min == array[i]){
                index = i;
            }   
        }
        return index;
        
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int min = 100000;
        int index = 0;
        int[] newArr = Arrays.copyOfRange(table,startIndex,table.length);
        for(int i=startIndex; i<table.length; i++){
            if(min > table[i]){
                min = table[i];
                index = i;
            }
           
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println(Arrays.toString(array));
    }
    
    public static void sort(int[] array) {

        for(int i=0; i<array.length; i++){
            swap(array,i,indexOfSmallestFrom(array,i));

        }
    } 

}
