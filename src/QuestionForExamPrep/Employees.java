package QuestionForExamPrep;

/* Q4. Employee Registration Portal

Employee may register using:

name only
name + department
name + department + salary

Tasks:

Demonstrate constructor overloading.
Assign default values where required.
        */

public class Employees {
    String name;
    String dept;
    int salary;

    Employees(String name){
        this.name = name;
        this.dept = "General";
        this.salary = 0;
    }

    Employees(String name, String dept){
        this.name = name;
        this.dept = dept;
        this.salary = 0;
    }

    Employees(String name, String dept, int sal){
        this.name = name;
        this.dept = dept;
        this.salary = sal;
    }

    void display() {
        System.out.println(name + " " + dept + " " + salary);
    }

    public static void main(String[] args){
        Employees e1 = new Employees("Aman");
        Employees e2 = new Employees("Aman","Software development");
        Employees e3 = new Employees("Aman","Software development",99000);


        e1.display();
        e2.display();
        e3.display();


    }


}
