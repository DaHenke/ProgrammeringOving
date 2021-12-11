package Uke9;

import java.util.*;

public class oppgave4 {

    public static void main(String[] args){
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int[] liste = new int[array.size()];

        for(int i = 0 ; i < array.size(); i++){
            liste[i] = array.get(i);
        }

        for(int i : liste){
            System.out.println(i);
        }

    }
}
