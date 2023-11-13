import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> book = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.println("Title: ");
            String title = input.nextLine();
            if (title.isBlank()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(input.nextLine());
            
            System.out.println("Publication year: ");
            int pubyear = Integer.valueOf(input.nextLine());
            
            book.add(new Book(title, pages, pubyear));
        }
        
        System.out.println("What information will be printed? ");
        String request = input.nextLine();
        
        if (request.equals("everything")){
            for (Book info: book){
                System.out.println(info);
            }
        } else if (request.equals("name")){
            for (Book info: book) {
                System.out.println(info.nameOnly());
            } 
        } else if (request.equals("name and pages")){
            for (Book info: book) {
                System.out.println(info.namePages());
            }
        }

    }
}
