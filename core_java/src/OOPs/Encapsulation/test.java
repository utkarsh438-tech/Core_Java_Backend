package OOPs.Encapsulation;

public class test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setAge(20);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
