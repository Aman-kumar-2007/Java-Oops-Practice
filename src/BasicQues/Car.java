package BasicQues;

/*
Create a class Car having:

brand
model
price

Create an object and display all details.

*/


public class Car {
    String brand = "Nano";
    String model = "0104";
    int price = 10000;


    public static void main(String[] args){
        Car a = new Car();
        System.out.println("Brand: " + a.brand);
        System.out.println("Model: " + a.model);
        System.out.println("Price: " + a.price);
    }
}


