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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> list = new ArrayList<>();
    
    public Hold (int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase cases: list){
            totalWeight = totalWeight + cases.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int newWeight = this.totalWeight() + suitcase.totalWeight();
        if (newWeight <= this.maxWeight){
            list.add(suitcase);
        }
    }
    
    public String toString(){
        return list.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for (Suitcase suitcase: list){
            suitcase.printItems();
        }
    }
}
