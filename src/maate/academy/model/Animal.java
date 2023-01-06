package maate.academy.model;

public abstract class Animal {
    private String name;
    private boolean isHungry; // голодная или нет

    public abstract void eat(Food food);
}
