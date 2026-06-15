package QuestionForExamPrep;
/*
Online Cab Booking Platform (Case Study)

An online cab booking application offers different types of rides such as Bike, Mini, and Sedan. Every ride calculates fare differently based on distance travelled.

Answer the following:

a) Which OOP concept is most suitable to model this requirement? Justify your answer. (2 Marks)

b) Write a Java program demonstrating this concept using a superclass and three subclasses that calculate fare differently. (3 Marks)

 */

abstract class Booking{
    int CalculateFair(int dist) {
        return dist*1;
    }
}

class Mini extends Booking{
    @Override
    int CalculateFair(int dist) {
        return dist * 20;
    }
}

class Sedan extends Booking{
    @Override
    int CalculateFair(int dist) {
        return dist * 30;
    }
}
public class Bike extends Booking {
    @Override
    int CalculateFair(int dist) {
        return dist * 10;
    }

    public static void main(String[] args){
        Booking b;

        b = new Bike();
        System.out.println(b.CalculateFair(45));
        b = new Sedan();
        System.out.println(b.CalculateFair(45));
        b = new Mini();
        System.out.println(b.CalculateFair(45));

    }

}
