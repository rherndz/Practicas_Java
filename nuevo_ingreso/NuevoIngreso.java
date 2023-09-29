import java.util.Scanner;

public class NuevoIngreso{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int cantEstd = 0,  carnet ;
		String nombEstud, carrera;
		double notaTec = 0, notaMat = 0, notaInf = 0, notaTotal = 0, notaMedia = 0;

		//Asignacion del tamaño de los vectores
		System.out.println("Ingrese la cantidad de Estudiantes Nuevos");
		cantEstd = sc.nextInt();

		//Crecion de Vectores
		String vCarrera [] = new String[cantEstd];

		String vNombEstud [] = new String[cantEstd];

		//Ingreso de datos al Vector
		for (int i = 0; i < cantEstd; i++ ) {

			System.out.println("---------------------------------------");
			System.out.println("-* Datos del Estudiante *-" + " #: " + i);
			System.out.println("---------------------------------------");
			sc.nextLine();

			System.out.println("El ingrese el nombre del Alumno");
			nombEstud = sc.nextLine();

			System.out.println("Ingrese la carrera");
			carrera = sc.nextLine();

			System.out.println("Ingrese el Carnet del Estudiante");
			carnet = sc.nextInt();

			System.out.println("---------------------------------------");
			System.out.println("-* Notas del Estudiante *-");
			System.out.println("---------------------------------------");

			System.out.println("Ingrese la nota de: Tecnica de Estudios");
			notaMat = sc.nextDouble();

			System.out.println("---------------------------------------");
			System.out.println("Ingrese la nota de: Matematicas");
			notaTec = sc.nextDouble();

			System.out.println("---------------------------------------");
			System.out.println("Ingrese la nota de: Informatica");
			notaInf = sc.nextDouble();

			notaTotal = notaTec + notaMat + notaInf;

			notaMedia = notaTotal / 3;

			//Evaluacion la condicion para llenar el Vector
			if(notaMedia >= 6 ) {
				vCarrera[i] = carrera;
				vNombEstud[i] = nombEstud;
			}	
		}

			//Recorrer los Vectores de Carrera y Nombres
			for (int cVector = 0 ; cVector < vCarrera.length && cVector< vNombEstud.length; cVector++ ) {
				System.out.println("-----------------------------");
				System.out.println("----* RESULTADOS *----");
				System.out.println("-----------------------------");
				System.out.println("Posicion del Vector: " + " " + cVector);
				System.out.println("Nombre del Estudiante: " + " " + vNombEstud[cVector]);
				System.out.println("Carrera que cursa el Estudiante: " + " " + vCarrera[cVector]);
			}

	}
}