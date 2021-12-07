package Uke3;

import static javax.swing.JOptionPane.*;

public class oppgave5 {

    public double calcFahrToCelc(double fahrenheit){
        return (fahrenheit-32)/1.8;
    }

    public static void main(String[] args){
        oppgave5 nyoppgave = new oppgave5();

        double fahren = Double.parseDouble(showInputDialog("Skriv inn fahrenheit: "));

        System.out.println(fahren + " fahrenheir tilsvarer " + String.format("%.2f", nyoppgave.calcFahrToCelc(fahren)) + " celsius.");

    }

}
