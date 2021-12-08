package Uke4;

import Uke4.Bøker;
import static javax.swing.JOptionPane.*;

public class oppgave2 {

    public static void main(String[] args){
        Bøker nyBok = new Bøker("",0,"",0);

        nyBok.setTittel(showInputDialog("Skriv inn tittel her: "));
        nyBok.setPris(Double.parseDouble(showInputDialog("Skriv inn pris her: ")));
        nyBok.setForfatter(showInputDialog("Skriv inn forfatters navn her: "));
        nyBok.setiSBNnummer(Integer.parseInt(showInputDialog("Srkiv inn iSBNnummer her: ")));

        System.out.println(nyBok);
    }

}
