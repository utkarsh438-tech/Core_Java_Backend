package generics;


interface printable{
    void print();
}
class Mynumber  extends Number implements printable{
    private final int item;

    Mynumber(int item) {
        this.item = item;
    }

    @Override
    public void print() {
        System.out.println("hello");
    }
    @Override
    public int intValue() {
        return item;
    }
    @Override
    public long longValue() {return item;}

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

}
class  Boxx<T extends Number & printable >{
    private T value;
    Boxx(T value) {
        this.value = value;
    }
    public void display(){
        value.print();
    }
}
public class test {
public static void main(String[] args) {

    Boxx<Mynumber> b=new Boxx<>(new Mynumber(1));
b.display();
}
}