package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Fiction {
    public static void main(String[] args) {
//        Function<Integer,Integer> f= x->2*x;
//        Function<Integer,Integer> f1= x->x*x*x;
//        System.out.println(f1.andThen(f).apply(3));
//        System.out.println(f.andThen(f1).apply(3));
Function<String,Integer> function=x->x.length();
Function<String,String> function1=x->x.substring(0,3);
Function<List<Student>, List<Student>> function2= li->{
    List<Student> result=new ArrayList<>();
    for(Student s:li){
        if(function1.apply(s.getName()).equalsIgnoreCase( "Vip")){
            result.add(s);
        }
    }
    return result;
};
Student s1=new Student("Vipul",2);
Student s2=new Student("Krishna",3);
List<Student> result= Arrays.asList(s1,s2);
List<Student> filter=function2.apply(result);
System.out.println(filter);
    }
}
class Student{
     private String name;
     private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}