package Uke9;

import java.util.*;

public class oppgave1 {

    public static void main(String[] args){
     List<Integer> liste = new ArrayList<>();
     for(int i = 1; i < 10; i++){
         liste.add(i);
     }

     System.out.println(liste);

     System.out.println(liste.get(2));
     System.out.println(liste.get(5));

    }
}
