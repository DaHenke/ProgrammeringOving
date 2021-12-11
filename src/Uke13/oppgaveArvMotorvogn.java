package Uke13;
import Uke11.Dato;


public class oppgaveArvMotorvogn {
    public static void main(String[] args) {
        Dato dato1 = new Dato(1,12,1996);
        Dato dato2 = new Dato(15,12,1996);
        Dato dato3 = new Dato(16,1,1996);
        Motorsykkel bil1 = new Motorsykkel("Audi",dato1, "BLABAL");
        Motorsykkel bil2 = new Motorsykkel("BMW",dato2, "BLABAL");
        Bil bil3 = new Bil("Merce",dato3, "BLABAL", 120);

        Kjøretøy[] liste = {bil1,bil2,bil3};

        for(Kjøretøy k : liste){
            System.out.println(k.toString());
        }
    }



}
