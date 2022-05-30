package chapter_05;

public class SalaryManager {
    public double getMonthlySalary(int yearlySalary) {
        double montySalary = yearlySalary / 12.0;
        double earnedIncomeTax = calculateTax(montySalary);
        double nationalPension = calculateNationalPension(montySalary);
        double healthInsurancePremium = calculateHealthInsurance(montySalary);
        double totalTax = earnedIncomeTax + nationalPension + healthInsurancePremium;
        montySalary -= totalTax;
        return montySalary;
    }

    public double calculateTax(double monthSalary) {
        double earnedIncomeTax = monthSalary * (12.5 / 100);
        System.out.println("earnedIncomeTax = " + earnedIncomeTax);
        return earnedIncomeTax;
    }

    public double calculateNationalPension(double monthSalary) {
        double nationalPension = monthSalary * (8.1 / 100);
        System.out.println("nationalPension = " + nationalPension);
        return nationalPension;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double healthInsurancePremium = monthSalary * (13.5 / 100);
        System.out.println("healthInsurancePremium = " + healthInsurancePremium);
        return healthInsurancePremium;
    }

    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        double monthlySalary = salaryManager.getMonthlySalary(20000000);
        System.out.println(monthlySalary);
    }
}
