package Java8;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class revsiontypeoffunctional
{
    static void main(String[] args) {
        Predicate<Integer> p= x->x%2==0;
        Function<Integer,Integer> f= x->x%2;
        Consumer<Integer> c= x->System.out.println(x);
        Supplier<Integer> s=()->100;
        if(p.test(s.get())){
            c.accept(f.apply(s.get()));
        }
    }
}
