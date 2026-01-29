package MultiThreading.Methods;

import java.util.ArrayList;

class mythread implements Runnable{
    @Override
            public void run(){

            System.out.println("hola"+Thread.currentThread().getName());

//        System.out.println("Start");
    }

}


public class Test {
    static void main(String[] args) {
        Thread T1 = new Thread(new mythread());
//        T1.start();
//        System.out.println(T1.getState());
        ArrayList<Thread> a=new ArrayList<>();
        while(a.size()<1e5){
            Thread T2 = new Thread(new mythread());
            int x= (int) (Math.random()*10+1);
            T2.setPriority(x);
            T2.start();
            a.add(T2);
        }
        System.out.println("Finish");
        System.out.println(a);
    }
}
