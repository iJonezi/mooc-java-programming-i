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
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String cmd = this.scanner.nextLine();
            
            if (cmd.equals("stop")){
                break;
            } else if (cmd.equals("add")){
                System.out.println("To add:");
                String task = this.scanner.nextLine();
                this.list.add(task);
                continue;
            }else if (cmd.equals("list")){
                this.list.print();
                continue;
            }else if (cmd.equals("remove")){
                System.out.println("Which one is removed?");
                int rmv = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(rmv);
            }
        }
    }
}
