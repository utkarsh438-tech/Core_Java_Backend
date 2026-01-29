package generics;

public class stringcontainer implements Container<String> {
private String item;
    @Override
    public void add(String value) {
this.item = value;
    }

    @Override
    public String get() {
        return this.item;
    }
}
