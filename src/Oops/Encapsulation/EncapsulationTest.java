package Oops.Encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        /*emp.employeeId = -100;
        emp.employeeName = "@#$%^&*!";
        emp.employeeSalary = -67000;*/
        emp.setEmployeeId(100);
        emp.setEmployeeName("Abhishek");
        emp.setEmployeeSalary(67000);

        System.out.println("Employee ID \t"+emp.getEmployeeId());
        System.out.println("Employee Name \t"+emp.getEmployeeName());
        System.out.println("Employee Salary \t"+emp.getEmployeeSalary());
    }
}
