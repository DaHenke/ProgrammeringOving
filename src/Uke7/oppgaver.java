package Uke7;

public class oppgaver {

    public static void main(String[] args){
        System.out.println("----- Oppgave 1 -----");

        for(int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }

        System.out.println("----- Oppgave 2 -----");

        int summer = 0;
        for (int i = 0; i < 10; i++){
            summer += i;
        }
        System.out.println("Sum: " + summer);


        System.out.println("----- Oppgave 3 -----");

        for(int i = 0; i < 20; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();


        System.out.println("----- Oppgave 4 -----");

        summer = 0;
        int teller=0;
        for(int i = 0; i < 100; i++){
            if(i%2 == 0){
                summer += i;
            }
            teller++;
        }
        System.out.println(summer+"/"+teller+" = "+summer/teller);


        System.out.println("----- Oppgave 5 -----");

        teller = 0;
        summer = 0;
        while(teller < 10){
            summer+=teller;
            teller++;
        }

        System.out.println(summer);

        System.out.println("----- Oppgave 6 -----");
        System.out.println("----- Oppgave 7 -----");
        System.out.println("----- Oppgave 8 -----");
        System.out.println("----- Vanskelige -----");
        System.out.println("----- Oppgave 1 -----");

        double pistart = 4;
        double pi = 0;

        for(int i = 2; i < 12; i++){
            if(i%2 > 0){
                pi = pistart-pistart/i;
            }
        }

        System.out.println("----- Oppgave 2 -----");
        System.out.println("----- Oppgave 3 -----");


    }


}
