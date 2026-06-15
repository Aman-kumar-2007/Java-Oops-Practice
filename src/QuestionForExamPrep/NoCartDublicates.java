package QuestionForExamPrep;

/*
Online Shopping Cart (Case Study)

An e-commerce website allows customers to add products into a cart.

Duplicate products should not be stored.

Answer the following:

a) Which Java Collection class is most appropriate? Justify your answer. (2 Marks)

b) Write a Java program to add products and display all items in the cart. (3 Marks)

 */
import java.util.HashSet;
import java.util.TreeSet;

public class NoCartDublicates {

    public static void main(String[] args){

//        TreeSet<String> cart = new TreeSet<>(); // for sorted;

        HashSet<String> cart = new HashSet<>(); // for not need to sorted;

        cart.add("toy car");
        cart.add("spider man mask");
        cart.add("T-shirt");

        System.out.println(cart);
    }
}
