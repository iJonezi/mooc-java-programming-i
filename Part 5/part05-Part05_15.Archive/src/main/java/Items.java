/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jones
 */
public class Items {
    private String id;
    private String name;
    
    public Items(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public Items(String id){
        this.id = id;
    }
    
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Items)){
            return false;
        }
        
        Items nextItem = (Items) compared;
        
        if (this.id.equals(nextItem.id)){
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        if(this.name.isEmpty()){
            return this.id + ":";
        }
        
        return this.id + ": " + this.name;
    }
    
    public String getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
}
