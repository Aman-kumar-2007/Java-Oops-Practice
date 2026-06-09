package BasicQues;
class Payment{
    void pay() {
        System.out.println("Payment Processing");
    }
}
class UPI extends Payment{
    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}
public class Card extends UPI {

    @Override
    void pay() {
        System.out.println("Payment through Card");
    }

    public static void main(String[] args) {

        UPI u = new UPI();
        Card c = new Card();

        u.pay();
        c.pay();
    }
}
