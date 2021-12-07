package Uke1;

import javax.swing.JOptionPane;

public class oppgave1 {
    /*Lag et program som leser inn en persons fornavn og etternavn hver for seg (altså i to forskjellige input-bokser),
    skjøter dem sammen, og skriver det fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks.
    Bruk passende ledetekster ved innlesing, slik at brukeren forstår hva som skal skrives inn.*/

    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavn: ");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavn: ");

        JOptionPane.showMessageDialog(null, fornavn + " " + etternavn);

    }
}
