package QuesOnJavaCollectionFrameworks;
/*

Hospital Management System

Store:

Doctors → No duplicates
Patients Waiting → Queue
Patient Records → PatientID → PatientName

Tasks:

Add doctors
Add patients
Serve patient
Search patient by ID

 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Hospital {
    public static  void main(String[] args){
        HashSet<String> doctor =  new HashSet<>();
        doctor.add("Raju");
        doctor.add("Komal");
        doctor.add("Anjali");
        doctor.add("Anjali");

        System.out.println("Doctors:");
        System.out.println(doctor);

        Queue<String> patient = new LinkedList<>();
        patient.offer("Aman");
        patient.offer("sanjana");
        patient.offer("Kajal");

        System.out.println("\nPatients Waiting:");
        System.out.println(patient);

        System.out.println("\nServed Patient: " + patient.poll());

        System.out.println("Remaining Queue:");
        System.out.println(patient);

        HashMap<Integer,String> records = new HashMap<>();
        records.put(101,"Aman");
        records.put(102,"sanjana");
        records.put(103,"Kajal");

        System.out.println("\nPatient Records:");
        System.out.println(records);

        int id = 102;

        if(records.containsKey(id)){
            System.out.println("\nPatient Found: " + records.get(id));
        }
        else{
            System.out.println("Patient Not Found");
        }


    }
}
