package Uke3;

import java.util.Random;

import static javax.swing.JOptionPane.*;

public class oppgave11 {

    public static void main(String[] args){
        Random r = new Random();
        int tall = r.nextInt(1000 + 1)+1;
        System.out.println(tall);
        int rest;
        int sum = 0;
        while(tall >= 1 ){
            rest = tall%10;
            sum += rest;
            tall = tall/10;
        }

        System.out.println(sum);

    }
}
