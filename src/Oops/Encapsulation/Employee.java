package Oops.Encapsulation;

public class Employee {
     private int employeeId;
     private String employeeName;
     private int employeeSalary;

     public void setEmployeeId(int employeeId){
          if(employeeId>0){
               this.employeeId=employeeId;
          }
     }
     public int getEmployeeId(){
          return employeeId;
     }
     public void setEmployeeName(String employeeName){
          this.employeeName= employeeName;
     }
     public String getEmployeeName(){
          return employeeName;
     }
     public void setEmployeeSalary(int employeeSalary){
          this.employeeSalary=employeeSalary;
     }
     public int getEmployeeSalary(){
          return employeeSalary;
     }
}
