
public class Statistics {
    
    private int count;
    private int sum;


    public Statistics() {
        this.count = 0; 
        this.sum = 0;
 
    }
    
    public void addNumber(int number) {
        // write code here
        sum = sum+number;
        count++;

    }

    public int getCount() {
        // write code here
        return this.count;
    }
    public int sum(){
        return sum;
    }
  
    
    public double average() {
        // write code here
        if(this.sum != 0 && this.count != 0){
            return 1.0*this.sum/this.count;
        }
        return 0.0;
    }
       
    
    
}
