package innerclass;

public class Shopping {
    private double amount;

    public Shopping(double amount) {
        this.amount = amount;
    }
    public void ProcessPayment( Payement payement){
payement.pay(amount);
    }
}
