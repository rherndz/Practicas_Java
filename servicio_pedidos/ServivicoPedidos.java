import java.util.Scanner;

public class ServivicoPedidos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String opMenu;
        boolean pdPizza = false, pdHambg = false, pdEnsald = false;
        int option = 0, cantPedido = 0;
        double ctPizza = 0, ctHambg = 0, ctEnsald = 0, ctFinal = 0.00, ctTotal = 0.00;
        
        for (int cont = 0; cont < 5;) {
            System.out.println("-----------------");
            System.out.println(" Menu de Pedidos ");
            System.out.println("-----------------");
            
            System.out.println("1. Pizza ");
            System.out.println("2. Hamburguesa ");
            System.out.println("3. Ensalada ");
            System.out.println("4. Detalles del Menu ");
            System.out.println("5. Salir ");
            
            System.out.println("Selecciona una Opcion");
            option = sc.nextInt();
            
            if (option <= 0 | option > 5) {
                System.out.println("----------------------------------------");
                System.out.println(" ** La Opcion Ingresada es Invalidad ** ");
                System.out.println("----------------------------------------");
            }
            
            switch(option){
                case 1: opMenu = "1. Option Pizza";
                    System.out.println("-----------------------------");
                    System.out.println("Ingrese la cantidad de Pizzas");
                    cantPedido = sc.nextInt();
                    
                    if (cantPedido > 0) {
                        ctPizza = cantPedido * 10.00;
                        pdPizza = true;
                        System.out.println("El costo de lo Ordenado es: $" + " " + ctPizza );
                    }else if(cantPedido <= 0 ){
                        System.out.println("------------------------------------");
                        System.out.println(" ** Debe pedir al menos 1 unidad ** ");
                        System.out.println("------------------------------------");
                    }
                    
                break;
                
                case 2: opMenu = "2. Option Hamburguesas";
                    System.out.println("-----------------------------------");
                    System.out.println("Ingrese la cantidad de Hamburguesas");
                    cantPedido = sc.nextInt();
                    
                    if (cantPedido > 0) {
                        ctHambg = cantPedido * 5.00;
                        pdHambg = true;
                        System.out.println("El costo de lo Ordenado es: $" + " " + ctHambg );
                    }else if (cantPedido <= 0) {
                        System.out.println("------------------------------------");
                        System.out.println(" ** Debe pedir al menos 1 unidad ** ");
                        System.out.println("------------------------------------");
                    }
                    
                break;
                
                case 3: opMenu = "3. Option Ensalada";
                    System.out.println("--------------------------------");
                    System.out.println("Ingrese la cantidad de Ensaladas");
                    cantPedido = sc.nextInt();
                    
                    if (cantPedido > 0) {
                        ctEnsald = cantPedido * 7.00;
                        pdEnsald = true;
                        System.out.println("El costo de lo Ordenado es: $" + " " + ctEnsald );
                    }else if (cantPedido <= 0) {
                        System.out.println("------------------------------------");
                        System.out.println(" ** Debe pedir al menos 1 unidad ** ");
                        System.out.println("------------------------------------");
                    }
                    
                break;
                
                case 4: opMenu = "4. Detalles menu";
                
                    System.out.println("-------------------");
                    System.out.println(" * Menu Detalles * ");
                    System.out.println("-------------------");
                    
                    System.out.println("----------------------------------");
                    System.out.println(" - Pizza / $10.00 por Unidad ");
                    System.out.println(" - Hamburguesa / $5.00 por Unidad ");
                    System.out.println(" - Ensalada / $7.00 por Unidad ");
                    System.out.println("----------------------------------");
                break;
                
                case 5: opMenu = "5. Salir";
                    
                    //Validacion si es un Opcion
                    if (pdPizza == true) {
                        ctFinal = ctPizza;
                    }else if (pdHambg == true) {
                        ctFinal = ctHambg;
                    }else if (pdEnsald == true){
                        ctFinal = ctEnsald;
                    }
                    
                    //Validacion si es 3 o menos Opciones
                    if(pdPizza && pdHambg && pdEnsald){
                        ctFinal = ctPizza + ctHambg + ctEnsald; //Validacion de las 3 Opciones
                    }else  if (pdPizza && pdHambg == true) {
                        ctFinal = ctPizza + ctHambg; //Validacion de la Opcion Pizza y Hamburguesa
                    }else if (pdPizza && pdEnsald) {
                        ctFinal = ctPizza + ctEnsald; //Validacion de la Opcion Pizza y Ensalada
                    }else if (pdHambg && pdEnsald == true) {
                        ctFinal = ctHambg + ctEnsald; //Validacion de la Opcion Hamburguesa y Ensalada
                    }
                    cont = 5;
                break;
                
                default: continue;
            }
            
            
        }

        System.out.println("------------------------");
        System.out.println(" * Factura del Pedido * ");
        System.out.println("------------------------");
        
        if (ctFinal > 0) {
            System.out.println("El Total del Pedido es: $" + " " + ctFinal);
        }else if(ctFinal < 0 ){
            ctFinal = ctTotal;
            System.out.println("El Total del Pedido es: $" + " " + ctFinal);
        }
    }

   
}
