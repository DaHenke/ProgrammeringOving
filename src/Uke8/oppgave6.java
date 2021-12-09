package Uke8;

public class oppgave6 {

    public static void main(String[] args){
        int[] liste1 = {1,2,3,4,5};
        int[] liste2 = {1,2,3,4,5};

        int teller = 0;

        for(int i = 0; i < liste1.length; i++){
            if(liste1.length == liste2.length) {
                if (liste1[i] == liste2[i]) {
                    teller++;
                }
            }else{
                break;
            }
        }

        if(teller == liste1.length){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

    }


}
