package BasicQues;

/*
Create a class Book having:

bookId
title
author

Store data for 5 books and display them.

 */
public class Book {
    int bookId;
    String title;
    String author;

    public static void main(String[] args){
        Book b1 = new Book();

        b1.bookId = 1;
        b1.title = "Java Programming";
        b1.author = "James Gosling";

        Book b2 = new Book();
        b2.bookId = 2;
        b2.title = "Data Structures";
        b2.author = "Mark Allen";

        Book b3 = new Book();
        b3.bookId = 3;
        b3.title = "Operating Systems";
        b3.author = "Galvin";

        Book b4 = new Book();
        b4.bookId = 4;
        b4.title = "Computer Networks";
        b4.author = "Tanenbaum";

        Book b5 = new Book();
        b5.bookId = 5;
        b5.title = "DBMS";
        b5.author = "Korth";

        System.out.println("Book 1: " + b1.bookId + " " + b1.title + " " + b1.author);
        System.out.println("Book 2: " + b2.bookId + " " + b2.title + " " + b2.author);
        System.out.println("Book 3: " + b3.bookId + " " + b3.title + " " + b3.author);
        System.out.println("Book 4: " + b4.bookId + " " + b4.title + " " + b4.author);
        System.out.println("Book 5: " + b5.bookId + " " + b5.title + " " + b5.author);
    }
}
