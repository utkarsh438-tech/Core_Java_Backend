package MultiThreading.Creation;

public class Thread_creation extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("World");
        }
    }
}
