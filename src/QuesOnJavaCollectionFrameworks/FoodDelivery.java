package QuesOnJavaCollectionFrameworks;

/*
Food Delivery Application

Store:

Restaurants → No duplicates
Orders → Maintain insertion order
Delivery Charges → OrderID → Charge

Tasks:

Add restaurants
Place orders
Calculate total delivery charge

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FoodDelivery {
    public static  void main(String[] args){
        HashSet<String> restaurant = new HashSet<>();
        restaurant.add("KFC");
        restaurant.add("Dominos");
        restaurant.add("StarBucks");
        restaurant.add("StarBucks");

        ArrayList<String> orders = new ArrayList<>();
        orders.add("coffee");
        orders.add("Chicken bucket");
        orders.add("Cheese pizza");

        HashMap<Integer,Double> charges = new HashMap<>();
        charges.put(101,300.45);
        charges.put(102,799.00);
        charges.put(103,205.00);

        IO.println("Order placed : ");
        IO.println(orders.remove(1));
        Double totalCharge = 0.00;
        for(Map.Entry<Integer,Double> e : charges.entrySet()){
            totalCharge += e.getValue();
        }

        IO.println("Total Charge : ");
        IO.println(totalCharge);





    }
}
