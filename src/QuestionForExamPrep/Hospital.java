package QuestionForExamPrep;

public class Hospital {
    private int patientId;
    private String patientName;
    private int age;

    void setPatientId(int id){
        this.patientId = id;
    }

    void setPatientName(String name){
        if(name != null && !name.isEmpty() )
            this.patientName = name.trim();
        else System.out.println("name can't be empty");
    }

    void setAge(int age){
        if(age < 0) System.out.println("age can't be neagtive");
        else this.age = age;
    }

    int getPatientId(){
        return this.patientId;
    }

    int getAge(){
        return this.age;
    }

    String getPatientName(){
        return this.patientName;
    }

    public static void main(String[] args){
        Hospital a = new Hospital();
        a.setPatientName("Aman");
        a.setPatientId(1);
        a.setAge(18);

        System.out.println(a.getPatientName());

    }
}
