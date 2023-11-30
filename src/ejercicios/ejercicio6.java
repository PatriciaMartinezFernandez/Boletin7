package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {

		int numero;
		int[] cadena = new int[5];
		int[] cadenax2 = new int[5];
		int[] cadenaTotal = new int[10];

		Scanner sc = new Scanner(System.in);

		// Primer array con los 5 primeros números
		for (int i = 0; i < cadena.length; i++) {

			System.out.println("Introduce 5 números: ");
			numero = sc.nextInt();

			cadena[i] = numero;

		}

		// Printea el primer array
		for (int i = 0; i < cadena.length; i++) {

			System.out.print(cadena[i] + " ");

			sc.close();
		}

		// Segundo array que multiplica al primero por dos

		for (int i = 0; i < cadenax2.length; i++) {

			cadenax2[i] = cadena[i] * 2;

		}

		System.out.println("\n");

		// Printea el segundo array
		for (int i = 0; i < cadenax2.length; i++) {

			System.out.print(cadenax2[i] + " ");

			sc.close();
		}

		// Tercer array
		// Meteme el primer y segundo array dentro del tercero
		for (int i = 0; i < cadenaTotal.length; i++) {

			if (i < cadena.length) {

				cadenaTotal[i] = cadena[i];
			}

			else
				cadenaTotal[i] = cadenax2[i-cadena.length];
		}
		
		
		//los ordena de menor a mayor
		Arrays.sort(cadenaTotal);
		
		System.out.println("\n");

		// Printea el tercer array
		for (int i = 0; i < cadenaTotal.length; i++) {

			System.out.print(cadenaTotal[i] + " ");

			sc.close();
		}
	}

}
