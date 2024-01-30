
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();
        
        UserInterface userUI = new UserInterface(list, scanner);
        userUI.start();
    }
}
