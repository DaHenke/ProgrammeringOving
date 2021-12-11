package Uke13;

import Uke11.Dato;

public class Motorsykkel extends Kjøretøy{

    public Motorsykkel(String typebetegnelse, Dato forstegangsregistrering, String skiltnummer){
        super(typebetegnelse, forstegangsregistrering, skiltnummer);
    }

    public String toString(){
        return super.toString();
    }
}
