import java.util.Scanner;

public class VectorSueldos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double sueldo = 0.0, sueldoTotal, aumento = 0.0;
		double totalAumento = 0.0;

		double vSueldos [] = new double[5];
		double vNewSueldos [] = new double[5];

		//Llenadp el vector principal (Salario)
		for (int i = 0; i < vSueldos.length ; i++ ) {
			System.out.println("Ingrese el sueldo del empleado");
			sueldo = sc.nextDouble();

			vSueldos[i] = sueldo;
		}

		//Llenado el vector secundario (Salario + aumento)
		for (int i = 0; i < vNewSueldos.length ; i++ ) {
			
			sueldo = vSueldos[i];

			aumento = sueldo * 0.20;
			sueldoTotal = sueldo + aumento;
			vNewSueldos[i] = sueldoTotal;

			//Aumento de la planilla
			totalAumento += aumento;
		}

		
		//Recorrer Vector Principal
		System.out.println("------------------------------");
		System.out.println(" * Vector Principal Salario * ");
		System.out.println("-------------------------------");
		for (int i = 0; i < vSueldos.length ; i++ ) {
			System.out.println("Indice del Array: " + i);
			System.out.println("Salario del Empleado: $ " + vSueldos[i]);
			System.out.println("---------------------------------------");
		}


		//Recorrer Vector Secundario
		System.out.println("-----------------------------------------");
		System.out.println(" * Vector Secundario Salario + Aumento * ");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < vNewSueldos.length ; i++ ) {
			System.out.println("Indice del Array: " + i);
			System.out.println("Salario del Empleado: $ " + vNewSueldos[i]);
			System.out.println("---------------------------------------");
		}


		//Impresion del aumento total de la planilla
		System.out.println("Incremento total de la planilla es: " + totalAumento);
	}
}