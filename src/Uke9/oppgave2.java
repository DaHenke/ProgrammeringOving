package Uke9;

import java.util.ArrayList;
import java.util.List;

public class oppgave2 {

    public static void main(String[] args){

        List<Integer> liste = new ArrayList<>();
        for(int i = 1; i < 12; i++){
            liste.add(i);
        }

        liste.remove(1);
        liste.remove(1);

        for(int i = 0; i < liste.size(); i++){
            System.out.println(liste.get(i));
        }

    }

}
