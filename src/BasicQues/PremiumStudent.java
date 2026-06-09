package BasicQues;
/*
Online Learning Platform

User
   |
 Student
   |
 PremiumStudent

PremiumStudent should have additional certificate access.

 */
class User{
    String name = "Aman";
}

class Stu extends User{
    String course = "Java";
}

public class PremiumStudent extends Stu {
    boolean certificateAccess = true;

    public static void main(String[] args){
        PremiumStudent p = new PremiumStudent();
        System.out.println("Name: " + p.name);
        System.out.println("Course: " + p.course);
        System.out.println("Certificate Access: " + p.certificateAccess);
    }

}
