public class EmployeeTest {
    public static void main(String[] args) {
        Employee b=new Employee("Empolyee name",500000);
        System.out.println("Empolyee name:"+b.getname());
        System.out.println("Empolyee Salary"+b.getSalary());
        b.raiseSalary(10);
        System.out.println("raiseSalary:"+b.getSalary());
    }
}
