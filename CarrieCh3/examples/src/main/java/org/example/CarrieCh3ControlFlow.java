package org.example;

import java.util.Arrays;

public class CarrieCh3ControlFlow {
    public static void main(String[] args) {

        //Array
        String[] hobbits = new String[8];

        hobbits[0] = "Frodo";
        hobbits[1] = "Sam";
        hobbits[4] = "Merry";
        hobbits[7] = "Pippin";
        System.out.println(hobbits[1]);
        System.out.println(Arrays.toString(hobbits));

        int[] fellowship = {1, 4, 1, 1, 2};
        System.out.println("There was " + fellowship[0] + " Wizard, " + fellowship[1] + " Hobbits, " + fellowship[2] + " Dwarf, " + fellowship[3] + " Elf, and " + fellowship[4] + " Men in the Fellowship of the Ring.");
        System.out.println(Arrays.toString(fellowship));
        //
        //ArrayList

    }
}

