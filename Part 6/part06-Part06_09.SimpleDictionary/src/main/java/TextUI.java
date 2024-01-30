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
import java.util.ArrayList;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI (Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while (true) {
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if (input.equals("add")){
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String tran = this.scanner.nextLine();
                
                this.dictionary.add(word, tran);
                continue;
            } else if (input.equals("search")){
                System.out.println("To be translated:");
                String search = this.scanner.nextLine();
                String result = this.dictionary.translate(search);
                if (result == null){
                    System.out.println("Word " + search + " was not found.");
                    continue;
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(search));
                    continue;
                }
            }
            
            System.out.println("Unknown command");
        }
    }
}
