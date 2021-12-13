package eksamenkont2021;

import static javax.swing.JOptionPane.*;

public class test {
    public static void beregnBMI(double vekt, double høyde){
        showMessageDialog(null, "Din BMI er: " + (1.3*vekt)/Math.pow((høyde/100), 2.5));
    }


    public static void main(String[] args){
        try{
            double vekt = Double.parseDouble(showInputDialog("Skriv inn din vekt (i kg) her: "));
            double høyde = Double.parseDouble(showInputDialog("Skriv inn din høyde (i cm) her: "));
            beregnBMI(vekt, høyde);
        }catch(Exception e){
            System.err.println("Ikke gyldig format for vekt eller høyde!");
        }
    }

}
