package Uke2;

import java.io.IOException;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave4 {
/*  Endre på programmet i oppgave 3 slik at du sikrer at det skrives inn tall og ikke vanlig tekst i input-boksene.
    Bruk try og catch for å få dette til. Dersom det ikke skrives inn tall sett input til 0.*/

    public double calcAverage(double tall1, double tall2, double tall3){
        return (tall1 + tall2 + tall3)/3;
    }

    public static void main(String[] args){
        oppgave4 nyoppgave = new oppgave4();
        double tall1;
        double tall2;
        double tall3;
        try {
            tall1 = Double.parseDouble(showInputDialog("Skriv inn det første tallet: "));
            tall2 = Double.parseDouble(showInputDialog("Skriv inn det andre tallet: "));
            tall3 = Double.parseDouble(showInputDialog("Skriv inn det siste tallet: "));
        }catch(Exception e){
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
        }
        showMessageDialog(null, nyoppgave.calcAverage(tall1, tall2, tall3));
    }

}
