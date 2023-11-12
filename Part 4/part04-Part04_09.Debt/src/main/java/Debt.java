
public class Debt {
    
    private double bal;
    private double interest;
    
    public Debt (double initialBalance, double initialInterestRate) {
        this.bal = initialBalance;
        this.interest = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println(this.bal);
    }
    
    public void waitOneYear() {
        this.bal = this.bal * this.interest;
    }
}
