
package Ejerciciosguia1.newpackage;


public class afp {
    public static void main(String[] args) {
        double afpTrabajador, afpEmpleador, salario;
        
        afpTrabajador = 0.06;
        afpEmpleador =  0.065;
        salario = 500;
        
        System.out.println("El trabajador en concepto de empleado, paga a las AFP: " + salario*afpTrabajador + "$");
        System.out.println("El trabajador en concepto de empleador, paga a las AFP: " + salario*afpEmpleador + "$");
    }
}
