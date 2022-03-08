
package Ejerciciosguia1.newpackage;


public class salariodocente {
    public static void main(String[] args) {
        double horaClase, renta, salario, horasMes, salarioConRenta;
        
        horaClase = 8.00;
        renta = 0.10;
        horasMes = 36;
        
        //iniciar variables
        salario = (horaClase*horasMes);
        salarioConRenta = salario*renta;
        System.out.println("Salario total: " + salario + "$");
        System.out.println("Salario con descuentos" + (salario - salarioConRenta) + "$");
    }
}
