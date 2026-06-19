package MixQues;


import java.util.ArrayList;
import java.util.HashMap;

class Customer{
    private String customerName;
    private String emailId;
    private String subscriptionPlan;
    private int walletBalance;

    Customer(String customerName){
        this.customerName = customerName;
        this.emailId = "Not Provided";
        this.subscriptionPlan = "Regular";
        walletBalanceSet();
    }

    Customer(String customerName, String emailId){
        this.customerName = customerName;
        this.emailId = emailId;
        this.subscriptionPlan = "Regular";
        walletBalanceSet();
    }

    Customer(String customerName, String emailId, String membershipType){
        this.customerName = customerName;
        this.emailId = emailId;
        this.subscriptionPlan = membershipType;
        walletBalanceSet();
    }

    public void walletBalanceSet(){
        if(subscriptionPlan.equalsIgnoreCase("Regular")){
            walletBalance = 500;
        } else if(subscriptionPlan.equalsIgnoreCase("Premium")){
            walletBalance = 2000;
        } else if(subscriptionPlan.equalsIgnoreCase("Gold")){
            walletBalance = 5000;
        }
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmailId(String emailId){
        this.emailId = emailId;
    }

    public void setSubscriptionPlan(String subscriptionPlan){
        this.subscriptionPlan = subscriptionPlan;
        walletBalanceSet();
    }

    public void setWalletBalance(int walletBalance){
        if(walletBalance >= 0){
            this.walletBalance = walletBalance;
        }
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public String getSubscriptionPlan() {
        return this.subscriptionPlan;
    }

    public int getWalletBalance() {
        return this.walletBalance;
    }
}

interface FoodService{
    String placeOrder(String itemName);
}

abstract class Restaurant implements FoodService{
    String resturantName;
    String location;

    Restaurant(String name,String location){
        this.resturantName = name;
        this.location = location;
    }

    public void displayRestaurantDetails(){
        System.out.println(this.resturantName);
        System.out.println(this.location);
    }

    public abstract String placeOrder(String itemName);
    public abstract int getOrderCost();
}

class PizzaHut extends Restaurant{

    PizzaHut(){
        super("PizzaHut","Noida Sec 126");
    }
    @Override
    public String placeOrder(String itemName){
        return "Order placed successfully from <PizzaHut>";
    }

    @Override
    public int getOrderCost(){
        return 100;
    }
}

class Dominos extends Restaurant{

    Dominos(){
        super("Dominos","Noida Sec 126");
    }
    @Override
    public String placeOrder(String itemName){
        return "Order placed successfully from <Dominos>";
    }

    @Override
    public int getOrderCost(){
        return 200;
    }
}

class KFC extends Restaurant{

    KFC(){
        super("KFC","Noida Sec 126");
    }
    @Override
    public String placeOrder(String itemName){
        return "Order placed successfully from <KFC>";
    }

    @Override
    public int getOrderCost(){
        return 500;
    }
}

class InsufficientWalletBalanceException extends Exception{

    InsufficientWalletBalanceException(String message){
        super(message);
    }
}






public class SmartFoodPlatform {

    HashMap<String, Customer> registeredCustomers = new HashMap<>();
    ArrayList<String> orderHistory = new ArrayList<>();

    public void processOrder(String customerName, Restaurant restaurant, String itemName) throws InsufficientWalletBalanceException {
            Customer customer = registeredCustomers.get(customerName);

                int cost = restaurant.getOrderCost();

            if(customer.getWalletBalance() < cost){
                throw new InsufficientWalletBalanceException("Insufficient Balance");
            }

            String result = restaurant.placeOrder(itemName);
            System.out.println(result);

            customer.setWalletBalance(customer.getWalletBalance() - cost);

            orderHistory.add(customerName + " ordered " + itemName);

    }

    public static void main(String[] args) {

        SmartFoodPlatform platform =
                new SmartFoodPlatform();

        Customer customer =
                new Customer(
                        "Aman",
                        "aman@gmail.com",
                        "Premium"
                );

        platform.registeredCustomers.put(
                customer.getCustomerName(),
                customer
        );

        Restaurant restaurant =
                new PizzaHut();

        try {

            platform.processOrder(
                    "Aman",
                    restaurant,
                    "Veg Pizza"
            );

            System.out.println(
                    "Remaining Balance : "
                            + customer.getWalletBalance()
            );

            System.out.println(
                    "Order History : "
                            + platform.orderHistory
            );

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
