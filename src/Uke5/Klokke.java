package Uke5;

public class Klokke {
    private int time;
    private int minutt;
    private int sekund;

    public Klokke(int time, int minutt, int sekund){
        this.time = time;
        this.minutt = minutt;
        this.sekund = sekund;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if(time >= 0 && time <= 24) {
            this.time = time;
        }else{
            System.err.println("FEIL NUMMER FOR TIME!!!!!");
        }

    }

    public int getMinutt() {
        return minutt;
    }

    public void setMinutt(int minutt) {
        if(minutt >= 0 && minutt <= 59) {
            this.minutt = minutt;
        }else{
            System.err.println("FEIL NUMMER FOR MINUTT!!!!!");
        }
    }

    public int getSekund() {
        return sekund;
    }

    public void setSekund(int sekund) {
        if(sekund >= 0 && sekund <= 59) {
            this.sekund = sekund;
        }else{
            System.err.println("FEIL NUMMER FOR SEKUND!!!!!");
        }

    }

    public void visTiden(){
        System.out.println(this.getTime()+":"+this.getMinutt()+":"+this.getSekund());
    }


}
