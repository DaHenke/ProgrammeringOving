package Uke8;

import static javax.swing.JOptionPane.*;

public class oppgave8 {

    public static void main(String[] args) {
        boolean sjekk = true;
        while(sjekk) {
            try {
                int antallPS = Integer.parseInt(showInputDialog("Skriv inn antall elever: "));

                int[] liste = new int[antallPS];

                for(int i = 0; i < antallPS ; i++){
                    int poeng = Integer.parseInt(showInputDialog("Skriv inn poeng: "));

                    liste[i] = poeng;
                }

                int summer = 0;
                for (int i = 0 ; i < liste.length; i++){
                    if(i == liste.length-1){
                        System.out.println(liste[i]);
                        break;
                    }
                    System.out.print(liste[i]+", ");
                }

                int teller = 0;
                for(int i = 0; i < liste.length; i++){
                    summer += liste[i];
                    teller++;
                }

                System.out.println("Gjennomsnittlig poengsum: "+ summer/teller);
                sjekk = false;
            } catch (Exception e) {
                sjekk = true;
            }
        }
    }
}
