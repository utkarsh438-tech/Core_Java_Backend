package Java8;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    static void main(String[] args) {
//        Functional f=()->"Software";
//        System.out.println(f.happy());
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);
    }
}
