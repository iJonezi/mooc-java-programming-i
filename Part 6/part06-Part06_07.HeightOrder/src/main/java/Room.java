import java.util.ArrayList;
public class Room {
    private ArrayList<Person> people = new ArrayList<>();
    
    public void add(Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        if (people.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return people;
    }
    
    public Person shortest(){
        if (this.isEmpty()){
            return null;
        }
        
        Person shortest = people.get(0);
        
        for (Person prs: people){
            if (prs.getHeight() < shortest.getHeight()){
                shortest = prs;
            }
        }
        
        return shortest;
    }
    
    public Person take(){
        if (people.isEmpty()){
            return null;
        }
        
        Person remove = this.shortest();
        people.remove(remove);
        return remove;
        
    }
}
