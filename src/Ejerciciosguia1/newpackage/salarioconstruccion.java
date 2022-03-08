
package Ejerciciosguia1.newpackage;


public class salarioconstruccion {
    public static void main(String[] args) {
        double jornadaNormal, horasExtras, ValorHorasExtras, diasLaborales, salario;
        
        jornadaNormal = 10;
        horasExtras = 50;
        ValorHorasExtras = 0.1*jornadaNormal*horasExtras;
        diasLaborales = 28;
        salario = jornadaNormal*diasLaborales;
       
        System.out.println("El pago total sin hora extras es de : $" + jornadaNormal*diasLaborales );
        System.out.println("el pago con horas extras es : $" + (salario+ValorHorasExtras));
    }
}
