package Uke1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave5 {


/*  Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks, men i System.out.*/

    public static void main(String[] args){
        String fornavn = showInputDialog("Skriv inn ditt fornavn: ");
        String etternavn = showInputDialog("Skriv inn ditt etternavn: ");
        int alder = Integer.parseInt(showInputDialog("Skriv inn din alder: "));
        String adresse = showInputDialog("Skriv inn din adresse: ");
        String poststed = showInputDialog("Skriv inn ditt poststed: ");
        String postnr = showInputDialog("Skriv inn ditt postnummer: ");

        System.out.println("Navn : " + fornavn + " " + etternavn + "\n" +
                "Adresse : " + adresse + "\n" +
                "Postnummer : " + postnr + "\n" +
                "Poststed : " + poststed + "\n" +
                "Alder : " + alder + " år");



    }

}
