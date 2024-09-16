package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Library {

    final ArrayList<BookCL> booksArr = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder allBookInfo = new StringBuilder();
        for (BookCL book : booksArr) {
            allBookInfo.append(book.toString());
            allBookInfo.append("\n-------------------------\n");
        }
        return "\nWELCOME TO OUR LIBRARY!\n\n" +
                "View our full collection\n" +
                "------------------------\n" +
                allBookInfo;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        //reverence check
        if (this == toBeCompared) {
            return true;
        }

        //null check
        if (toBeCompared == null) {
            return false;
        }

        //Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        //Cast
        Library otherLibrary = (Library) toBeCompared;


        //Compare size of lists
        if (booksArr.size() != otherLibrary.booksArr.size()) {
            return false;
        }


        //Custom comparison of Contents

        for (BookCL book : booksArr) {
            int index = otherLibrary.findBook(book.getTitle(), book.getAuthor());
            if (index == -1){
                return false;
            }
        }
        return true;
    }

    public void addBook(BookCL book) {
        booksArr.add(book);
    }

    public int findBook(String title, String author){
        for (BookCL book : booksArr){
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)){
                return booksArr.indexOf(book);
            }
        }
        return -1;
    }

    public void printAvailableBooks() {
        System.out.println("\n LIST OF BOOKS AVAILABLE");
        for (BookCL book : booksArr) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitleAndAuthor());
            }
        }
    }
}
