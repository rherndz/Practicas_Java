import java.util.Scanner;

public class MatrizAbajo{
	
	public static void main (String args []){
			
		Scanner leer = new Scanner(System.in);
		int n;
			
		System.out.print(" \nIngrese la dimension de la matriz: ");
		n = leer.nextInt();
		
		//crear una matriz n por n
		char [][] matriz = new char [n][n];
		
		for(int i=0; i<n; i++) {
            
            for(int j=0; j<i; j++){
				matriz[i][j] = '*';
			}
            for(int j=i; j<n; j++){
				matriz[i][j] = ' ';
			}
                
      }

      	System.out.println("Matriz generada:");
         System.out.println("\n");
         for (int i = 0; i < n; i++) {
			for (int j = 0;j < n; j++) {
            System.out.print(matriz[i][j]+" ");
			}
            System.out.println(""); 
         }
	}
}