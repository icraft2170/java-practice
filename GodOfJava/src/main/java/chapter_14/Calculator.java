package chapter_14;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.printDivide(1, 2);
            calculator.printDivide(1, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
//
//    public void printDivide(double d1, double d2) {
//        double result = d1 / d2;
//        System.out.println(result);
//    }

    public void printDivide(int d1, int d2) throws Exception {
        if (d2 == 0) throw new Exception("Second value can't be Zero");
        int result = d1 / d2;
        System.out.println(result);
    }
}
