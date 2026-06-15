package QuestionForExamPrep;

public class Hospital {
    private int patientId;
    private String patienName;
    private int age;

    void setPatientId(int id){
        this.patientId = id;
    }

    void setPatienName(String name){
        this.patienName = name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getPatientId(){
        return this.patientId;
    }

    int getAge(){
        return this.age;
    }

    String getPatienName(){
        return this.patienName;
    }


}
