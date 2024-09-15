package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*    Ch4Ex p1 = new Ch4Ex();
        p1.name = "Pikachu";
        p1.level = 10;
        Ch4Ex p2 = new Ch4Ex();
        p2.name = "Entei";
        p2.level = 50;
        p2.attack();

        System.out.println(p1.name + " is level " + p1.level);*/
        Ch4Ex p1 = new Ch4Ex("Eevee", 20);
        System.out.println(p1.level);
        p1.attack();

    }
}