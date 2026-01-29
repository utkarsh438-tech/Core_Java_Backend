package MultiThreading.Sync;

public class Mythread implements Runnable {
    public Test test ;

    public Mythread(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.test.counter();
        }
    }
}
