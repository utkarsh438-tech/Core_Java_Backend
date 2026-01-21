package Exception_Handling;

public class test {
    private final int balance;

    public test(int balance) {
        this.balance = balance;
    }

    public void withDraw(int amount) throws Customexcept {
        if(amount>balance){
            throw new Customexcept("Insufficient Balance ",amount,balance);
        }
    }
}
