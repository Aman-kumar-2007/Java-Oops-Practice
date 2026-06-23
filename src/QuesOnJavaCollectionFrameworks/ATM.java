package QuesOnJavaCollectionFrameworks;

import java.util.ArrayList;

/*
ATM Transaction History

Requirements:

Store transactions.
Add transactions.
Display all transactions.
Display total transactions.

 */
public class ATM {

    public static void main(String[] args) {

        ArrayList<String> transactions = new ArrayList<>();

        transactions.add("Deposit Rs.5000");
        transactions.add("Withdraw Rs.1000");
        transactions.add("Balance Check");
        transactions.add("Deposit Rs.2000");

        System.out.println("Transaction History:");

        for(String t : transactions){
            System.out.println(t);
        }

        System.out.println("Total Transactions = "
                + transactions.size());
    }

}

