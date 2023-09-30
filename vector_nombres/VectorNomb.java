
import java.util.Scanner;

public class VectorNomb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomb;
        int edad, validCont = 0;

        // Declaracion de Array
        int[] arrayEd = new int[20];
        String[] arrayNomb = new String[20];

        // Ingresar datos al Array
        System.out.println("----------------------");
        System.out.println(" * Datos personales * ");
        System.out.println("----------------------");
        for (int cont = 0; cont < arrayEd.length; cont++) {

            System.out.println("Ingrese el nombre: ");
            nomb = sc.nextLine();

            System.out.println("Ingrese la edad: ");
            edad = sc.nextInt();
            sc.nextLine(); 

            System.out.println("---------------------------------");

            // Evaluar las edades
            if (edad > 15 && edad < 45) {
                arrayEd[validCont] = edad;
                arrayNomb[validCont] = nomb;
                validCont++;
            }
        }

        // Array Edades
        System.out.println("---------------------------");
        System.out.println(" * Array Edades * ");
        System.out.println("---------------------------");
        for (int i = 0; i < validCont; i++) {
            System.out.println("Posicion del Array : " + i);
            System.out.println("Edad: " + arrayEd[i]);
            System.out.println("-----------------------------");
        }

        // Array Nombres
        System.out.println("---------------------------");
        System.out.println(" * Array Nombres * ");
        System.out.println("---------------------------");
        for (int i = 0; i < validCont; i++) {
            System.out.println("Posicion del Array : " + i);
            System.out.println("Nombre: " + arrayNomb[i]);
            System.out.println("-----------------------------");
        }

    }
}
