package org.example;
//import scanner

import java.util.Scanner;

public class CarrieCh2 {
    ///Print to console
    public static void main(String[] args) {
        System.out.println("Printy");

        //Declare and initialize variables
        String newFaveShow = "Critical Role";
        String faveActor = "Laura Bailey";
        String favePC = "Jester";
        String faveNPC = "Pumat Sol";

        System.out.println("My new favorite show is " + newFaveShow + ", starring " + faveActor + " as " + favePC + ". Also, my favorite NOC is " + faveNPC + "!");

        int niceRoundNumbah = 7;
        /*float aDecNumbah = 1.2345;*/
        float smallDecNumber = 28.1f;
        float anotherSmallDecimalNumber = (float) 1.2345;
        double largeDecNumbah = 1.23456789;

        System.out.println(niceRoundNumbah);
        System.out.println(smallDecNumber);
        System.out.println(anotherSmallDecimalNumber);
        System.out.println(largeDecNumbah);

        boolean isEven = false;
        System.out.println(isEven);

        System.out.println(getFullName("Phil", "Hesse"));

        //call static methods from ClassExample class
        ClassExample.sayHello("Bob");

        System.out.println(ClassExample.addThreeNum(1,2,3));
        //SCANNER TIME
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int userNum = input.nextInt();
        System.out.println("Num: " + userNum);


        //get user input

        System.out.println("Enter a whole number, and we'll add 10 to it! ");
        int inputNumber = input.nextInt();
        System.out.println("Final Number: " + (inputNumber + 10));
        input.close();

        //

    }
    //CREATE METHODS
    public static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    //

/*    public static int addTwo(int n1, int n2) {
        return n1 + n2;
    }

    public static void print(String str) {
        System.out.println(str);
    }*/
}
