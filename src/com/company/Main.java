package com.company;
//import booktrack.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println();
        book.setAuthor("JRR Tolkien");
        book.setTitle("Lord of the Rings");
        book.setDescription("A fantasy world of hobbits and sorcerers.");
        //System.out.println("Author: " + book.getAuthor());
        book.print();
        //book.getDisplayText();
//        getDisplayText(book);
    }

//    public static void getDisplayText(com.company.Book book){}    {
//        System.out.println("Author: " + book.getAuthor() + "  Title: " + book.getTitle() + "\n" + "Description: " + book.getDescription());
//    }
}
