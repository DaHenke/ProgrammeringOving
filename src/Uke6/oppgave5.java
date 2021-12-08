package Uke6;

import static javax.swing.JOptionPane.*;

public class oppgave5 {

    public static void main(String[] args){
        String maned = showInputDialog("Skriv inn måned: ");

        switch(maned){
            case "Desember":
                System.out.println("Vinter");
                break;
            case "Januar":
                System.out.println("Vinter");
                break;
            case "Februar":
                System.out.println("Vinter");
                break;
            case "Mars":
                System.out.println("Vår");
                break;
            case "April":
                System.out.println("Vår");
                break;
            case "Mai":
                System.out.println("Vår");
                break;
            case "Juni":
                System.out.println("Sommer");
                break;
            case "Juli":
                System.out.println("Sommer");
                break;
            case "August":
                System.out.println("Sommer");
                break;
            case "September":
                System.out.println("Høst");
                break;
            case "Oktober":
                System.out.println("Høst");
                break;
            case "November":
                System.out.println("Høst");
                break;
            default:
                System.err.println("IKKE GYLDIG");
                break;
        }


    }

}
