package Uke2;

import static javax.swing.JOptionPane.*;

public class oppgave1 {

    //Lag et program som leser inn alderen din (et heltall). Vis så denne i en meldingsbox sammen med en tekst f.eks som ”Min alder er 19 år.”

    public static void main(String[] args){
          int alder = Integer.parseInt(showInputDialog("Skriv inn din alder: "));

          showMessageDialog(null, "Min alder er " + alder + " år. ");
    }

}
