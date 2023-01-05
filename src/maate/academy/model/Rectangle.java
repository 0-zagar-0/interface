package maate.academy.model;

import java.util.Random;

public class Rectangle implements Figure {
    Random random = new Random();
    private double sideA = random.nextDouble(10.00);
    private double sideB = random.nextDouble(10.00);

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
