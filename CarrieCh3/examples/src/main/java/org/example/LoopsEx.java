package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopsEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        String[] battles = {
                "The battle of Moria",
                "Battle for Isengarde",
                "Battle for Helm's Deep",
                "Battle of Pelennor Fields",
                "The Battle at the Black Gate"
        };
        for (int i = 0; i < battles.length; i++) {
            System.out.println(battles[i]);
        }
        String[] words = {"I", "am", "learning", "Java"};
        for (String word : words) {
            System.out.println(word);
        }
        HashMap<String, String> moria = new HashMap<>();
        moria.put("name", "the Mines of Moria");
        moria.put("ancientName", "Khazad-Dum");
        moria.put("location", "the Misty Mountains");
        moria.put("founder", "Durin");
        moria.put("king", "Balin");
        moria.put("monster", "a Balrog");
        //
        for (String key : moria.keySet()) {
            System.out.println(key);
        }
        for (String value : moria.values()) {
            System.out.println(value);
        }
        for (Map.Entry<String, String> entry : moria.entrySet()) {
            System.out.println("The " + entry.getKey() + " of Moria is " + entry.getValue());
        }
        int[] numbers = {1, 5, 10, 27, 45, 55, 100, 150, 1000, 77, 2,};
        int index = 0;
        while (numbers[index] < 100) {
            System.out.println(numbers[index]);
            index++;
        }
        ArrayList<String> bookTitles = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String title;
        boolean isQuitting = false;

        do {
            System.out.println("Please enter a book title or QUIT: ");
            title = input.nextLine();
            isQuitting = title.toLowerCase().equals("quit");
            if (!isQuitting){
                bookTitles.add(title);
            }
        } while (!isQuitting);
        System.out.println(bookTitles);
        input.close();
    }
}
