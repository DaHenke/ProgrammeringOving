package Uke3;

import static javax.swing.JOptionPane.*;

public class oppgave3 {

    public double arealRectangle(double lengde, double bredde){
        return lengde*bredde;
    }


    public static void main(String[] args){
        double lengde = Double.parseDouble(showInputDialog("Skriv inn lengde til rektangelet her: "));
        double bredde = Double.parseDouble(showInputDialog("Skriv inn bredde til rektangelet her: "));

        oppgave3 nyoppgave = new oppgave3();

        System.out.println("Et rektangel med bredde " + bredde + " cm, og lengde " + lengde + " har et areal på " + nyoppgave.arealRectangle(lengde, bredde) + " cm^2.");
    }

}
