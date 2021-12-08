package Uke4;

public class Person {

    String navn;
    String adresse;
    int telefonnr;
    int fodselsar;


    public Person(String navn, String adresse, int telefonnr, int fodselsar){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.fodselsar = fodselsar;
    }

    public String getNavn(){
        return this.navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }

    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(){
        this.adresse = adresse;
    }

    public int getTelefonnr(){
        return this.telefonnr;
    }
    public void setTelefonnr(int telefonnr){
        this.telefonnr = telefonnr;
    }

    public int getFodselsar(){
        return this.fodselsar;
    }
    public void setFodselsar(int fodselsar){
        this.fodselsar = fodselsar;
    }

    public int calcAge(){
        int today = 2021;
        return today-this.fodselsar;
    }

    public void printTask(int age){
        System.out.println(this.navn + " med adresse " + this.adresse + " med telefonnummer " + this.telefonnr + " er " + age + " år.");
    }

    public String toString(int age){
        return "Navn: "+this.navn+
                "\nAdresse: "+this.adresse+
                "\nTelefonnr: "+this.telefonnr+
                "\nAlder: "+ age;
    }

}
