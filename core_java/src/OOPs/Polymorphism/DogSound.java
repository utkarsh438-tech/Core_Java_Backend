package OOPs.Polymorphism;

import OOPs.Inheritance.Animal;

public class DogSound extends Animalsound {
    @Override
    public void sound() {
        System.out.println("Dog makes a sound.");
    }
}
