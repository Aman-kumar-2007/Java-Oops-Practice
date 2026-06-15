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

public class Company {
    String name;
    String dept;
    int salary;

    Company(String name){
        this.name = name;
        this.dept = "General";
        this.salary = 0;
    }

    Company(String name,String dept){
        this.name = name;
        this.dept = dept;
        this.salary = 0;
    }

    Company(String name,String dept,int sal){
        this.name = name;
        this.dept = dept;
        this.salary = sal;
    }



}
