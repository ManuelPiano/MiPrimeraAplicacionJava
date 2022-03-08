
package miprimeraaplicacionjava;

import java.text.DecimalFormat;


public class AreaDeUnCirculo {
    public static void main(String[] args) {
        //variables
        double area, radio;
        final double pi = 3.1416;
        area = 145;
        
        DecimalFormat formato = new DecimalFormat("#0.00");
        //uso de variables
        
        radio= Math.sqrt(area/pi);
        System.out.println("Radio: " + formato.format(radio) + " cm");
              
    }
}
