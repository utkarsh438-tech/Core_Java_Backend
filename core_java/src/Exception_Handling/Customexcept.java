package Exception_Handling;

public class Customexcept extends Exception {

    public Customexcept(String message, int amount, int balance) {
        super(message+" "+"$"+(amount-balance));
    }
}
