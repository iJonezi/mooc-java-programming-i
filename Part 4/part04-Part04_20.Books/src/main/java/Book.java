
public class Book {
    private String title;
    private int pages;
    private int pubyear;
    
    public Book(String bookTitle, int pages, int pubyear){
        this.title = bookTitle;
        this.pages = pages;
        this.pubyear = pubyear;
    }
    
    public String nameOnly(){
        return title;
    }
    
    public String namePages(){
        return title + ", " + pages + " pages";
    }
    
    @Override
    public String toString(){
        return title + ", " + pages + " pages, " + pubyear;
    }
}
