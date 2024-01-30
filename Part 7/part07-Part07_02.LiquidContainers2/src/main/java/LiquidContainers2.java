
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container.toString());
            System.out.println("Second: " + container2.toString());
            System.out.println("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = 0;
            if ((Integer.valueOf(parts[1])) >= 0){
                amount = Integer.valueOf(parts[1]);
            }
            
            if (cmd.equals("add")){
                container.add(amount);
                continue;
            }
            
            if (cmd.equals("remove")){
                container2.remove(amount);
                continue;
            }
            
            if (cmd.equals("move")){
                if (container.contains() >= amount){
                    container.remove(amount);
                    container2.add(amount);
                } else if (container.contains() <= amount){
                    container2.add(container.contains());
                    container.remove(amount);
                }
                continue;
            }
        }
    }
}
