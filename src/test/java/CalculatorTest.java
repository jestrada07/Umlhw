import calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    //red, green, refactor

    @Test
    public void addTest() {
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val1 + val2;


        //When
        int actual = calculator.add(val1, val2);

        //Then

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
        int valu1 = 5;
        int valu2 = 8;
        int expected = valu1 - valu2;

        int actual = calculator.subtract(valu1, valu2);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        int valu1 = 8;
        int valu2 = 9;
        int expected = valu1 * valu2;

        int actual = calculator.multiply(valu1, valu2);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void divide() {
        Calculator calculator = new Calculator();
        double valu1 = 6.0;
        double valu2 = 3.0;


        double expected = valu1 / valu2;

        double actual = calculator.divide(valu1, valu2);
        double delta;
        delta = 0.001;
        //delta  value is indeed the "error" or "uncertainty" allowed in the comparison.
        //Comparing floating point numbers is tricky -- exact equality is hard to come by in many cases.
        //describes the amount of difference you can tolerate in the values for them to be still considered equal.

        Assert.assertEquals(expected, actual, delta);


    }

    @Test
    public void square() {
        Calculator calculator = new Calculator();
        double valu1 = 8.0;
        double valu2 = 4.0;


        double expected = Math.pow(valu1, valu2);

        double actual = calculator.square(valu1, valu2);
        double delta;
        delta = 0.001;


        Assert.assertEquals(expected, actual, delta);


    }

    @Test
    public void squareRoot() {
        Calculator calculator = new Calculator();
        double valu1 = 2.0;

        double expected = Math.sqrt(valu1);
        double actual = calculator.squareRoot(valu1);
        double delta;
        delta = 0.001;

        Assert.assertEquals(expected, actual, delta);


    }

    @Test
    public void exponent() {
        Calculator calculator = new Calculator();
        double valu1 = 4.0;

        double expected = Math.exp(valu1);
        double actual = calculator.exponent(valu1);
        double delta;
        delta = 0.001;

        Assert.assertEquals(expected, actual, delta);


    }




}
