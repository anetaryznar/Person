package pl.sdacademy.java7krk;

public class Student extends Emploee {

    public Student(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public void getEmail() {

    }

    private static final double TAX = 0.95;

    @Override
    public double calculateNetSalary() {
        return getGrossSalary()*TAX;
    }
}
