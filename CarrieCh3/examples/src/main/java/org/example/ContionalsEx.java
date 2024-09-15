package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class ContionalsEx {
    public static void main(String[] args) {
        System.out.println(6 != 3 + 4);

        System.out.println(8.146 >= 10);

        //string equality
        System.out.println("Gandalf".toLowerCase().equals("gandalf"));
        //
        System.out.println(15 > 10 && 15 <= 20);
        System.out.println("fellowship".contains("boat") || "fellowship".contains("ship"));
        //SWITCHY1
        String season = "sdad";
        switch (season) {
            case "winter":
                System.out.println("The color is blue");
                break;
            case "spring":
                System.out.println("The color is green");
                break;
            case "summer":
                System.out.println("The color is yellow");
                break;
            case "autumn":
                System.out.println("The color is orange");
                break;
                default:
                System.out.println("RAGNOROK");
        }
        //SWITCHY2
        Scanner input = new Scanner(System.in);
        HashMap<String, String> noble = new HashMap<>();
        System.out.println("Please enter a name for a Noble: ");
        String nobleName = input.nextLine();
        noble.put("name", nobleName);

        String title;
        if (nobleName.equals("Eomer")){
            title = "King of Rohan";
        } else if (nobleName.equals("Eowyn")){
            title = "Lady of Ithilien";
        } else if (nobleName.equals("Aragorn")){
            title = "King of Gondor";
        }else{
            System.out.println("Don't know that guy!");
            title = null;
        }
        noble.put("title", title);

        System.out.println(noble);
    }
}
