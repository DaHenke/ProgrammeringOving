package Uke3;

import static javax.swing.JOptionPane.*;

public class oppgave6 {

    public double calcNOK(double dollar){
        return 9.04*dollar;
    }

    public static void main(String[] args){
        oppgave6 nyoppgave = new oppgave6();

        double dollar = Double.parseDouble(showInputDialog("Skriv inn dollar: "));

        System.out.println(nyoppgave.calcNOK(dollar));
    }

}
