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


}
