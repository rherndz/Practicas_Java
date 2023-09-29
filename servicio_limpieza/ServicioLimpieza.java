import java.util.Scanner;

public class ServicioLimpieza {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String optMenu;
        boolean validationC = false, validationOf = false;
        double costoCasa = 0.0, costoOficina = 0.0, casaTarifa = 50.00 ,oficinaTarifa = 75.00, totalPagar = 0.00;
        int option = 0, horasTotal;

    	for( int cont = 0; cont < 2;){
 
            System.out.println("------------------");
            System.out.println("*Menu de Limpieza*");
            System.out.println("------------------");
            System.out.println("1. Limpieza de Casa ");
            System.out.println("2. Limpieza de Oficina");
            System.out.println("3. Detalles de tarifa");
            System.out.println("4. salir");

            System.out.print("Seleccione una Opcion: ");
            option = sc.nextInt();
                
            if (option <= 0 || option > 4) {
                System.out.println(" ** Seleccion Invalida ** ");
            }
                
            switch(option){

    		  case 1: optMenu = "Limpieza Casa";
                    System.out.print("Ingrese las horas de Servicio: ");
                    horasTotal = sc.nextInt();

                    if (horasTotal > 0) {
                        costoCasa = casaTarifa * horasTotal;
                        validationC = true;
                        System.out.println("Horas de servicio: " + " " + horasTotal);
                        System.out.println("El costo del Servicio es: $" + " " + costoCasa);
                        break;
                    }else if (horasTotal <= 0) {
                        System.out.println("-----------------------------------------");
                        System.out.println("Debe ingresar al menos 1 hora de servicio");
                        System.out.println("-----------------------------------------");
                    }
                break;

    		  case 2: optMenu = "Limpieza Oficina";
                    System.out.print("Ingrese las horas de Servicio:");
                    horasTotal = sc.nextInt();

                    if (horasTotal > 0) {
                        costoOficina = oficinaTarifa * horasTotal;
                        validationOf = true;
                        System.out.println("Horas de servicio: " + " " + horasTotal);
                        System.out.println("El costo del Servicio es: $" + " " + costoOficina);
                            
                    }else if (horasTotal <= 0) {
                        System.out.println("-----------------------------------------");
                        System.out.println("Debe ingresar al menos 1 hora de servicio");
                        System.out.println("-----------------------------------------");
                    }
                break;

    		  case 3: optMenu = "Detalles Tarifa";
                    System.out.println("------------------");
                    System.out.println("*Detalles de las Tarifas*");
                    System.out.println("------------------");
                    System.out.println("Tarifa de Casa $50.00 por Hora");
                    System.out.println("Tarifa de Oficina $75.00 por Hora");
                break;
                    
    		  case 4: optMenu = "Salir";

                    if (validationC && validationOf == true) {
                        totalPagar = costoCasa + costoOficina;
                    }else if (validationC == true) {
                        totalPagar = costoCasa;
                    }else if (validationOf == true) {
                        totalPagar = costoOficina;
                    }else if (validationC && validationOf == false) {
                        totalPagar = 0.00 ;
                    }
                 
                    cont = 3;
                break;
                    
                default: continue;
            }
    	}

        System.out.println("--------------------------");
        System.out.println("*Factura de los Servicios*");
        System.out.println("--------------------------");
            
        if(totalPagar > 0){
            System.out.println("Total a Pagar: $" + " " + totalPagar);
            System.out.println("Gracias por utilizar nuestros servicios");
        }else if(totalPagar < 0){
            totalPagar = 0.00;

            System.out.println("Total a Pagar: $" + " " + totalPagar);
            System.out.println("Nuestros servicios estan a tu disposicion");
        }
    }
    
}
