package BasicQues;

/*
Hospital Management System

Private:

patientName
age
disease

Rules:

age cannot be negative
name cannot be empty

Implement encapsulation.

 */
public class Hospital {
    private String patientName;
    private int age;
    private String disease;

    void setPatientName(String name){
        if(name != null && !name.isEmpty() )
        this.patientName = name;
        else System.out.println("name can't be empty");
    }

    void setAge(int age){
        if(age > 0){
            this.age = age;
        } else System.out.println("age can't be negative");
    }

    void setDisease(String disease){
        this.disease = disease;
    }

    String getPatientName(){
        return this.patientName;
    }

    int getAge(){
        return this.age;
    }

    String getDisease(){
        return this.disease;
    }

    public static void main(String[] args){
        Hospital p = new Hospital();
        p.setPatientName("Aman");
        p.setAge(25);
        p.setDisease("cancer");

        System.out.println(p.getPatientName());
        System.out.println(p.getAge());
        System.out.println(p.getDisease());

    }
}
