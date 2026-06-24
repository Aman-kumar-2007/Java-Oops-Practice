package QuesOnJavaCollectionFrameworks;

/*
A book pile follows LIFO order.

Tasks:

Add books.
Remove top book.
Display remaining books.

 */
import java.util.Stack;

public class LIFO {
    public static void main(String[] args){
        Stack<String> books = new Stack<>();
        books.push("JAVA");
        books.push("My Girlfriend");
        books.push("My Ex");
        books.push("My Next");

        IO.println("I want my relationship permanent : \n");
        books.pop();
        books.pop();
        for(String book : books){
            IO.println(book);
        }
    }
}
