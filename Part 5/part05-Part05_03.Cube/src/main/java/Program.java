
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the edge length of the cube?");
        int input = Integer.valueOf(scanner.nextLine());
        
        Cube cube = new Cube(input);
        
        System.out.println(cube);
    }
}
