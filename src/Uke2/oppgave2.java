package Uke2;

import static javax.swing.JOptionPane.*;

public class oppgave2 {

    //Lag et program som leser inn tre desimaltall. Programmet skal så summere disse tallene og vise summen i System.out.

    public double summerTall(double tall1, double tall2, double tall3){
        return tall1 + tall2 + tall3;
    }


    public static void main(String[] args){
        oppgave2 nyoppgave = new oppgave2();

        double tall1 = Double.parseDouble(showInputDialog("Skriv inn et tall: "));
        double tall2 = Double.parseDouble(showInputDialog("Skriv inn et tall: "));
        double tall3 = Double.parseDouble(showInputDialog("Skriv inn et siste tall: "));

        System.out.println(nyoppgave.summerTall(tall1, tall2, tall3));
    }

}
