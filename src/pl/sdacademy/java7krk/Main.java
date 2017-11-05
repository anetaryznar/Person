package pl.sdacademy.java7krk;

public class Main {

    public static void main(String[] args) {

        Company company = new Company();

        Emploee student = new Student(1100);
        Emploee fullTimeEmployee = new FullTimeEmployee(2500);
        Emploee temporaryEmployee = new TemporaryEmployee(1300);


        company.addEmploee(student);
        company.addEmploee(fullTimeEmployee);
        company.addEmploee(temporaryEmployee);

        System.out.println(String.format("%.2f",company.sumOfSalaries()));
        System.out.println(String.format("%.2f",company.averageOfSalaries()));

        //lub
        //System.out.printf("%.2f",company.averageOfSalaries());



    }
}
