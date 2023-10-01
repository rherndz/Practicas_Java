import java.util.Scanner;

public class MatrizArriba {

    public static void main(String[] args) {

         Scanner sc = new Scanner (System.in);
         int n ;
         
        //Solicitar la dimension de la matriz(N)
         System.out.println("Ingresa la dimension de la matriz");
         n = sc.nextInt();
       
        //crear una matriz n por n
        char [][] matriz = new char [n][n];

        for(int f=0; f<10; f++) {
            for (int c = 0; c < 10; c++)
                
                if ( c+f == n-10 || c+f == n-9 || c+f == n-8 || c+f == n-7 || c+f == n-6 ||
                     c+f == n-5 || c+f == n-4 || c+f == n-3 ||c+f == n-2 ||c+f == n-1) {
            
                    //Primera y ultima fila se llena con "*"
                    matriz[f][c] = '*';
                }
        }

        //impresion de la figura
        System.out.println("Matriz generada:");
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println(""); //salto para la siguiente linea
        }
        
    }
}