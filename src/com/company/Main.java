package com.company;
//import booktrack.*;
import java.util.Random;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random rnd = new Random();
    public static ArrayList<Book> bookArrayList = new ArrayList<>();
    public static NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        Book book = new Book();
        int randomInStock = 0;
        boolean isInStock = false;
        System.out.println();
        book.setAuthor("JRR Tolkien");
        book.setTitle("Lord of the Rings");
        book.setDescription("A fantasy world of hobbits and sorcerers.");
        book.setInStock(true);
        book.setPrice(20.00);
        //System.out.println("Author: " + book.getAuthor());
        book.print();

        //bookArrayList.add(book);
        // Book(String title, String author, String description, double price, boolean isInStock)
        for (int i = 0; i < 20; i++) {
            Book b = new Book();
            String titleStr = "Title: " + Integer.toString(i);
            String author = "Author: " + Integer.toString(i);
            String descr = "Descr: " +  Integer.toString(i);
            double price = 20.00;

            randomInStock = rnd.nextInt(100);
            if (randomInStock > 50){
                isInStock = true;
            } else {
                isInStock = false;
            }

            b.setTitle(titleStr);
            b.setAuthor(author);
            b.setDescription(descr);
            b.setInStock(isInStock);
            b.setPrice(price);
            bookArrayList.add(b);
        }

        for (Book b:bookArrayList){
            System.out.print("Title: " + b.getTitle() + "   ");
            System.out.println("Price: " + b.getPrice() + " In Stock? " + b.isInStock());
        }

        ArrayList<String> bList = new ArrayList<>();
        for (int i=0; i<5; i++){
            // choose the first 5 books as a test
            bList.add(bookArrayList.get(i).getTitle());
        }

        double totalCost = getPriceOfBooks(bList);
        String costStr = formatter.format(totalCost);
        System.out.println("Total Cost: " + costStr);

        //book.getDisplayText();
        //getDisplayText(book);
    }

    // Create a method that returns the pricing for a requested number of books.
    // Five books at $20.00 should return $100, if they are in stock.
    // If they are not in stock, that should be handled appropriately (hint - you decide).
    static public double getPriceOfBooks(ArrayList<String> bookList){
        //ArrayList<Double> outArray = new ArrayList<>();
        double price = 0;
        double totalPrice = 0;

        for (Book b:bookArrayList){
            if (bookList.contains(b.getTitle())){
                if (b.isInStock()) {
                    price = b.getPrice();
                    totalPrice += price;
                }
            }
        }
        return totalPrice;
    }

    //    public static void getDisplayText(com.company.Book book){}    {
    //        System.out.println("Author: " + book.getAuthor() + "  Title: " + book.getTitle() + "\n" + "Description: " + book.getDescription());
    //    }
}
