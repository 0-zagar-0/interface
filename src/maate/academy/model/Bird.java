package maate.academy.model;

public class Bird extends Animal {

    @Override
    public void eat(Food food) {
        System.out.println("Bird accepted food");
    }


}
