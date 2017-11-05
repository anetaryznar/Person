package pl.sdacademy.java7krk;

import java.util.LinkedList;
import java.util.List;

public class Company {

    private List<Emploee> empolyees = new LinkedList<>();

    public void addEmploee(Emploee pracownik){
        empolyees.add(pracownik);



    }

    public double sumOfSalaries(){

        double sum =0;
        for (Emploee empolyee : empolyees) {
            sum +=empolyee.calculateNetSalary();
        }
        return sum;
    }


    public double averageOfSalaries(){
        return sumOfSalaries()/empolyees.size();


    }



}
