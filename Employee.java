public class Employee {
    String name;
     double salary;
     public Employee (String employee_name,double current_salary)
     {
         name=employee_name;
         salary=current_salary;
     }
     public String getname()
     {
         return name;
     }
     public double getSalary()
     {
         return salary;
     }
     public void raiseSalary(double by_recent)
     {
        salary=salary+salary*by_recent/100;
     }

}
