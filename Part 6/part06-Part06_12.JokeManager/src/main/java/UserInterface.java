/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jones
 */
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private JokeManager manager;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String input = scanner.nextLine();
            
            if (input.equals("1")){
                System.out.println("Write the joke to be added:");
                String newJoke = scanner.nextLine();
                manager.addJoke(newJoke);
                continue;
            }
            if (input.equals("2")){
                System.out.println(manager.drawJoke());
                continue;
            }
            if (input.equals("3")){
                manager.printJokes();
                continue;
            }
            if (input.equals("x") || input.equals("X")){
                break;
            }
        }
    }
}
