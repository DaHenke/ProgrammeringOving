package Uke5;

import static javax.swing.JOptionPane.*;

public class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int telefonnr;

    public Person(String fornavn, String etternavn, String adresse, int telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getFornavn(){
        return this.fornavn;
    }
    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return this.etternavn;
    }
    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public int getTelefonnr(){
        return this.telefonnr;
    }
    public void setTelefonnr(int telefonnr){
        this.telefonnr = telefonnr;
    }

    public void printMessageDialog(){
        showMessageDialog(null,
                "Fornavn: "+this.getFornavn()+
                        "\nEtternavn: "+ this.getEtternavn()+
                        "\nAdresse: " + this.getAdresse()+
                        "\nTelefonnummer: "+this.getTelefonnr());
    }
}
