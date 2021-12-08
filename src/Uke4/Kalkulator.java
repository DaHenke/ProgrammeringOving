package Uke4;

public class Kalkulator {

    public double adder(double tall1, double tall2){
        return tall1+tall2;
    }

    public double subtraher(double tall1, double tall2){
        return tall1-tall2;
    }

    public double multipliser(double tall1, double tall2){
        return tall1*tall2;
    }

    public double divider(double tall1, double tall2){
        return tall1/tall2;
    }

    public String toString(double tall1, double tall2){
        return tall1 + " + " + tall2 + " = " +adder(tall1,tall2)+
                "\n"+tall1 + " - " + tall2 + " = " + subtraher(tall1,tall2) +
                "\n"+tall1 + " * " + tall2 + " = " + multipliser(tall1, tall2) +
                "\n"+tall1 + " / " + tall2 + " = " + divider(tall1,tall2);
    }


}
