package org.example;


public class Main {
    public static void main(String[] args) {
        Library publicLibrary = new Library();

        BookCL book1 = new BookCL("The Fellowship of the Ring", "JRR Tolkien", 500);
        BookCL book2 = new BookCL("A Game of Thrones", "George RR Martin", 700);
        BookCL book3 = new BookCL("Goosebumps", "RL Stein", 125);

        publicLibrary.addBook(book1);
        publicLibrary.addBook(book2);
        publicLibrary.addBook(book3);

        publicLibrary.printAvailableBooks();
        book1.checkOut();
        publicLibrary.printAvailableBooks();
    }
}