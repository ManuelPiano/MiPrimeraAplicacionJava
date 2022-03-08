
package Ejerciciosguia1.newpackage;

import java.text.DecimalFormat;


public class notasEvaluaciones {
    public static void main(String[] args) {
        double parcial1, parcial2, parcial3, parcial4, parcial5, suparcial;
        final double eva1 = 0.25, eva2 = 0.15, eva3 = 0.15, eva4 = 0.20, eva5 = 0.25;
        
        parcial1 = 8.0;
        parcial2 = 7.5;
        parcial3 = 9.0;
        parcial4 = 8.0;
        parcial5 = 9.0;
        DecimalFormat formato = new DecimalFormat("#0.00");
        suparcial = ((parcial1*eva1)+(parcial2*eva2)+(parcial3*eva3)+(parcial4*eva4)+(parcial5*eva5));
        System.out.println("promedio de estudiante es: " + formato.format(suparcial));
    }
}
