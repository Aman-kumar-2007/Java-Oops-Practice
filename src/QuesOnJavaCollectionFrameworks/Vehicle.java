package QuesOnJavaCollectionFrameworks;

/*

A parking system stores vehicle numbers in a Collection.

Requirements:

Duplicate vehicle numbers should not be allowed.
Display all vehicle numbers in sorted order.
Answer:

a) Which Collection class would you choose and why? (2 Marks)

b) Write a Java program implementing the system. (3 Marks)

 */
import java.util.TreeSet;

public class Vehicle {
    public static void main(String[] args){
        TreeSet<Integer> vechileNo = new TreeSet<>();
        vechileNo.add(20);
        vechileNo.add(40);
        vechileNo.add(20);

        for(int n : vechileNo){
            IO.println(n);
        }
    }
}
