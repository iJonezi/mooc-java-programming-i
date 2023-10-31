
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        
        while (true){
            System.out.println("Give a number:");
            int add = Integer.valueOf(scanner.nextLine());
            
            if (add != 0){
                num = num + add;
                continue;
            } else if (add == 0){
                break;
            }
        }
        System.out.println("Sum of the numbers: " + num);
    }
}
