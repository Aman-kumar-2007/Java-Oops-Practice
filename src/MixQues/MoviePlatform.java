package MixQues;

import java.util.ArrayList;

class User{
    int userId;
    String userName;

    User(int userId, String name){
        this.userId  = userId;
        this.userName = name;
    }

    public int getUserId(){
        return this.userId;
    }

    public String getUserName(){
        return this.userName;
    }
}

class Movie{
    String title;
    String genre;

    Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
}

class plans{
    void calculateCost(){
        IO.println("Subscription charge: 0");
    }
}

class free extends plans{
    @Override
    void calculateCost(){
        IO.println("Subscription charge: ₹0");
    }
}

class Premium extends plans{
    @Override
    void calculateCost(){
        IO.println("Subscription charge: ₹299");
    }
}

class Family extends plans{
    @Override
    void calculateCost(){
        IO.println("Subscription charge: ₹499");
    }
}

public class MoviePlatform {

    public static void main(String[] args){
        User u1 = new User(101,"Aman");
        User u2 = new User(102,"Anjali");

        plans f = new free();
        f.calculateCost();
        plans p = new Premium();
        p.calculateCost();
        plans fam = new Family();
        fam.calculateCost();

        System.out.println();

        ArrayList<Movie> history = new ArrayList<>();

        history.add(new Movie("Avengers","Action"));
        history.add(new Movie("Jawan","Action"));

        for(Movie m : history) {
            System.out.println(m.title + " - " + m.genre);
        }
        System.out.println();
        int subsMonth = 2;

        try{
            if(subsMonth <= 0) {
                throw new Exception("Invalid Subscription Request");
            }
            System.out.println("Subscription Activated");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Subscription Process Completed");
        }
    }
}
