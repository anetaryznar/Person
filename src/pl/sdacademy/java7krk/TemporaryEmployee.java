package pl.sdacademy.java7krk;

public class TemporaryEmployee extends Emploee {

    public TemporaryEmployee(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public void getEmail() {

    }

    private static final double TAX = 0.9;


    @Override
    public double calculateNetSalary() {
        return getGrossSalary()*TAX;
    }
}
