package MixQues;


import java.util.ArrayList;
import java.util.HashMap;

class Bidder{
    private int bidderId ;
    private String bidderName;
    private int walletAmount;

    public Bidder(int bidderId, String bidderName, double walletBalance) {
        this.bidderId = bidderId;
        setBidderName(bidderName);
        setWalletAmount(walletAmount);
    }


    public void setBidderId(int id){
        this.bidderId  = id;
    }

    public void setBidderName(String name){
        if (bidderName != null && !bidderName.trim().isEmpty())
            this.bidderName = bidderName;
    }

    public void setWalletAmount(int walletAmount){
        if (walletAmount >= 0)
            this.walletAmount = walletAmount;
    }

    public int getBidderId(){
        return this.bidderId;
    }

    public int getWalletAmount() {
        return this.walletAmount;
    }

    public String getBidderName() {
        return this.bidderName;
    }
}

class Product{
    private int productId;
    private String productName;
    private double basePrice;

    public Product(int productId, String productName, double basePrice) {
        this.productId = productId;
        this.productName = productName;
        this.basePrice = basePrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getBasePrice() {
        return basePrice;
    }
}

class Bid{
    private double bidAmount;
    private String bidTime;

    public Bid(double bidAmount, String bidTime) {
        this.bidAmount = bidAmount;
        this.bidTime = bidTime;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public String getBidTime() {
        return bidTime;
    }
}

class InvalidBidException extends Exception {
    public InvalidBidException(String msg) {
        super(msg);
    }
}

class InsufficientWalletException extends Exception {
    public InsufficientWalletException(String msg) {
        super(msg);
    }
}



public class AuctionPlatform {
    HashMap<Integer, Double> highestBids = new HashMap<>();
    HashMap<Integer, Bidder> winningBidders = new HashMap<>();
    ArrayList<String> biddingHistory = new ArrayList<>();
    HashMap<Integer, Product> products = new HashMap<>();

    public void placeBid(Bidder bidder, Product product, double bidAmount
    ) throws InvalidBidException,InsufficientWalletException {

        if (bidder.getWalletAmount() < bidAmount) {
            throw new InsufficientWalletException(
                    "Insufficient Wallet Balance");
        }

        double currentHighest = highestBids.get(product.getProductId());

        if (bidAmount <= currentHighest) {
            throw new InvalidBidException(
                    "Bid must be higher than current highest bid");
        }

        highestBids.put(product.getProductId(), bidAmount);

        winningBidders.put(product.getProductId(), bidder);

        biddingHistory.add(bidder.getBidderName() + " bid Rs." + bidAmount + " on " + product.getProductName());
    }


    public void displayBiddingHistory() {

        System.out.println("\n===== BIDDING HISTORY =====");

        for (String history : biddingHistory) {
            System.out.println(history);
        }
    }

    public void displayAuctionResults() {

        System.out.println("\n===== AUCTION RESULTS =====");

        for (Integer productId : highestBids.keySet()) {

            Product product = products.get(productId);

            Bidder winner = winningBidders.get(productId);

            if (winner != null) {

                System.out.println("Product : " + product.getProductName());

                System.out.println("Winner : " + winner.getBidderName());

                System.out.println("Winning Bid : Rs." + highestBids.get(productId));

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Bidder b1 =
                new Bidder(1, "Aman", 50000);

        Bidder b2 =
                new Bidder(2, "Rahul", 30000);

        Bidder b3 =
                new Bidder(3, "Priya", 70000);

        Product p1 =
                new Product(101,
                        "Gaming Laptop",
                        20000);

        Product p2 =
                new Product(102,
                        "iPhone",
                        30000);

        AuctionPlatform auction =
                new AuctionPlatform();

//        auction.addProduct(p1);
//        auction.addProduct(p2);

        try {

            auction.placeBid(b1, p1, 25000);

            auction.placeBid(b2, p1, 27000);

            auction.placeBid(b3, p1, 35000);

            auction.placeBid(b1, p2, 40000);

        } catch (Exception e) {

            System.out.println(
                    "Error : "
                            + e.getMessage());
        }

        auction.displayBiddingHistory();

        auction.displayAuctionResults();
    }
}
