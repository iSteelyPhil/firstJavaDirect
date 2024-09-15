package org.example;

import java.util.ArrayList;

public class Library {

    private ArrayList<BookCL> booksArr = new ArrayList<>();


    public void addBook(BookCL book){
        booksArr.add(book);
    }

    public void printAvailableBooks(){
        System.out.println("\n LIST OF BOOKS AVAILABLE");
        for(BookCL book : booksArr){
            if(book.isAvailable()){
                System.out.println("\t"+book.getTitleAndAuthor());
            }
        }
    }
}
