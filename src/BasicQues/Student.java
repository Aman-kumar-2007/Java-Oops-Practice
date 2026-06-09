package BasicQues;

/*
Create a class Student having:

rollNo
name
marks

Create 5 students and display the student having lowest marks.

 */
public class Student {
    int rollNo;
    String name;
    int marks;

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.rollNo = 101;
        s1.name = "Aman";
        s1.marks = 85;

        s2.rollNo = 102;
        s2.name = "Rahul";
        s2.marks = 72;

        s3.rollNo = 103;
        s3.name = "Priya";
        s3.marks = 91;

        s4.rollNo = 104;
        s4.name = "Neha";
        s4.marks = 65;

        s5.rollNo = 105;
        s5.name = "Arjun";
        s5.marks = 78;

        Student lowest = s1;

        if(s2.marks < lowest.marks)
            lowest = s2;

        if(s3.marks < lowest.marks)
            lowest = s3;

        if(s4.marks < lowest.marks)
            lowest = s4;

        if(s5.marks < lowest.marks)
            lowest = s5;

        System.out.println(lowest.rollNo);
        System.out.println(lowest.name);
        System.out.println(lowest.marks);
    }
}
