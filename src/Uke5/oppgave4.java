package Uke5;

import Uke5.Klokke;

public class oppgave4 {
    public static void main(String[] args){
        Klokke nyklokke = new Klokke(21,13,13);

        nyklokke.visTiden();

        nyklokke.setTime(60);

        nyklokke.visTiden();
    }

}
