/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Input {
    private String identifier;
    private String name;

    public Input(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    public boolean equals (Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Input)){
            return false;
        }
        Input input = (Input)compared;
        if(this.identifier.equals(input.identifier)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }
    
    
    
}
