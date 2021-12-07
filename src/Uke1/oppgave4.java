package Uke1;

import static javax.swing.JOptionPane.*;

public class oppgave4 {

/*  Endre oppgave 3 slik at det vises følgende i meldingsboksen (f.eks inndata):

    Navn : Ole Olsen
    Adresse : Osloveien 23
    Postnummer : 0470
    Poststed : Oslo
    Alder : 21 år.

    Tips: bruk \n for å få ny linje
*/


    public static void main(String[] args){
        String fornavn = showInputDialog("Skriv inn ditt fornavn: ");
        String etternavn = showInputDialog("Skriv inn ditt etternavn: ");
        int alder = Integer.parseInt(showInputDialog("Skriv inn din alder: "));
        String adresse = showInputDialog("Skriv inn din adresse: ");
        String poststed = showInputDialog("Skriv inn ditt poststed: ");
        String postnr = showInputDialog("Skriv inn ditt postnummer: ");

        showMessageDialog(null,
                "Navn : " + fornavn + " " + etternavn + "\n" +
                        "Adresse : " + adresse + "\n" +
                        "Postnummer : " + postnr + "\n" +
                        "Poststed : " + poststed + "\n" +
                        "Alder : " + alder + " år");


    }
}
