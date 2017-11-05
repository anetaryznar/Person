package pl.sdacademy.java7krk;

public class FullTimeEmployee extends Emploee {


    public FullTimeEmployee(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public void getEmail() {

    }

    private static final double TAX = 0.8;

    @Override
    public double calculateNetSalary() {
        return (getGrossSalary()-100)*TAX;
    }


}
