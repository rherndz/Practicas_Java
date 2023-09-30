import java.util.Scanner;

public class MatrizAux {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[][] matriz = {
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
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        int conversor = -1;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizAux = new int[filas][columnas];

        
        //Evaluar elementos que son negativos o Postivos
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] < 0) {
                    matrizAux[fila][columna] = matriz[fila][columna] * conversor ;
                } else if (matriz[fila][columna] > 0) {
                    matrizAux[fila][columna] = matriz[fila][columna] * conversor ;
                }else {
                    matrizAux[fila][columna] = matriz[fila][columna];
                }
            }
        }

        //Evaluar elementos que son cero (Dentro de la nueva Matriz)
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matrizAux[fila][columna] == 0) {
                    matrizAux[fila][columna] = 100;
                } 
            }
        }

        // Imprimir la matriz auxiliar
        System.out.println("Matriz Auxiliar: ");
        for (int f = 0; f < matrizAux.length; f++) {
            for (int c = 0; c < matrizAux[f].length; c++) {
                System.out.print(matrizAux[f][c] + "\t");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

    }
}
