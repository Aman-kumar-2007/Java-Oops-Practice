package QuesOnJavaCollectionFrameworks;

/*

Store details of 5 employees using an array of objects.

Each employee has:

empId
empName
performanceScore
Tasks:
Display all employees.
Display employee with highest score.

 */
import java.util.ArrayList;

public class Employee {
    int empId;
    String empName;
    int performanceScore;

    Employee(int empId ,String empName,int performanceScore){
        this.empId = empId;
        this.empName = empName;
        this.performanceScore = performanceScore;
    }

    public static void main(String[] args){
        Employee[] emp = new Employee[5];

        emp[0] = new Employee(1, "Aman", 99);
        emp[1] = new Employee(2, "Raju", 90);
        emp[2] = new Employee(3, "Techno", 56);
        emp[3] = new Employee(4, "Priya", 88);
        emp[4] = new Employee(5, "Rahul", 95);

        System.out.println("All Employees:");

        for(Employee i : emp ){
            IO.println(i.empId + " " + i.empName + " " + i.performanceScore);
        }

        Employee highest = emp[0];

        for(Employee e : emp) {

            if(e.performanceScore >
                    highest.performanceScore) {

                highest = e;
            }
        }
        IO.println("\nHighest Performer :");
        System.out.println(highest.empId + " " + highest.empName + " " + highest.performanceScore);

    }
}
