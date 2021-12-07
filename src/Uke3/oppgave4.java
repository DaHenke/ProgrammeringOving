package Uke3;

import static javax.swing.JOptionPane.*;

public class oppgave4 {

    public double calcOmkretsCircle(double radius){
        return 2*Math.PI*radius;
    }

    public static void main(String[] args){
        oppgave4 nyoppgave = new oppgave4();
        double radius = Double.parseDouble(showInputDialog("Skriv radius her: "));

        System.out.println("Omkretsen av en sirkel med " + radius + " cm som radius blir " + String.format("%.2f", nyoppgave.calcOmkretsCircle(radius)));
    }

}
