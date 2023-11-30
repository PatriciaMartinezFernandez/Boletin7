package ejercicios;

import java.util.Scanner;

/**
 * Introducir por teclado un número n; a continuación solicitar al usuario que
 * teclee n números. Realizar la media de los números positivos, la media de los
 * negativos y contar el número de ceros introducidos.
 **/

public class ejercicio5 {

	public static void main(String[] args) {

		int longitud, cuentaCero = 0;
		double numero, totalPositivo = 0, totalNegativo = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		longitud = sc.nextInt();

		int[] cadena = new int[longitud];

		for (int i = 0; i < cadena.length; i++) {
			System.out.println("Escribe números (" + longitud + "):");
			numero = sc.nextInt();
			
			if (numero > 0) {
				totalPositivo += numero;
			}
			
			else if (numero < 0) {
				totalNegativo += numero;
			}
			
			else 
				cuentaCero++;

		}
		
		//medias 	
		double mediaPositiva = totalPositivo / longitud, mediaNegativa = totalNegativo / longitud;

		System.out.println("Media positiva: " + mediaPositiva);
		System.out.println("Media negativa: " + mediaNegativa);
		System.out.println("Contador ceros: " + cuentaCero);

		sc.close();

	}

}
