package Uke1;

import static javax.swing.JOptionPane.*;

public class oppgave2 {
/*  Utvid oppgave 1 med å lese inn alderen.
    Programmet skal så vise følgende i meldingsboksen (f.eks inndata):  ”Alderen til Ole Olsen er 21 år.”*/

    public static void main(String[] args){
        String fornavn = showInputDialog("Skriv inn ditt fornavn: ");
        String etternavn = showInputDialog("Skriv inn ditt etternavn: ");
        int alder = Integer.parseInt(showInputDialog("Skriv inn din alder: "));

        showMessageDialog(null, "Alderen til " + fornavn + " " + etternavn + " er " + alder + " år.");

    }

}
