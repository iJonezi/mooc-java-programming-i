
public class YourFirstAccount {

    public static void main(String[] args) {
        Account bob = new Account("Bob's Account", 100.0);
        bob.deposit(20.0);
        System.out.println(bob);
    }
}
