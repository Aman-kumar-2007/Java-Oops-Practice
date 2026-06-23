package BasicQues;

/*

Q1. Ride Sharing Platform (Case Study)

A ride-sharing application offers different ride categories:

Bike
Mini
Sedan

Each ride calculates fare differently.

Answer the following:

a) Which OOP concept is demonstrated here? Justify your answer. (2 Marks)
 a- ans  = Runtime Polymorphism (Method Overriding)

b) Write a Java program using a superclass Ride and subclasses BikeRide, MiniRide and SedanRide that override calculateFare(). (3 Marks)

 */

abstract class RideSharing{
    abstract int calculateFare(int dist);
}

class Bike extends RideSharing{
    @Override
    int calculateFare(int dist){
        return 10*dist;
    }
}

class Mini extends RideSharing{
    @Override
    int calculateFare(int dist){
        return 20*dist;
    }
}


public class Sedan extends RideSharing {
    @Override
    int calculateFare(int dist){
        return 40*dist;
    }

    public static void main(String[] args){
        Bike b = new Bike();
        IO.println(b.calculateFare(5));

        Sedan s =new Sedan();
        IO.println(s.calculateFare(5));

        Mini m = new Mini();
        IO.println(m.calculateFare(5));
    }
}
