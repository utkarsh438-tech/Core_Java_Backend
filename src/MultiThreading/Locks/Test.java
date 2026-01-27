package MultiThreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    static void main(String[] args) {
bank Bank = new bank();
Runnable task=new Runnable(){
    public void run(){
        Bank.withdraw(100);
    }
};
Thread t1=new Thread(task,"Thread1");
        Thread t2=new Thread(task,"Thread2");
        t1.start();
        t2.start();
    }
}
