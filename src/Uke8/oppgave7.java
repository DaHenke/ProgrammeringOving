package Uke8;

public class oppgave7 {

    public static void main(String[] args) {
        int[] liste = {2,3,8,7,6,4};

        int partall = 0;
        int oddetall = 0;


        for(int i = 0; i < liste.length; i++){
            if(liste[i]%2 == 0){
                partall++;
            }else{
                oddetall++;
            }
        }
        System.out.println("Antall partall: " + partall);
        System.out.println("Antall oddetall: " + oddetall);

    }
}
