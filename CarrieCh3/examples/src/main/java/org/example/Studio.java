package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Studio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";*/
        System.out.println("Please enter a string in order to count the characters in it: ");
        String quote = input.nextLine();
        char[] charArray = quote.toLowerCase().toCharArray();
        HashMap<Character, Integer> countChar = new HashMap<>();
        for (char letter : charArray) {
            if (Character.isLetter(letter)) {
                if (countChar.containsKey(letter)) {
                    countChar.put(letter, countChar.get(letter) + 1);
                } else {
                    countChar.put(letter, 1);
                }
            } else {
                System.out.println("Enter a valid string of characters!");
            }
        }
        for (Map.Entry<Character, Integer> count : countChar.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
        input.close();
    }
}
