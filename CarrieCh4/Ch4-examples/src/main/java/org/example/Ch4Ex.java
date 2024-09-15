package org.example;

public class Ch4Ex {
   String name;
   int level;

   Ch4Ex(){
       level = 1;
   }
    Ch4Ex(String name, int level){
        this.name = name;
        this.level = level;
    }
   void attack(){
       System.out.println(name+" Attack!");
   }
}
