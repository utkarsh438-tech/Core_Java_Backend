package OOPs.Polymorphism;

public class Overload {
    public static void main(String[] args) {
        test c = new test();
        System.out.println("Sum (int): " + c.add(5, 10));
        System.out.println("Sum (double): " + c.add(5.5, 10.5));
    }
}
