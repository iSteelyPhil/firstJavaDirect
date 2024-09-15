package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class STudioSUperBonus {
    public static void main(String[] args) {
        String quoteFromFile ="";
        try {
           File textFromFile = new File("C:\\Users\\Phillip\\LaunchCode\\JAVASTUFF\\testDirectoy\\CarrieCh3\\examples\\src\\main\\java\\org\\example\\quote.text");
           Scanner myReader = new Scanner(textFromFile);
           if (myReader.hasNextLine()){
               quoteFromFile = myReader.nextLine();
           }
           myReader.close();
        } catch(FileNotFoundException e){
            System.out.println("An error occured when trying to read file");
        }
        System.out.println("Please enter a string in order to count the characters in it: ");
        char[] charArray = quoteFromFile.toLowerCase().toCharArray();
        HashMap<Character, Integer> countChar = new HashMap<>();
        for (char letter : charArray) {
            if (Character.isLetter(letter)) {
                countChar.put(letter, countChar.getOrDefault(letter, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> count : countChar.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
