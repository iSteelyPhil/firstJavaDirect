package org.example;

public class BookCL {

    private static int nextIdNum = 1;

    private final String bookId;

    private String title;
    private String author;
    private int numPages;
    private boolean available = true;

    public BookCL(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        bookId = generateBookId();
    }

    public BookCL(String title, String author) {
        this(title, author, 0);
    }

    public static int getNextIdNum() {
        return nextIdNum;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return  getTitleAndAuthor()+ "\nPage Count: "+ numPages+"\nID: "+bookId;
    }

    //Instance Methods


    private String generateBookId() {
        String id = Utils.getInitals(author) + "-" + title.substring(0, 3).toUpperCase() + "-" + nextIdNum;
        nextIdNum++;
        return id;
    }

    public String getTitleAndAuthor() {
        return title + " by " + author;
    }

    public void checkOut() {
        available = false;
        System.out.println(title + " by " + author + " has been checked out of the library by you!");
    }

    public void checkIn() {
        available = true;
        System.out.println(title + " by " + author + " has been checked in and returned to the library by you!");
    }
}
