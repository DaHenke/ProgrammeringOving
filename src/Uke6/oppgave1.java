package Uke6;

import static javax.swing.JOptionPane.*;

public class oppgave1 {

    public static void main(String[] args){
        int alder = Integer.parseInt(showInputDialog("Skriv inn din alder"));

        switch(alder){
            case 18:
                System.out.println("Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet.");
                break;

            case 19:
                System.out.println("Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet.");
                break;

            case 20:
                System.out.println("Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet.");
                break;

            default:
                System.out.println("Du er enten umyndig eller så kan du kjøpe hva du vil på polet.");
                break;
        }
    }
}