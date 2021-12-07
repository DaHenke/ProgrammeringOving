package Uke3;

import static javax.swing.JOptionPane.*;

public class oppgave10 {

    public static void main(String[] args){
        int alder = Integer.parseInt(showInputDialog("Skriv inn alder: "));
        if (alder >= 18 ){
            System.out.println("Du kan ta førerkortet for bil da du er gammel nok!");
        }
        if (alder < 18){
            System.out.println("Du er for ung til å ta førerkort for bil!");
        }
    }

}
