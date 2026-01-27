package MultiThreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bank{
    private int balance=100;
    private final Lock lock = new ReentrantLock();
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting withdrawing "+amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MICROSECONDS)){
                if(balance>=amount){
                    try{
                        System.out.println(Thread.currentThread().getName()+" procedding with withdrawing "+amount);
                        Thread.sleep(1000);
                        balance-=amount;
                        System.out.println(Thread.currentThread().getName()+"  completed withdrawl "+balance);
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName()+" failed withdrawing "+amount);
                }
            }else  {
                System.out.println(Thread.currentThread().getName()+" could not acquire the lock, will try later");
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    
}
