package oppgave4;

public class SjekkArray {
    public static int summer(int tall1, int tall2, int[] liste){
        int summer = 0;
        if(tall1 < 0 || tall1 > liste.length-1){
            System.out.println("Tall1 er enten for lite eller større enn arrayet");
            if(tall2 < tall1 || tall2 > liste.length-1){
                System.out.println("Tall2 er enten mindre enn tall1 eller større enn arrayet...");
            }
            return 0;
        }else{
            summer = 0;
            for(int i = tall1; i<=tall2; i++){
                summer+=liste[i];
            }
        }
        return summer;
    }


    public static void main(String[] args){
        int tall1 = 5;
        int tall2 = 5;

        int[] liste = {2,4,6,12,78,45,3,42,5,-7};

        System.out.println(summer(tall1, tall2, liste));

    }



}
