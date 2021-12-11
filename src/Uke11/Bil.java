package Uke11;

public class Bil {
    private String typebetegnelse;
    private Dato forstegangsregistrert;
    private String skiltnummer;

    public Bil(String typebetegnelse, Dato forstegangsregistrert, String skiltnummer){
        this.typebetegnelse = typebetegnelse;
        this.forstegangsregistrert = forstegangsregistrert;
        this.skiltnummer = skiltnummer;
    }

    public String toString(){
        return "Type: "+ this.typebetegnelse +"\nDato registrert: "+this.forstegangsregistrert.toString() + "\nSkiltnummer: "+this.skiltnummer;
    }

}
