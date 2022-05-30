package chapter_06;

public class IntegerManager {

    static double getInterestRate(int day) {
        if (day <= 0) throw new IllegalArgumentException("날짜는 0 이상이어야 한다.");
        if (day <= 90) return 0.5;
        else if (day <= 180) return 1.0;
        else if (day <= 364) return 2.0;
        else return 5.6;
    }

    public double calculateAmount(int day, long amount) {
        double interestRate = getInterestRate(day);
        amount += (amount * interestRate) * 100;
        return amount;
    }

    public static void main(String[] args) {
        for (int day = 1; day < 366; day++) {
            if (day % 10 == 0) {
                double interestRate = getInterestRate(day);
                System.out.println("interestRate = " + interestRate);
            }

        }

    }
}
