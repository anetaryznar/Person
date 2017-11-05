package pl.sdacademy.java7krk;

public abstract class Emploee implements Person{

    private double grossSalary;

    public Emploee(double grossSalary){
        this.grossSalary = grossSalary;
    }


    public double getGrossSalary() {
        return grossSalary;
    }

    public abstract double calculateNetSalary();




}
