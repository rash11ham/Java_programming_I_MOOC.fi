
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }
        int longest = 0;
        String str = "";
        for(String s: this.elements){
            if(longest < s.length()){
                longest = s.length();
                str = s;
            } 
                
            
        }
        return str;
    }
}
