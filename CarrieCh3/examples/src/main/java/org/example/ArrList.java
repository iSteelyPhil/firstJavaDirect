package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Double> expenses = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();
        names.add("Phillip");
        names.add("Jak");
        names.add("Daxter");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        ArrayList<Integer> numSort = new ArrayList<>();
        numSort.add(1);
        numSort.add(-5);
        numSort.add(0);
        numSort.add(100);
        numSort.add(500);
        numSort.add(42);
        System.out.println(numSort);
        Collections.sort(numSort);
        System.out.println(numSort);

        fruits.add("apple");
        fruits.add("Banana");
        System.out.println(fruits);
        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.indexOf("Banana"));
        System.out.println(fruits.size());
        System.out.println(scores.size());

    }

}
