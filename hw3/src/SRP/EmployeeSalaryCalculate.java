package SRP;

public class EmployeeSalaryCalculate {
    private double baseSalary;

    public EmployeeSalaryCalculate(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate() {
        return baseSalary * 1.25;
    }
}
