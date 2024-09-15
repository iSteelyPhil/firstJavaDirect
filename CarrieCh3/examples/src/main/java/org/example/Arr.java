package org.example;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] tenElements = new int[10];
        String[] names = new String[3];
        String[] letters = {"p", "h", "i", "l"};

        names[0] = "Phillip Hesse";
        names[1] = "Jak";
        names[2] = "Daxter";
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(tenElements));

        for (String letter : letters){
            System.out.println(letter);

        }
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);
    }
}
