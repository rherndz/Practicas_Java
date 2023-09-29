import java.util.Scanner;

public class ServicioLibros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String opMenu = " ";
        boolean vald1 = false, vald2 = false, vald3 = false;
        int option = 0, cantdLibros = 0;
        double opLibrosA = 0.00, opLibrosB = 0.00, opLibrosC = 0.00, pagoTotal = 0.00;
        
        for (int i = 0; i < 5; ) {
            
            System.out.println("---------------------");
            System.out.println(" *Menu del Catalogo* ");
            System.out.println("---------------------");
            
            System.out.println("1. Libro A ($15.00) ");
            System.out.println("2. Libro B ($12.00) ");
            System.out.println("3. Libro C ($18.00) ");
            System.out.println("4. Detalles del Catalogo ");
            System.out.println("5. Salir ");
            
            System.out.println("Seleccion una opcion del Menu");
            option = sc.nextInt();
            
            if (option <= 0 | option > 5) {
                System.out.println("------------------------------------");
                System.out.println(" *La opcion ingresada es Invalidad* ");
                System.out.println("------------------------------------");
            }
            
            switch(option){
            
                case 1: opMenu = "1. Opcion Libro A";

                    System.out.println("Ingrese la cantidad de libros");
                    cantdLibros = sc.nextInt();

                    if (cantdLibros <= 0) {
                        System.out.println("-----------------------------------");
                        System.out.println(" * Debe comprar al menos un libro *");
                        System.out.println("-----------------------------------");
                    }

                    opLibrosA = cantdLibros * 15.00;

                    vald1 = true;
                    System.out.println("----------------------------------");
                    System.out.println("Cantidad de libros: " + cantdLibros);
                    System.out.println("Costo de la compra: $" + opLibrosA + " Dolares");
                    System.out.println("----------------------------------");

                break;

                case 2: opMenu = "2. Opcion Libro B";

                    System.out.println("Ingrese la cantidad de libros");
                    cantdLibros = sc.nextInt();

                    if (cantdLibros <= 0) {
                        System.out.println("-----------------------------------");
                        System.out.println(" * Debe comprar al menos un libro *");
                        System.out.println("-----------------------------------");
                    }

                    opLibrosB = cantdLibros * 12.00;

                    vald2 = true;
                    System.out.println("----------------------------------");
                    System.out.println("Cantidad de libros: " + cantdLibros);
                    System.out.println("Costo de la compra: $" + opLibrosB + " Dolares");
                    System.out.println("----------------------------------");

                break;

                case 3: opMenu = "3. Opcion Libro C";


                    System.out.println("Ingrese la cantidad de libros");
                    cantdLibros = sc.nextInt();

                    if (cantdLibros <= 0) {
                        System.out.println("-----------------------------------");
                        System.out.println(" * Debe comprar al menos un libro *");
                        System.out.println("-----------------------------------");
                    }

                    opLibrosC = cantdLibros * 18.00;

                    vald3 = true;
                    System.out.println("----------------------------------");
                    System.out.println("Cantidad de libros: " + cantdLibros);
                    System.out.println("Costo de la compra: $" + opLibrosC + " Dolares");
                    System.out.println("----------------------------------");

                break;

                case 4: opMenu = "4. Opcion Catalogo";
                
                System.out.println("-------------------------");
                System.out.println(" *Detalles del Catalogo* ");
                System.out.println("-------------------------");
                System.out.println("1. Libro A $15.00 por Unidad");
                System.out.println("2. Libro B $12.00 por Unidad");
                System.out.println("3. Libro C $18.00 por Unidad");
                System.out.println("-------------------------");
                
                break;

                case 5: opMenu = "5. Opcion Salir";

                    //Validacion de compra (1 producto)
                    if (vald1 == true ) {
                        pagoTotal = opLibrosA;
                    }else if (vald2 == true ) {
                        pagoTotal = opLibrosB;
                    }else if (vald3 == true ) {
                        pagoTotal = opLibrosC;
                    }

                    //Validacion de compra (2 producto)
                    if (vald1 == true && vald2 == true ) {
                        pagoTotal = opLibrosA + opLibrosB;
                    }else if (vald1 == true && vald3 ) {
                        pagoTotal = opLibrosA + opLibrosC;
                    }else if (vald2 == true && vald3 == true ) {
                        pagoTotal = opLibrosB + opLibrosC;
                    }

                    //Validacion de compra (3 producto)
                    if (vald1 == true && vald2 == true && vald3 == true) {
                        pagoTotal = opLibrosA + opLibrosB + opLibrosC;
                    }

                    i = 5;
                break;

                default: continue;
            
            }
        }
        System.out.println("-----------------------");
        System.out.println(" * Factura de Compra * ");
        System.out.println("-----------------------");
        
        if (pagoTotal < 0) {
            System.out.println("El total a pagar es: $" + " " + pagoTotal + " Dolares");
            System.out.println("Vuelva pronto");
        }else if (pagoTotal > 0) {
            System.out.println("El total a pagar es: $" + " " + pagoTotal + " Dolares");
            System.out.println("Gracias por su compra");
        }

    }
}
