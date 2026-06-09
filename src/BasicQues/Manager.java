package BasicQues;

class Pers {

    String name = "Aman";
}

class Employe extends Pers {

    int empId = 101;
}

public class Manager extends Employe {

    String department = "IT";

    public static void main(String[] args) {

        Manager m = new Manager();

        System.out.println("Name: " + m.name);
        System.out.println("Employee ID: " + m.empId);
        System.out.println("Department: " + m.department);
    }
}