/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jones
 */
import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<String>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        for (int i = 0; i < this.list.size(); i++){
            int listNumb = i + 1;
            System.out.println(listNumb + ": " + this.list.get(i));
        }
    }
    
    public void remove(int number){
        int trueNumb = number - 1;
        this.list.remove(trueNumb);
    }
}
