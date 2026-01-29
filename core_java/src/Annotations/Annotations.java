package Annotations;

import java.util.ArrayList;

public class Annotations {
    @Deprecated
    public void oldMethod() {
        System.out.println("This is a deprecated method.");
    }

    @SuppressWarnings("unchecked")
    public void uncheckedExample() {
        ArrayList list = new ArrayList();
        list.add("Hello");
        System.out.println(list.get(0));
    }

    @SafeVarargs
    private final <T> void printAll(T... elements) {
        for (T e : elements) {
            System.out.println(e);
        }
    }

    public void testSafeVarargs() {
        printAll("A", "B", "C");
    }
}

class AnnotationDemoChild extends Annotations {
    @Override
    public void oldMethod() {
        System.out.println("Child overrides oldMethod()");
    }
}


class AnnotationDemoMain {
    public static void main(String[] args) {
        Annotations parent = new Annotations();
        parent.oldMethod();
        parent.uncheckedExample();
        parent.testSafeVarargs();
        Annotations child = new Annotations();
        child.oldMethod();

    }
}