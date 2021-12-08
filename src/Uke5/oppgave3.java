package Uke5;

import Uke5.BensinKjøp;

public class oppgave3 {

    public static void main(String[] args){
        BensinKjøp nyttkjøp = new BensinKjøp("Norge", "Bensin", 40, 18, "18:13");

        System.out.printf("%.2f%n",nyttkjøp.finnTotalPrisen());
    }
}
