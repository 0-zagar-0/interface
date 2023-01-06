package maate.academy.model;

public class Fish extends Animal implements Swimmable {

    @Override
    public void eat(Food food) {
        System.out.println("Fish accepted food");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
