package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Streamrevision {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(2);
        list.add(33);
        list.add(49);
        list.add(57);
        list.add(60);
        List<Integer> stream= list.stream()
                .filter(x->x%2==0)
                .map(x->x/2)
                .distinct()
                        .sorted()
                .limit(4).skip(1).collect(Collectors.toList()) ;
        System.out.println(stream);

    }
}
