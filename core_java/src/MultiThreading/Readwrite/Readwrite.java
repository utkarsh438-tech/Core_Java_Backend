package MultiThreading.Readwrite;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Readwrite{
    private int count=0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock(true);
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
         writeLock.lock();
        try {
            count++;
            Thread.sleep(100);
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally {
            writeLock.unlock();
        }
    }
    public int getCount(){
        readLock.lock();
        try
        {
return  count;
        }finally {
                readLock.unlock();
        }
    }


}
