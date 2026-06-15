package MixQues;
/*
Hospital Appointment System (10 Marks)

A hospital management application stores patient details and appointment history.

Requirements:

Patient information must be secure.
Patients can register using different combinations of information.
Different doctors calculate consultation fees differently.
Appointment history should be maintained.
Invalid appointment IDs should be handled properly.

Develop a Java program implementing the above requirements using appropriate OOP concepts.

 */
import java.util.ArrayList;

class Patient{
    private int PatientId;
    private String name;

    Patient(int patientId){
        this.PatientId = patientId;
        this.name = "Unknown";
    }

    Patient(int patientId,String name){
        this.PatientId = patientId;
        this.name = name;
    }

    public int getPatientId() {
        return PatientId;
    }

    public String getPatientName() {
        return name;
    }
}

class Doctor {
    void consultationFee() {
        System.out.println("Consultation Fee");
    }
}

class GeneralDoctor extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("General Doctor Fee = 500");
    }
}

class SpecialistDoctor extends Doctor {

    @Override
    void consultationFee() {
        System.out.println("Specialist Doctor Fee = 1000");
    }
}


public class Hospital {

    public static void main(String[] args){
        Patient p1 = new Patient(101);
        Patient p2 = new Patient(102, "Aman");

        System.out.println(p1.getPatientId() + " " + p1.getPatientName());
        System.out.println(p2.getPatientId() + " " + p2.getPatientName());

        Doctor d1 = new GeneralDoctor();
        Doctor d2 = new SpecialistDoctor();

        d1.consultationFee();
        d2.consultationFee();

        ArrayList<String> appointments = new ArrayList<>();

        appointments.add("Appointment ID: 1");
        appointments.add("Appointment ID: 2");
        appointments.add("Appointment ID: 3");

        System.out.println("Appointment History:");
        for(String a : appointments){
            System.out.println(a);
        }

        int appointmentId = -5;

        try {
            if(appointmentId < 0){
                throw new Exception("Invalid Appointment ID");
            }

        } catch(Exception e){

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Appointment Verification Completed");
        }
    }


}
