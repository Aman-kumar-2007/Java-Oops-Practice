package QuestionForExamPrep;

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
