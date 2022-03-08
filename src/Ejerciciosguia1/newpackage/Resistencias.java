
package Ejerciciosguia1.newpackage;

import java.text.DecimalFormat;

public class Resistencias {
    public static void main(String[] args) {
        //variables
        double r1, r2, r3, r4, sudemo, Req;
        
        //iniciar variables
        r1 = 5.1;
        r2 = 68;
        r3 = 75;
        r4 = 82;
        DecimalFormat formato = new DecimalFormat("#0.00");
        sudemo = ((1/r1)+(1/r2)+(1/r3)+(1/r4));
        Req = 1/ sudemo;
        System.out.println("La resistecia equivalente es "+ formato.format(Req) + " Ohm");
        
    }
}
