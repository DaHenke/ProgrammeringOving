package Uke5;

public class BensinKjøp {
    private String sted;
    private String bensin;
    private double literfylt;
    private double prisprliter;
    private String tidspunktFylt;

    public BensinKjøp(String sted, String bensin, double literfylt, double prisprliter, String tidspunktFylt){
        this.sted = sted;
        this.bensin = bensin;
        this.literfylt = literfylt;
        this.prisprliter = prisprliter;
        this.tidspunktFylt = tidspunktFylt;
    }

    public String getSted(){
        return this.sted;
    }
    public void setSted(String sted){
        this.sted = sted;
    }
    public String getBensin(){
        return this.bensin;
    }
    public void setBensin(String bensin){
        this.bensin = bensin;
    }
    public double getLiterfylt(){
        return this.literfylt;
    }
    public void setLiterfylt(double literfylt){
        this.literfylt = literfylt;
    }
    public double getPrisprliter(){
        return this.prisprliter;
    }
    public void setPrisprliter(double prisprliter){
        this.prisprliter = prisprliter;
    }
    public String getTidspunktFylt(){
        return this.tidspunktFylt;
    }
    public void setTidspunktFylt(String tidspunktFylt){
        this.tidspunktFylt = tidspunktFylt;
    }

    public double finnTotalPrisen(){
        return this.getLiterfylt()*this.getPrisprliter();
    }

}
