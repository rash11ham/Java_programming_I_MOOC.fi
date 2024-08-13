/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Timer {
    private ClockHand hundredOfSecond;
    private ClockHand seconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredOfSecond = new ClockHand(100);
    }
    
    

    public void advance(){
        this.hundredOfSecond.advance();
        if(this.hundredOfSecond.value()== 0){
            this.seconds.advance();
        }
    }
    @Override
    public String toString() {
        return  this.seconds+":"+this.hundredOfSecond;
    }

    
    
    
}
