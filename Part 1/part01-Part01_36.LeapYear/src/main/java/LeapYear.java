
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        boolean fourhun = year % 400 == 0;
        boolean onehun = year % 100 == 0;
        boolean four = year % 4 == 0;
        
        if (onehun && fourhun){
            System.out.println("The year is a leap year.");
        } else if(!onehun && fourhun){
            System.out.println("The year is not leap year.");
        } else if (onehun && !fourhun) {
            System.out.println("The year is not a leap year.");
        } else if (four){
            System.out.println("The year is a leap year.");
        } else if (!four){
            System.out.println("The year is not a leap year.");
        }
    }
}
