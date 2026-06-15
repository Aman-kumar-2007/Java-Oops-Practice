package BasicQues;
/*
Transport System

Parent:

Vehicle
fare()

Child:

Bus
Train
Metro

Override fare().

 */

class Vehicle {

    void fare() {
        System.out.println("Calculating Fare");
    }
}

class Bus extends Vehicle {

    @Override
    void fare() {
        System.out.println("Calculating Bus Fare");
    }
}

class Train extends Vehicle {

    @Override
    void fare() {
        System.out.println("Calculating Train Fare");
    }
}

public class Metro extends Vehicle {

    @Override
    void fare() {
        System.out.println("Calculating Metro Fare");
    }

    public static void main(String[] args) {

        Vehicle v;

        v = new Bus();
        v.fare();

        v = new Train();
        v.fare();

        v = new Metro();
        v.fare();

    }
}