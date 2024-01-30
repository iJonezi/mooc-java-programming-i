/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jones
 */
public class Container {
    private int total;
    
    public int contains() {   
        return total;
    }
    
    public void add(int amount){
        if ((amount >= 0) && ((this.total + amount) <= 100)){
            this.total += amount;
        } else if ((this.total + amount) > 100) {
            this.total = 100;
        }
    }
    
    public void remove(int amount){
        if ((amount >= 0) && ((this.total - amount) >= 0)){
            this.total -= amount;
        } else if ((this.total - amount) <= 0){
            this.total = 0;
        }
    }
    
    public String toString(){
        return String.valueOf(total) + "/100";
    }
}
