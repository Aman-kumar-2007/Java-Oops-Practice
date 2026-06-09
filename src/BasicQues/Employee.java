package BasicQues;

/*
Create a class Employee having:

empId
empName
salary

Create 3 employee objects and display their details.
 */

public class Employee {
    int empId;
    String empName;
    int salary;

    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.empId = 101;
        e1.empName = "Aman";
        e1.salary = 50000;

        Employee e2 = new Employee();
        e2.empId = 102;
        e2.empName = "Rahul";
        e2.salary = 60000;

        Employee e3 = new Employee();
        e3.empId = 103;
        e3.empName = "Priya";
        e3.salary = 55000;

        System.out.println("Employee 1 Details");
        System.out.println("ID: " + e1.empId);
        System.out.println("Name: " + e1.empName);
        System.out.println("Salary: " + e1.salary);

        System.out.println("\nEmployee 2 Details");
        System.out.println("ID: " + e2.empId);
        System.out.println("Name: " + e2.empName);
        System.out.println("Salary: " + e2.salary);

        System.out.println("\nEmployee 3 Details");
        System.out.println("ID: " + e3.empId);
        System.out.println("Name: " + e3.empName);
        System.out.println("Salary: " + e3.salary);
    }
}
