package BasicQues;

/*
Create a class Laptop

Data members:

brand
price

Initialize values using a constructor.

 */

public class Laptop {
    String brand;
    int price;
    Laptop(String brand,int price){
        this.brand = brand;
        this.price = price;

    }

    public static void main(String[] args){
        Laptop l1 = new Laptop("Lenevo",89000);
        Laptop l2 = new Laptop("Lenevo",90000);

        System.out.println(l1.brand + " " + l1.price);
        System.out.println(l2.brand + " " + l2.price);
    }
}
