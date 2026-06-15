package QuestionsOnJavaCollectionFrameworks;

/*

Online Banking System (Case Study)

Customers can perform:

Deposit
Withdraw
Balance Check

Transaction history should be maintained.

Answer the following:

a) Which Java Collection would you use? Justify. (2 Marks)

b) Write a Java program demonstrating the solution. (3 Marks)

 */
import java.util.ArrayList;

public class BankingSystem {

    public static void main(String[] args){
        ArrayList<String> transactions = new ArrayList<>();

        double balance = 1000;

        balance += 500;
        transactions.add("Deposit: 500");

        balance -= 200;
        transactions.add("Withdraw: 200");

        transactions.add("Balance Check: " + balance);

        System.out.println("Transaction History:");

        for(String t : transactions) {
            System.out.println(t);
        }
    }
}