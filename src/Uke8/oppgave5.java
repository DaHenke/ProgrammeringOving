package Uke8;

public class oppgave5 {

    public static void main(String[] args) {
        int[] liste = {45, 34, 5, 8, 10, 2 , 13, 25 };

        int størst = liste[0];
        int minst = liste[0];

        for(int i = 0; i < liste.length; i++){
            if(liste[i] > størst) størst = liste[i];
            if(liste[i] < minst) minst = liste[i];
        }

        System.out.println(størst);
        System.out.println(minst);
    }
}
