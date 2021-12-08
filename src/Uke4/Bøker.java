package Uke4;

public class Bøker {
    String tittel;
    double pris;
    String forfatter;
    int iSBNnummer;

    public Bøker (String tittel, double pris, String forfatter, int iSBNnummer){
        this.tittel = tittel;
        this.pris = pris;
        this.forfatter = forfatter;
        this.iSBNnummer = iSBNnummer;
    }

    public String getTittel(){
        return this.tittel;
    }
    public void setTittel(String tittel){
        this.tittel = tittel;
    }
    public double getPris(){
        return this.pris;
    }
    public void setPris(double pris){
        this.pris = pris;
    }
    public String getForfatter(){
        return this.forfatter;
    }
    public void setForfatter(String forfatter){
        this.forfatter = forfatter;
    }
    public int getiSBNnummer(){
        return this.iSBNnummer;
    }
    public void setiSBNnummer(int iSBNnummer){
        this.iSBNnummer = iSBNnummer;
    }

    public String toString(){
        return "Tittel: " + this.tittel+
                "\nPris: "+ this.pris +
                "\nForfatter: "+this.forfatter +
                "\niSBN-nummer: "+this.iSBNnummer;
    }




}
