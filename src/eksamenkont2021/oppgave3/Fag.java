package eksamenkont2021.oppgave3;

public class Fag {

    private String fagnavn;
    private int studieår;

    public Fag(String fagnavn, int studieår){
        this.fagnavn = fagnavn;
        this.studieår = studieår;
    }

    public String getFagnavn(){
        return this.fagnavn;
    }

    public void setFagnavn(String fagnavn){
        this.fagnavn = fagnavn;
    }

    public int getStudieår(){
        return this.studieår;
    }

    public void setStudieår(int studieår){
        this.studieår = studieår;
    }

    public String toString(){
        return "Fag: " + this.getFagnavn() + ", år: " + this.getStudieår();
    }
}
