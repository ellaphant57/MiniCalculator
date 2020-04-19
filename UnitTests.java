/**
 *  Exam Section C
 *  Creates Unit Tests for each MiniCalculator method specified.
 *  CS108-4
 *  4/18/20
 *  @author  Danela Agpaoa
 */

public class UnitTests {
    public static void main (String args[]) {
        calculateTest();
        multiplyTest();
        divideTest();
    }


    /**
     * Test Calculate method for default total value and using the multiply method.
     */
    public static void calculateTest() {
        MiniCalculator calculate = new MiniCalculator();
        calculate.calculate();

        if (calculate.total != 1) {
            System.out.println("FAILED CALCULATE");
        }
        else{
            calculate.multiply(5);
            if (calculate.total != 5) {
                System.out.println("FAILED CALCULATE");
            }
            else {
                System.out.println("SUCCESS CALCULATE");
            }
        }
    }

    /**
     * Test Multiply method using int values that are positive, negative, and zero.
     */
    public static void multiplyTest() {
        MiniCalculator multiply = new MiniCalculator();
        multiply.multiply(5);

        if (multiply.total != 5) {
            System.out.println("FAILED MULTIPLY");
        }
        else {
            multiply.total = 2;
            multiply.multiply(5);
            if (multiply.total != 10) {
                System.out.println("FAILED MULTIPLY");
            }
            else {
                multiply.total = 2;
                multiply.multiply(-5);
                if (multiply.total != -10) {
                    System.out.println("FAILED MULTIPLY");
                }
                else {
                    multiply.multiply(0);
                    if (multiply.total != 0) {
                        System.out.println("FAILED MULTIPLY");
                    }
                    else {
                        System.out.println("SUCCESS MULTIPLY");
                    }
                }
            }
        }

    }

    /**
     * Test Divide method with int values that create a fraction, are positive, and negative.
     */
    public static void divideTest() {
        MiniCalculator divide = new MiniCalculator();
        divide.divide(2);

        if (divide.total != 0) {
            System.out.println("FAILED DIVIDE");
        }
        else {
            divide.total = 5;
            divide.divide(2);
            if (divide.total != 2) {
                System.out.println("FAILED DIVIDE");
            }
            else {
                divide.total = 10;
                divide.divide(-2);
                if (divide.total != -5) {
                    System.out.println("FAILED DIVIDE");
                }
                else {
                    System.out.println("SUCCESS DIVIDE");
                }
            }
        }
    }
}
