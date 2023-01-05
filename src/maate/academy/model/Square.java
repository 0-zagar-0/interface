package maate.academy.model;

import java.util.Random;

public class Square implements Figure, Comparable<Square> {
    Random random = new Random();
    private double side = random.nextDouble(10.00);

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public int compareTo(Square o) {
        if (side < o.side) {
            return 1;
        }
        if (side > o.side) {
            return 2;
        }
        return 0;
    }
}
