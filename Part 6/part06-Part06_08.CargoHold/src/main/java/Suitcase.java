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
public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        if ((item.getWeight() + this.totalWeight()) <= maxWeight){
            items.add(item);
        }
    }
    
    public int totalWeight(){
        int total = 0;
        for(Item obj: items){
            total = total + obj.getWeight();
        }
        return total;
    }
    
    public String toString(){
        if (items.isEmpty()){
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } else {
            return items.size() + " items (" + totalWeight() + " kg)";
        }
    }
    
    public void printItems(){
        for(Item item: items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        Item heavy = items.get(0);
        for(Item item: items){
            if (heavy.getWeight() < item.getWeight()){
                heavy = item;
            } else {
                item = heavy;
            }
        }
        return heavy;
    }
}
