package Uke13;

import Uke11.Dato;

public class Bil extends Kjøretøy{

    private double lastekap;

    public Bil(String typebetegnelse, Dato forstegangsregistrering, String skiltnummer, double lastekap){
        super(typebetegnelse, forstegangsregistrering, skiltnummer);
        this.lastekap = lastekap;
    }

    public String toString(){
        return super.toString() + "\nLastekapasitet: " + lastekap;
    }


}
