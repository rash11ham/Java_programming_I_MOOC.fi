/
import java.util.ArrayList;
/*0.+























































































































































































































































































































































































































































































































































































































































































































































.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rashe
 */
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        if(persons.size() == 0){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        int shortestHeight = 300;
        Person person = null;
        for(Person p: persons){
            if(shortestHeight > p.getHeight()){
                shortestHeight = p.getHeight();
                person = p;
            }
        }
        return person;
    }
    
    public Person take(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person person = (Person)shortest();
        for(Person per: this.persons){
            if(per.equals(person)){
                persons.remove(per);
                break;
            }
        }
        return person;
    }

    
    
    
    
}
