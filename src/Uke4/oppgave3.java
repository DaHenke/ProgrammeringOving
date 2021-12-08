package Uke4;

import Uke4.Person;

public class oppgave3 {

    public static void main(String[] args){
        Person henrik = new Person("Henrik Madsen", "BG21", 97699837, 1996);
        int age = henrik.calcAge();
        henrik.printTask(age);

        Person berit = new Person("Berit Beritsen", "Din lille luremus", 12345678, 1988);
        age = berit.calcAge();
        berit.printTask(age);


    }

}
