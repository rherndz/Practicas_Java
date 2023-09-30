import java.util.Scanner;
import java.util.Arrays;

public class MatrizOrden {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrizA = {
            {17, -3, 12, 18, -6, 25, 1},
            {0, 11, 82, 97, 0, 67, 55},
            {12, 17, 99, 15, 2, 23, 2},
            {8, 23, -2, -7, 44, 90, 1},
            {23, 1, 0, 3, 67, 17, -1},
            {13, -5, 2, 13, -9, 83, 89},
            {7, 0, 39, 22, 45, 53, 32}
        };

        // Imprimir la matriz original para visualizar el contenido
        System.out.println("Matriz Original: ");
        for (int fila = 0; fila < matrizA.length; fila++) {
            for (int columna = 0; columna < matrizA[fila].length; columna++) {
                System.out.print(matrizA[fila][columna] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        
        //Evaluar el numero mayor de cada columna
        int[] mayorColumna = new int[matrizA[0].length];

        for (int columna = 0; columna < matrizA[0].length; columna++) {
            int maximo = matrizA[0][columna];
            for (int fila = 1; fila < matrizA.length; fila++) {
                if (matrizA[fila][columna] > maximo) {
                    maximo = matrizA[fila][columna];
                }else{
                    mayorColumna[columna] = maximo;
                }
            }        
        }

        //Imprimir los numeros mayores de cada columana
        System.out.println("---------------------------------");
        System.out.println("El numero mayor de la columna es: ");
        for (int columna = 0; columna < mayorColumna.length; columna++) {
            System.out.println("Columna " + columna + ": " + mayorColumna[columna]);
        }

        //MatrizB Ordenada
        for (int columna = 0; columna < matrizA[0].length; columna++) {
            int[] columnaArray = new int[matrizA.length];
            for (int fila = 0; fila < matrizA.length; fila++) {
                columnaArray[fila] = matrizA[fila][columna];
            }
            Arrays.sort(columnaArray);
            for (int fila = 0; fila < matrizA.length; fila++) {
                matrizA[fila][columna] = columnaArray[fila];
            }
        }

        // Imprimir la matriz ordenada
        System.out.println("---------------------------------");
        System.out.println("Matriz Ordenada: ");
        for (int f = 0; f < matrizA.length; f++) {
            for (int c = 0; c < matrizA[f].length; c++) {
                System.out.print(matrizA[f][c] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
