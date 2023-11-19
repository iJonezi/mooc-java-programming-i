
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.price = this.princePerSquare * this.squares;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        if ((this.price - compared.price) < 0) {
            return (this.price - compared.price) * -1;
        } else {
            return (this.princePerSquare * this.squares) - (compared.princePerSquare * compared.squares);
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if (this.price > compared.price){
            return true;
        } else {
            return false;
        }
    }
}
