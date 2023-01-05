package maate.academy.model;

import java.util.Random;

public class Circle implements Figure {
    Random random = new Random();
    private static final double BOUND_NUMBER = 10.00;
    private double radius = random.nextDouble(BOUND_NUMBER);

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
