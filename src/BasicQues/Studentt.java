package BasicQues;
/*
Create class Student.

Private members:

rollNo
name
marks

Provide setters and getters.

 */
public class Studentt {
    private int rollNo;
    private String name;
    private int marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args){
        Studentt s = new Studentt();
        s.setRollNo(101);
        s.setName("Aman");
        s.setMarks(90);

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}
