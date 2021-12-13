package eksamenkont2021.oppgave3;

public class Student {
    private String navn;
    private String studNr;

    public Student(String navn, String studNr){
        this.navn = navn;
        this.studNr = studNr;
    }

    public String getNavn(){
        return this.navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public String getStudNr(){
        return this.studNr;
    }

    public void setStudNr(String studNr){
        this.studNr = studNr;
    }

    public String toString(){
        return "Student : Navn=" + this.getNavn() + ", StudNr=" + this.getStudNr();
    }


}
