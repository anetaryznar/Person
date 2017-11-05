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

        System.out.println(company.sumOfSalaries());
        System.out.println(company.averageOfSalaries());



    }
}
