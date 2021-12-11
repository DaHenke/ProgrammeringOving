package Uke9;

public class oppgave5 {
    public static void main(String[] args){
        int[][] todimarr = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};

        for(int i = 0 ; i < todimarr.length ; i++){
            for(int j = 0; j < todimarr[i].length; j++){
                System.out.print(todimarr[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i = 0 ; i < 4 ; i++){
            double gjennomsnitt;
            double summer = 0;
            double teller = 0;
            for(int j = 0; j < 3; j++){
                summer+=todimarr[j][i];
                teller++;
            }
            gjennomsnitt = summer/teller;
            System.out.println("Gjennomsnitt: " + String.format("%.2f",gjennomsnitt));
        }
    }
}
