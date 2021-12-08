package Uke4;

import Uke4.Person;
import static javax.swing.JOptionPane.*;

public class oppgave4 {

public static void main(String[] args){
    Person nyPerson = new Person(
            showInputDialog("Skriv inn ditt navn her: "),
            showInputDialog("Skriv inn din adresse her: "),
            Integer.parseInt(showInputDialog("Skriv inn ditt telefonnummer her: ")),
            Integer.parseInt(showInputDialog("Skriv inn ditt fødselsår her: "))
    );

    int age = nyPerson.calcAge();
    System.out.println(nyPerson.toString(age));
}

}
