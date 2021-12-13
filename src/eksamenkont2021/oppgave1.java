package eksamenkont2021;

public class oppgave1 {

    public static void main(String[] args){
        int[] array = {20,34,-4,4,5,11,-23};

        System.out.println("----DEL 1----");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println("\n----DEL 2----");
        for(int i = array.length-1; i >= 0; i-- ){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n----DEL 3----");
        int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println("\n----DEL 4----");
        sum = 0;
        int teller = 0;
        for(int i = 0 ; i < array.length ; i++){
            sum += array[i];
            teller++;
        }
        System.out.println(sum/teller);

        System.out.println("\n----DEL 5----");

        for(int i : array){
            if(i < 20 && i > 0){
                System.out.println(i);
            }
        }
    }
}
