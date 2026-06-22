package BasicQues;
/*

Employee Bonus Calculator

A company wants to calculate employee bonus.

Requirements:

If only salary is given → 5% bonus.
If salary and rating are given → 10% bonus for rating > 4.
If salary, rating and experience are given → 15% bonus for experience > 5 years.

Write a Java program using method overloading.

 */

public class EmployeeBonus {

    public int calculateSalary(int salary){
        return salary+salary*5/100;
    }

    public int calculateSalary(int salary,double rate){
        if(rate > 4.0) return salary+salary*10/100;
        return salary+salary*5/100;
    }

    public int calculateSalary(int salary,double rate,int experience){
        if(experience > 5){
            return salary+salary*15/100;
        }
        if(rate > 4) return salary+salary*10/100;

        return salary+salary*5/100;
    }

    public static void main(String[] args){
        EmployeeBonus b = new EmployeeBonus();
        IO.println(b.calculateSalary(1000));

        IO.println(b.calculateSalary(1000,5));

        IO.println(b.calculateSalary(1000,4,10));

    }



}
