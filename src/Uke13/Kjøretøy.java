package Uke13;

import Uke11.Dato;

public class Kjøretøy {
    private String typebetegnelse;
    private Dato forstegangsregistrert;
    private String skiltnummer;

    public Kjøretøy(String typebetegnelse, Dato forstegangsregistrert, String skiltnummer){
        this.typebetegnelse = typebetegnelse;
        this.forstegangsregistrert = forstegangsregistrert;
        this.skiltnummer = skiltnummer;
    }

    public String toString(){
        return "Type: "+ this.typebetegnelse +"\nDato registrert: "+this.forstegangsregistrert.toString() + "\nSkiltnummer: "+this.skiltnummer;
    }
}
