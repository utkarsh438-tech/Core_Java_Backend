package MultiThreading.Readwrite;

public class Test  {
    static void main(String[] args)  throws Exception {
        Readwrite readwrite=new Readwrite();
        Runnable readTask=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    System.out.println(Thread.currentThread().getName()+" reading: "+readwrite.getCount());
                }
            }
        };
        Runnable writeTask=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    for(int j=0;j<10;j++) {
                    readwrite.increment();
                        System.out.println(Thread.currentThread().getName()+" write: ");
                    }
                }
            }
        };
        Thread t2=new Thread(writeTask,"Write2");
        Thread t1=new Thread(readTask,"Read1");
        Thread t3=new Thread(readTask,"Read3");
        t2.start();
        t1.start();
        t3.start();
        t2.join();
        t1.join();
        t3.join();
        System.out.println(readwrite.getCount());
    }
}
