package maate.academy.model;

public class Cat extends Animal {

    @Override
    public void eat(Food food) {
        System.out.println("Cat accepted food");
    }
}
