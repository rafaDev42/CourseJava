package entities;

public class Employee {

    public String name;
    public double fullSalary;
    public double tax;

    public double netSalary(){
        return fullSalary - tax;
    }

    public void increaseSalary(double percentage){
        fullSalary += fullSalary * percentage / 100;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }

}
