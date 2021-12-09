package Uke8;

public class oppgave2 {

    public static void main(String[] args){

        int[] liste = {1,2,3,4,5,6,7,8,9};

        int summer=0;
        int teller = 0;

        for(int i = 0; i < liste.length; i++){
            summer += liste[i];
            teller++;
        }

        System.out.println(summer);
        System.out.println(summer/teller);

        summer = 0;
        teller = 0;

        for(int i = 5; i < liste.length;i++){
            summer+=liste[i];
            teller++;
        }

        System.out.println(summer);
        System.out.println(summer/teller);

        summer = 0;
        for(int f : liste){
            summer += f;
        }

        System.out.println(summer);

    }

}
