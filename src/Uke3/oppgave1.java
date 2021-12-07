package Uke3;

import static javax.swing.JOptionPane.*;

public class oppgave1 {

    int today = 2021;
    int pensj = 67;

    public void doPrint(String name, int age){
        System.out.println(name + " er i dag " + age + " år. Han er født i " + calcBirth(age) + ". I " + calcFutAge(age) + " er han " + pensj + " år og da vil han være pensjonist");
    }

    public int calcBirth(int age){
        return today-age;
    }

    public int calcFutAge(int age){
        return calcBirth(age)+pensj;
    }


    public static void main(String[] args){
        oppgave1 nyoppgave = new oppgave1();
        nyoppgave.doPrint(showInputDialog("Skriv et navn her: "), Integer.parseInt(showInputDialog("Skriv inn alder her:")));
    }
}
