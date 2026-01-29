package MultiThreading.Creation;

public class Main {
    static void main(String[] args) {
//Thread_creation t1=new Thread_creation();
//t1.start();
        Using_Runnable Ur = new Using_Runnable();
        Thread t2=new Thread(Ur);
        t2.start();
for ( ; ; ) {
    System.out.println("Hello");
}
    }
}
