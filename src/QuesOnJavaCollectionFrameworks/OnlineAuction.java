package QuesOnJavaCollectionFrameworks;

import java.util.*;

public class OnlineAuction {
    public static void main(String[] args) {
        HashSet<String> bidders = new HashSet<>();
        ArrayList<String> bidHistory = new ArrayList<>();
        HashMap<Integer, Integer> highestBid = new HashMap<>();
        PriorityQueue<Integer> bidQueue = new PriorityQueue<>(Collections.reverseOrder());

        bidders.add("Aman");
        bidders.add("Rahul");
        bidders.add("Priya");
        bidders.add("Aman");

        highestBid.put(101, 5000);
        highestBid.put(102, 7000);
        highestBid.put(103, 6000);

        bidHistory.add("Aman -> Product 101 -> 5000");
        bidHistory.add("Rahul -> Product 102 -> 7000");
        bidHistory.add("Priya -> Product 103 -> 6000");

        bidQueue.offer(5000);
        bidQueue.offer(7000);
        bidQueue.offer(6000);

        System.out.println("Bidders:");
        System.out.println(bidders);

        System.out.println("\nBid History:");
        for(String bid : bidHistory){
            System.out.println(bid);
        }

        System.out.println("\nHighest Bids:");
        for(Map.Entry<Integer,Integer> e : highestBid.entrySet()){
            System.out.println(
                    "Product ID: " + e.getKey() +
                            " Bid: " + e.getValue());
        }

        System.out.println("\nProcessing Highest Bid: "
                + bidQueue.poll());



    }
}
