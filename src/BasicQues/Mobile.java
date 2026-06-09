package BasicQues;

/*
Create a class Mobile having:

brand
ram
price

Create two mobiles and display which one is costlier.

 */
public class Mobile {
    String Brand;
    int ram;
    int price;

    public static void main(String[] args){
        Mobile m1 = new Mobile();
        m1.Brand = "Samsung";
        m1.ram  = 4;
        m1.price = 59000;

        Mobile m2 = new Mobile();
        m2.Brand = "Iphone";
        m2.ram  = 6;
        m2.price = 109000;

        System.out.println(m2.price > m1.price ? m2.Brand : m1.Brand);
    }
}
