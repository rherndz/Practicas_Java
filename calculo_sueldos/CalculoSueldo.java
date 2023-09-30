import java.util.Scanner;

public class CalculoSueldo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantid = 0;

        System.out.print("Ingrese el numero de empleados: ");
         cantid = sc.nextInt();

        // Vectores para almacenar los datos de los empleados
        int[] sueldoBase = new int[cantid];
        int[] horasExtras = new int[cantid];
        int[] descuentos = new int[cantid];
        int[] sueldoNeto = new int[cantid];

        // Llenado de los vectores
        for (int i = 0; i < cantid; i++) {
            System.out.println("Datos del Empleado " + (i + 1) + ":");
            System.out.print("Sueldo Base: ");
            sueldoBase[i] = sc.nextInt();
            System.out.print("Horas Extras: ");
            horasExtras[i] = sc.nextInt();
            System.out.print("Descuentos: ");
            descuentos[i] = sc.nextInt();

            System.out.println("-----------------------------");

            // Sueldo Neto
            sueldoNeto[i] = sueldoBase[i] + horasExtras[i] - descuentos[i];
        }

        // Imprimir los datos de cada empleado
        System.out.println("-----------------------------");
        System.out.println(" * Resultados * ");
        System.out.println("-----------------------------");
        for (int i = 0; i < cantid; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.println("Codigo: " + (i + 1001)); 
            System.out.println("Nombre: Empleado " + (i + 1)); 
            System.out.println("Sueldo Neto: " + sueldoNeto[i]);
            System.out.println("-----------------------------");
        }
    }
}

