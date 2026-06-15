package QuestionForExamPrep;

class Employee{
    String employeeName;
    int employeeId;

    static int employeeCounter = 1000;
    static String companyName = "Amazon";

    Employee(String name){
        this.employeeName = name;
        employeeCounter++;
        this.employeeId = employeeCounter;
    }

    void display() {
        System.out.println(employeeId + " " + employeeName + " " + companyName);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman");
        Employee e2 = new Employee("Rahul");
        Employee e3 = new Employee("Priya");

        e1.display();
        e2.display();
        e3.display();
    }
}
