package Uke1;

import static javax.swing.JOptionPane.*;

/*          Utvid oppgave 2 med adresse, poststed og postnr.
            Les inn dataene i flere inputbox'er og skriv det ut i en setning f.eks : Ole Olsen bor i Osloveien 23
            som har postnummer 0470 i Oslo. Ole’s alder er 21 år.
*/

public class oppgave3 {

    public static void main(String[] args){
        String fornavn = showInputDialog("Skriv inn ditt fornavn: ");
        String etternavn = showInputDialog("Skriv inn ditt etternavn: ");
        int alder = Integer.parseInt(showInputDialog("Skriv inn din alder: "));
        String adresse = showInputDialog("Skriv inn din adresse: ");
        String poststed = showInputDialog("Skriv inn ditt poststed: ");
        String postnr = showInputDialog("Skriv inn ditt postnummer: ");

        showMessageDialog(null, fornavn + " " + etternavn + " bor i " + adresse + " som har postnummer " + postnr + " i " + poststed + ". " + fornavn + "'s alder er " + alder + " år.");
    }

}
