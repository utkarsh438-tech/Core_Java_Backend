package MultiThreading.Creation;

public class Using_Runnable implements Runnable {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("                            world");
        }
    }
}
