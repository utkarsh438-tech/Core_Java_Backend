package MultiThreading.Lifecycle;
class Mythread extends Thread {
    public void run() {
        System.out.println("Hello");


        try {
            Thread.sleep(200000);
            System.out.println("Thread woke up");
        } catch ( Exception e) {
            System.out.println("Interrupted");
    }
        System.out.println("Execution Finished");
}
}
public class Test {
    static void main(String[] args) throws InterruptedException {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(20000);
        System.out.println(t1.getState());
      t1.join();
        System.out.println(t1.getState());

    }
}
