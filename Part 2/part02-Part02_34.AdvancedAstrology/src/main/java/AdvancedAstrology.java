
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spaces = size - 1;
        for (int i = 1; i <= size; i++){
            printSpaces(spaces);
            printStars(i);
            spaces--;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;
        while (i <= height){
            printSpaces(j);
            printStars(i * 2 - 1);
            i++;
            j--;
        }
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
