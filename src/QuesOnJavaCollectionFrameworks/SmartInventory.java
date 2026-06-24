package QuesOnJavaCollectionFrameworks;

import java.util.*;

public class SmartInventory {
    public static void main(String[] args){
        TreeSet<String> category = new TreeSet<>();
        Queue<String> order = new LinkedList<>();
        HashMap<Integer,String> productDetails = new HashMap<>();
        LinkedHashSet<String> suppliers = new LinkedHashSet<>();

        category.add("Shirt");
        category.add("Jeans");
        category.add("T-shirt");
        category.add("Bags");

        order.offer("red-shirt");
        order.offer("school-bag");
        order.offer("blue-jeans");
        order.offer("white-tshirt");

        productDetails.put(101,"red-shirt");
        productDetails.put(102,"school-bag");
        productDetails.put(103,"blue-jeans");
        productDetails.put(104,"white-tshirt");

        suppliers.add("peter England");
        suppliers.add("American Express");
        suppliers.add("zara");
        suppliers.add("Nike");

        while(!order.isEmpty()){
            IO.println("Processing Order: " + order.poll());
        }

        for(String e : category){
            IO.println(e);
        }

        IO.println();

        for( Map.Entry<Integer,String> e : productDetails.entrySet()){
            IO.println(e.getKey() + " " + e.getValue());
        }

        for(String e : suppliers){
            IO.println(e);
        }
    }
}
