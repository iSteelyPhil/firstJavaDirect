package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* HelloWorld goodbye = new HelloWorld("Goodbye World");
        System.out.println(goodbye.getMessage()); // prints "Goodbye World"
        goodbye.setMessage("Sayonara");
        System.out.println(goodbye.getMessage());*/
        HelloWorld hello = new HelloWorld();
        hello.sayHello();

        Student phil = new Student("Phil", 1, 22, 3.0);
        System.out.println(phil.studentInfo());
    }
}