
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Bird {
    private String englishName;
    private String latinName;
    private int observation;
 

    public Bird() {
        this.observation = 0;
    }
    
    public Bird(String englishName, String latName) {
        
        this.englishName = englishName;
        this.latinName = latName;
        this.observation = 0;
 
        
    }
    

    public String getEnglishName() {
        return englishName;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public void setObservation(int observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return  this.englishName + " (" + latinName + "): " + observation + " observations";
    }

   
    
    
    
}
