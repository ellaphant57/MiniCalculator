/**
 *  Exam Section C
 *  An abstract Calculator class that implements Multiplier and Divider
    *  and calculates the Total given a specified input.
 *  CS108-4
 *  4/18/20
 *  @author  Danela Agpaoa
 */

public abstract class Calculator implements Multiplier, Divider {
    protected int total;

    public Calculator() {
        total = 1;
    }

    abstract int calculate();

    @Override
    public void multiply(int y) {
        total *= y;
    }

    @Override
    public void divide(int y) {
        total /= y;
    }
}
