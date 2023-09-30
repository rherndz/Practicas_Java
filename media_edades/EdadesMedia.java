import java.util.Scanner;

public class EdadesMedia{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int cantEdades = 0, contador = 0, temp = 0;
		double media = 0;

		System.out.println("Ingrese la cantidad de edades a almacenar");
		cantEdades = sc.nextInt();

		int arrayEd[] = new int[cantEdades];

		int arrayOrd[] = new int[cantEdades];
		

		//Almacenamiento del Array
		for (int i = 0 ; i < arrayEd.length; i++ ) {
			System.out.println("Ingrese la edad que quiere almacenar: " + " # " + i);
			arrayEd[i] = sc.nextInt();

			contador += arrayEd[i];
			media = contador / cantEdades;
		}

		//Imprimir el Array Original
		System.out.println("-----------------------------");
		System.out.println("Resultados del Array Original");
		System.out.println("-----------------------------");
		for (int i = 0; i < arrayEd.length; i++ ) {
			System.out.println("Posicion del Array: " + " " + i);
			System.out.println("La edad almacenada es: " + " " + arrayEd[i]);
			System.out.println("----------------------------");

			arrayOrd[i] += arrayEd[i];
		}

		System.out.println("-----------------------------");
		System.out.println("La Media del Array");
		System.out.println("-----------------------------");
		System.out.println("La media de las edades es: " + " " + media);
		System.out.println("-----------------------------");

		//Ordenar de Mayor a Menor (inicio indice 0)
		for (int i = 0; i < arrayOrd.length; i++) {
    		for (int ord = 0; ord < arrayOrd.length - i - 1; ord++) {
        		if (arrayOrd[ord] > arrayOrd[ord + 1]) { // Cambio el operador de < a >
            		temp = arrayOrd[ord];
            		arrayOrd[ord] = arrayOrd[ord + 1];
            		arrayOrd[ord + 1] = temp;
        		}
    		}
		}

		//Imprimir el Array Ordenado
		System.out.println("-----------------------------");
		System.out.println("Resultados del Array Ordenado");
		System.out.println("-----------------------------");
		for (int i = 0; i < arrayOrd.length; i++ ) {
			System.out.println("Posicion del Array: " + " " + i);
			System.out.println("La edad almacenada es: " + " " + arrayOrd[i]);
			System.out.println("----------------------------");
		}
	}
}