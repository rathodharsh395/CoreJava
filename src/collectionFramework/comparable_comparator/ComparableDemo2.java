package collectionFramework.comparable_comparator;

import java.util.Arrays;

class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Employee e){

        return (int) (this.salary-e.salary);
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
public class ComparableDemo2 {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Employee("Banner",30000);
        emp[1] = new Employee("Natasha",70000);
        emp[2] = new Employee("Tony",39000);
        Arrays.sort(emp);
        System.out.println("Sorted array of employee's by salary");
        for(Employee e: emp){
            System.out.println("Name:"+e.getName()+",Salary:"+e.getSalary());
        }
    }
}
