package Uke2;

import static javax.swing.JOptionPane.*;

public class oppgave3 {

    //Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn. Vis så dette resultatet via 1) Meldingsboks og 2) System.out.

    public double calcAverage(double tall1, double tall2, double tall3){
        return (tall1 + tall2 + tall3)/3;
    }

    public static void main(String[] args){
        oppgave3 nyoppgave = new oppgave3();

        double tall1 = Double.parseDouble(showInputDialog("Skriv inn det første tallet: "));
        double tall2 = Double.parseDouble(showInputDialog("Skriv inn det andre tallet: "));
        double tall3 = Double.parseDouble(showInputDialog("Skriv inn det siste tallet: "));

        showMessageDialog(null, nyoppgave.calcAverage(tall1, tall2, tall3));

        System.out.println(nyoppgave.calcAverage(tall1, tall2, tall3));

    }

}
