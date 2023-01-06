package maate.academy.model;

public class Sparrow extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
