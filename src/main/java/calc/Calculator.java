package calc;

public class Calculator {

    //TDD - the test MUST fail
    //red
    //green
    //refactor

    public int add(int value1, int value2) {

        return value1 + value2;
    }

    //subtract

    public int subtract(int value1, int value2) {

        return value1 - value2;
    }


    //multiply

    public int multiply(int value1, int value2) {

        return value1 * value2;
    }

    //divide
    public double divide(double value1, double value2) {

        return value1 / value2;
    }


    //square

    public double square(double value1, double value2) {


        return Math.pow(value1, value2);

    }


    //squareRoot
    public double squareRoot(double value1) {


        return Math.sqrt(value1);

    }


    //exponent

    public double exponent(double value1) {


        return Math.exp(value1);

    }


}