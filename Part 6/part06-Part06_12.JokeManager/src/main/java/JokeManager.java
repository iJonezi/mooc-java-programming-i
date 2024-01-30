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
import java.util.Random;
public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();
    
    public JokeManager(){
        this.jokes = jokes;
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        Random random = new Random();
        if (jokes.size() == 0){
            return "Jokes are in short supply.";
        }
        int index = random.nextInt(jokes.size());
        return this.jokes.get(index);
    }
    
    public void printJokes(){
        for (String joke : jokes){
            System.out.println(joke);
        }
    }
}
