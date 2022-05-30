package chapter_01;

public class Calculator {

    public static final int NUM_1 = 2;
    public static final int NUM_2 = 3;

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(NUM_1, NUM_2));
        System.out.println(calculator.subtract(NUM_1, NUM_2));
        System.out.println(calculator.multiply(NUM_1, NUM_2));
        System.out.println(calculator.divide(NUM_1, NUM_2));
    }

}
