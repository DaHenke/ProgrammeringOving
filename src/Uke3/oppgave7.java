package Uke3;

import static javax.swing.JOptionPane.*;

public class oppgave7 {

    public void calcPizza(int antallPizza, int antallPers, int antallSlices){
        int totSlices = antallPizza*antallSlices;
        int rest = totSlices%antallPers;
        int fordeling = totSlices/antallPers;
        System.out.println("Dersom man er "+ antallPers +" personer og har " + antallPizza + " pizzaer får hver person "+fordeling+ " skiver og " + rest +" blir til overs.");
    }

    public static void main(String[] args){
        oppgave7 nyoppgave = new oppgave7();

        int antallPizza = Integer.parseInt(showInputDialog("Skriv inn antall pizza: "));
        int antallPers = Integer.parseInt(showInputDialog("Skriv inn antall personer: "));
        int antallSlices = Integer.parseInt(showInputDialog("Skriv inn antall skiver på pizzaen: "));

        nyoppgave.calcPizza(antallPizza, antallPers, antallSlices);
    }

}
