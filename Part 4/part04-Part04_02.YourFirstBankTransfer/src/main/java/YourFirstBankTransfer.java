
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthew = new Account("Matthews account", 1000.0);
        Account my = new Account("My account", 0.0);
        
        matthew.withdrawal(100.0);
        my.deposit(100.0);
        System.out.println(matthew);
        System.out.println(my);
    }
}
