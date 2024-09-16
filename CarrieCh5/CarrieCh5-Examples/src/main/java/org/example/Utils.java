package org.example;

public class Utils {
    static String getInitals(String fullname){
        StringBuilder initials = new StringBuilder();
        String[] names = fullname.split(" ");
        for(String name:names){
            initials.append((name.charAt(0)));
        }
        return initials.toString().toUpperCase();
    }
}
