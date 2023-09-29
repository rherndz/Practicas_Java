
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String usersp = "usuario1";
        String password = "1234";
        boolean menu = false;
        int num, opcion, NumFactorial = 1, contf = 1 , count = 0, countMenu = 0;

        do{
            count = count + 1;

            System.out.println("Digite el Usuario");
            usersp = sc.nextLine();
           
            System.out.println("Digite el Password");
            password = sc.nextLine();

            if (usersp.equals("usuario1") & password.equals("1234") ) {
                System.out.println(" Bienvenido Usuario, Sesion Correcta "); 
                menu = true;
                break;
            }else{
                System.out.println(" Credenciales Incorrectas");
            }   

        }while(count < 2 && !menu);

        if (menu) {
            System.out.println("---------------------");
            System.out.println(" * Menu de Usuario * ");
            System.out.println("---------------------");
            System.out.println("1. Factorial de un Numero");
            System.out.println("2. Determinar si un numero es Primo");
            System.out.println("3. Salir del Programa");

            System.out.println("Seleccione un Opcion");
            opcion = sc.nextInt();

           do {
            countMenu = countMenu + 1;

            if (opcion == 1) {
                System.out.println("Opcion 1");

                System.out.println("Ingrese un numero");
                num = sc.nextInt();

                if (num >= 0 ) {

                    while( contf <= num){
                        NumFactorial *= contf;
                        contf++;
                    }
                    System.out.println("El numero ingresado es factorial" + " " + NumFactorial);
                }else {
                    System.out.println("El numero ingresado no es factorial" + " " + NumFactorial);
                    break;
                }
                
                break;
            }else if (opcion == 2) {
                System.out.println("Opcion 2");

                System.out.println("Ingrese un numero");
                num = sc.nextInt();
                if ( num % 2 == 0) {
                        System.out.println("El numero ingresado es primo");
                        break;
                }else {
                    System.out.println("El numero ingresado no es primo");
                    break;
                }

            }else if (opcion == 3) {
                System.out.println("Saliendo del Programa");
                break;
            }

           }while(countMenu < 2);
        }
        
    }    
}