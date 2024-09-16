package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Next available Book Id is "+BookCL.getNextIdNum());

        Library publicLibrary = new Library();

        BookCL book1 = new BookCL("The Fellowship of the Ring", "JRR Tolkien", 500);
        BookCL book2 = new BookCL("A Game of Thrones", "George RR Martin", 700);
        BookCL book3 = new BookCL("Goosebumps", "RL Stein", 125);

   /*     BookCL book4 = new BookCL("The Two Towers", "JRR Tolkien", 450);
        BookCL book5 = new BookCL("Berserk Volume 5", "Kentaro Muira", 200);
        BookCL book6 = new BookCL("Goosebumps", "RL Stein", 125);*/

        BookCL book4 = new BookCL("The Fellowship of the Ring", "JRR Tolkien", 500);
        BookCL book5 = new BookCL("A Game of Thrones", "George RR Martin", 700);
        BookCL book6 = new BookCL("Goosebumps", "RL Stein", 125);

        publicLibrary.addBook(book1);
        System.out.println("\nBook 1 has an ID of "+book1.getBookId());
        publicLibrary.addBook(book2);
        System.out.println("\nBook 2 has an ID of "+book2.getBookId());
        publicLibrary.addBook(book3);
        System.out.println("\nBook 3 has an ID of "+book3.getBookId());

        publicLibrary.printAvailableBooks();

        book1.checkOut();
        publicLibrary.printAvailableBooks();
        System.out.println("\nNext available Book Id is "+BookCL.getNextIdNum());
        System.out.println("\n");
        System.out.println(book1);
        System.out.println(publicLibrary);

        //LIBRARY 2
        Library secondLibrary = new Library();
        secondLibrary.addBook(book4);
        secondLibrary.addBook(book5);
        secondLibrary.addBook(book6);
        System.out.println(secondLibrary);

        System.out.println("\nCHECKING IF LIBRARIES ARE IDENTICAL\n");
        System.out.println(publicLibrary == secondLibrary);

        System.out.println("\nCHECKING LIBRARY EQUALITY\n");
        System.out.println(publicLibrary.equals(secondLibrary));

    }
}