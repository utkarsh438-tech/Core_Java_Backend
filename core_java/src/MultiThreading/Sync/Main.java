package MultiThreading.Sync;

public class Main {
    static void main(String[] args) {
        Test test = new Test();
        Mythread t1 = new Mythread(test);
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t1);
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        int x = (int)Math.random()*1000+1, val = test.getTest();
        if ((val == 2000)) {
            System.out.println(x);
        } else {
            System.out.println(val);
        }
    }
}
