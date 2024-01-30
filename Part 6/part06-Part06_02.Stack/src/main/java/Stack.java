import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list = new ArrayList<>();
    
    public boolean isEmpty(){
        if (this.list.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value){
        this.list.add(value);
    }
    
    public ArrayList<String> values(){
        return list;
    }
    
    public String take(){
        return this.list.remove(this.list.size() - 1);
    }
}
