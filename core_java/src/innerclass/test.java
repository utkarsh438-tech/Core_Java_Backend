package innerclass;

public class test {
        static void main(String[] args) {


//car car=new car("fronx");
//        car.Engine e=car.new Engine();
//        e.stop();
//        e.start();
//                Hotel h=new Hotel("Ekta Hotel",20,1000);
//                h.reserved("akhit",10);
//                h.reserved("Sanchit",20);
//

Shopping s=new Shopping(120);
s.ProcessPayment(new Payement() {
        public void pay(double amount) {
                System.out.println("pay using credit card "+amount);
        }
});
}

}
