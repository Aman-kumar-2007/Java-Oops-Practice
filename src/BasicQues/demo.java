package BasicQues;

class Person {

    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

public class demo extends Person {

    int marks;

    public static void main(String[] args) {

        demo s = new demo();

        s.name = "Aman";
        s.marks = 90;

        s.displayName();

        System.out.println("Marks: " + s.marks);
    }
}
