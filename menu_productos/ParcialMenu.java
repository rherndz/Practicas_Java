import java.util.Scanner;

public class ParcialMenu {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String [] aProducto  = {"lapto", "mouse", "teclado", "monitor", "impresora"};

        double [] aPrecio = {500.0,10.0,15.0,100.0,80.0};

        String menu;
        int seleccion, cantP; 
        boolean vld1 = false, vld2 = false,  vld3 = false, vld4 = false, vld5 = false ;
        double compra1 = 0.0, compra2 = 0.0, compra3 = 0.0, compra4 = 0.0, compra5 = 0.0;
        double  pagoOp = 0.00 , pagoTotal = 0.00, descuentoAplicar = 0.15, descuentoOp = 0.00;
        
        for(int i = 0; i < 6;){
            System.out.println("--------------------");
            System.out.println(" * Menu Productos * ");
            System.out.println("--------------------");
            System.out.println("1. Lapto - $500.0");
            System.out.println("2. Mouse - $10.0");
            System.out.println("3. Teclado - $15.0");
            System.out.println("4. Monitor - $100.0");
            System.out.println("5. Impresora - $80.0");
            System.out.println("6. Salir");
            
            
            System.out.println("Seleccione una opcion del Menu");
            seleccion = sc.nextInt();

            switch(seleccion){
            	case 1: menu ="lapto";
            		System.out.println("Seleccione la cantidad de producto");
            		cantP = sc.nextInt();

            		compra1 = cantP * aPrecio[0];
                    vld1 = true;
                    System.out.println("-----------------------------------");
                    System.out.println("El Producto seleccionado: " + aProducto[0]);
                    System.out.println("El Precio a pagar: $ " + compra1 + " Dolares ");
                    System.out.println("-----------------------------------");
            	break;

            	case 2: menu  = "Mouse";
            		System.out.println("Seleccione la cantidad de producto");
            		cantP = sc.nextInt();

            		compra2 = cantP * aPrecio[1];
                    vld2 = true;
                    System.out.println("-----------------------------------");
                    System.out.println("El Producto seleccionado: " + aProducto[1]);
                    System.out.println("El Precio a pagar: $ " + compra2 + " Dolares ");
                    System.out.println("-----------------------------------");
            	break;

            	case 3: menu  = "Teclado";
            		System.out.println("Seleccione la cantidad de producto");
            		cantP = sc.nextInt();
                        
            		compra3 = cantP * aPrecio[2];
                    vld3 = true;
                    System.out.println("-----------------------------------");
                    System.out.println("El Producto seleccionado: " + aProducto[2]);
                    System.out.println("El Precio a pagar: $ " + compra3 + " Dolares ");
                    System.out.println("-----------------------------------");
            	break;

            	case 4: menu  = "Monitor";
            		System.out.println("Seleccione la cantidad de producto");
            		cantP = sc.nextInt();

            		compra4 = cantP * aPrecio[3];
                    vld4 = true;
                    System.out.println("-----------------------------------");
                    System.out.println("El Producto seleccionado: " + aProducto[3]);
            		System.out.println("El Precio a pagar: $ " + compra4 + " Dolares ");
                    System.out.println("-----------------------------------");
            	break;

            	case 5: menu = "Impresora";
            		System.out.println("Seleccione la cantidad de producto");
            		cantP = sc.nextInt();

            		compra5 = cantP * aPrecio[4];
                    vld5 = true;
                    System.out.println("-----------------------------------");
                    System.out.println("El Producto seleccionado: " + aProducto[4]);
            		System.out.println("El Precio a pagar: $ " + compra5 + " Dolares ");
                    System.out.println("-----------------------------------");
            	break;

            	case 6: menu = "Salir";

                    //Validacion de compra (1 productor)
                    if (vld1 == true) {
                        pagoOp = compra1;
                    }else if (vld2 == true) {
                        pagoOp = compra2;
                    }else if (vld3 == true) {
                        pagoOp = compra3;
                    }else if (vld4 == true) {
                        pagoOp = compra4;
                    }else if (vld5 == true) {
                        pagoOp = compra5;
                    }

                    //Validacion de compra (2 producto)
                    if(vld1 == true && vld2 == true){
                        pagoOp = compra1 + compra2;

                    }else if(vld1 == true && vld3 == true){
                        pagoOp = compra1 + compra3;

                    }else if (vld1 == true && vld4 == true) {
                        pagoOp = compra1 + compra4;

                    }else if (vld1 == true && vld5 == true) {
                        pagoOp = compra1 + compra5;

                    }else if(vld2 == true && vld3 == true){
                        pagoOp = compra2 + compra3;

                    }else if(vld2 == true && vld4 == true){
                        pagoOp = compra2 + compra4;

                    }else if (vld2 == true && vld5 == true) {
                        pagoOp = compra2 + compra5;

                    }else if(vld3 == true && vld4 == true){
                        pagoOp = compra3 + compra4;

                    }else if(vld3 == true && vld5 == true){
                        pagoOp = compra3 + compra5;

                    }else if(vld4 == true && vld5 == true){
                        pagoOp = compra4 + compra5;
                    }

                    //validacion de compra (3 producto)
                    if (vld1 == true && vld2 == true && vld3 == true) {
                        pagoOp = compra1 + compra2 + compra3;

                    }else if (vld1 == true && vld4 == true && vld5 == true) {
                        pagoOp = compra1 + compra4 + compra5;

                    }else if (vld1 == true && vld3 == true && vld5 == true ) {
                        pagoOp = compra1 + compra3 + compra5;

                    }else if (vld1 == true && vld2 == true && vld5) {
                        pagoOp = compra1 + compra2 + compra5;

                    }else if (vld1 == true && vld2 == true && vld5 == true) {
                        pagoOp = compra1 + compra2 + compra4;

                    }else if (vld2 == true && vld3 == true && vld4 == true) {
                        pagoOp = compra2 + compra3 + compra4;

                    }else if (vld2 == true && vld4 == true && vld5 == true) {
                        pagoOp = compra2 + compra4 + compra5;

                    }else if (vld3 == true && vld4 == true && vld5 == true) {
                        pagoOp = compra3 + compra4 + compra5;
                    }

                    //validacion de compra (4 producto)
                    if (vld1 == true && vld2 == true && vld3 == true && vld4 == true) {
                        pagoOp = compra1 + compra2 + compra3 + compra4;

                    }else if (vld2 == true && vld3 == true && vld4 == true && vld5 == true) {
                        pagoOp = compra2 + compra3 + compra4 + compra5;
                    }

                    //validacion de compra (5 producto)
                    if (vld1 == true && vld2 == true && vld3 == true && vld4 == true && vld5 == true){
                        pagoOp = compra1 + compra2 + compra3 + compra4 + compra5;
                    }


                    //Validacion de Descuento ( Mayor de 500 )
                    if (pagoOp > 500 ) {
                        descuentoOp = pagoOp * descuentoAplicar;
                        pagoTotal = pagoOp - descuentoOp;
                        System.out.println("---------------------------------------");
                        System.out.println(" *Se le aplicara el descuento del 15%* ");
                        System.out.println("---------------------------------------"); 
                    }else{
                        pagoTotal = pagoOp;
                        System.out.println("-------------------------------");
                        System.out.println(" *No cumple para el descuento* ");
                        System.out.println("-------------------------------");
                    }

                    i = 6;
            	break;
            }
        }

        System.out.println("-----------------------");
        System.out.println(" * Factura de Compra * ");
        System.out.println("-----------------------");

        System.out.println("La suma de los Productos es: $" + pagoOp + " Dolares");   

        System.out.println("El descuento es de: " + descuentoOp + " Dolares");   

        System.out.println("El Total a pagar es de: $" + pagoTotal + " Dolares");    
    }
    
}
