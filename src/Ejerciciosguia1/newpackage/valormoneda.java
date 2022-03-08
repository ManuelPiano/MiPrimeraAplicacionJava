
package Ejerciciosguia1.newpackage;

import java.text.DecimalFormat;


public class valormoneda {
    public static void main(String[] args) {
        double usd, eur, uk, au, cd, var1;
        
        usd = 1;
        eur = 0.70;
        uk = 0.61;
        au = 0.95;
        cd = 0.97;
        var1 = 100.00;
        DecimalFormat formato = new DecimalFormat("#0.00");
        System.out.println("El Valor para Europa es " + formato.format(var1/eur) + " Eur");
        System.out.println("El Valor para Reino unido es " + formato.format(var1/uk) + " L");
        System.out.println("El Valor para Austaralia es " + formato.format(var1/au) + " Au");
        System.out.println("El Valor para Canada es " + formato.format(var1/cd) + " CD");
    }
}
