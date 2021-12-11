package Uke11;

import Uke11.Bil;
import java.util.*;

public class MotorvognReg {

    public static void main(String[] args) {
        Dato dato1 = new Dato(1,12,1996);
        Dato dato2 = new Dato(15,12,1996);
        Dato dato3 = new Dato(16,1,1996);
        Bil bil1 = new Bil("Audi",dato1, "BLABAL");
        Bil bil2 = new Bil("BMW",dato2, "BLABAL");
        Bil bil3 = new Bil("Merce",dato3, "BLABAL");

        Bil[] bilList = {bil1, bil2, bil3};

        for(Bil b : bilList){
            System.out.println(b.toString());
        }
    }


}
