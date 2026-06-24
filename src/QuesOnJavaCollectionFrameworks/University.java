package QuesOnJavaCollectionFrameworks;

import java.util.*;

/*
The university wants to store:

Registered Students (No duplicates)
Attendance Queue
Student Marks (RollNo → Marks)

Choose suitable collections and implement the system.

 */
public class University {
    public static void main(String[] args){
        HashSet<String> students = new HashSet<>();
        Queue<String> attendance = new LinkedList<>();


        students.add("Aman");
        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");

        attendance.offer("Aman");
        attendance.offer("Rahul");
        attendance.offer("Priya");

        HashMap<Integer,Integer> marks = new HashMap<>();

        marks.put(101, 85);
        marks.put(102, 90);
        marks.put(103, 78);



        System.out.println("Registered Students:");
        System.out.println(students);

        System.out.println("\nAttendance Queue:");
        while(!attendance.isEmpty()) {
            System.out.println(attendance.poll());
        }

        System.out.println("\nStudent Marks:");
        for(Map.Entry<Integer, Integer> e : marks.entrySet() ) {

            System.out.println("Roll No: " + e.getKey() + " Marks: " + e.getValue());
        }





    }
}
