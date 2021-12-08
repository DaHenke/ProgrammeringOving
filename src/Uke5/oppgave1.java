package Uke5;

import Uke5.Person;
import static javax.swing.JOptionPane.*;

public class oppgave1 {

    public static void main(String[] args){
        Person nypers = new Person(
                showInputDialog("Skriv inn ditt fornavn: "),
                showInputDialog("Skriv inn ditt etternavn: "),
                showInputDialog("Skriv inn din adresse: "),
                Integer.parseInt(showInputDialog("Skriv inn ditt telefonnummer: "))
        );

        nypers.printMessageDialog();
    }

}
