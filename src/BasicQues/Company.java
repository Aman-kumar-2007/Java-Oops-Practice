package BasicQues;

/*
Create class Company.

Conditions:

salary cannot be negative
name cannot be empty

Apply encapsulation.
 */
public class Company {
    private String name;
    private double salary;

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args){
        Company e = new Company();

        e.setName("Aman");
        e.setSalary(50000);

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}
