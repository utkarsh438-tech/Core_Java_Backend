package MultiThreading.Sync;

public class Test {
    private int test=0;
   public int getTest(){
    return this.test;
   }
    public synchronized void counter(){
        this.test++;
    }
//    public  void counter(){
//        this.test++;
//    }
}
