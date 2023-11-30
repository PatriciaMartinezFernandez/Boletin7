package ejercicios;

import java.util.Scanner;

/*
 *  Leer y almacenar n números enteros en una tabla, a partir de la que se construiran otras
 *  dos tablas con los elementos con valores pares e impares de la primera, respectivamente.
 *  
 * */

public class ejercicio10 {
	public static void main(String[] args) {

		int longitud, numero;
		int iPar = 0, iImpar = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Longitud: ");
		longitud = sc.nextInt();

		int[] numerosPar = new int[longitud];
		int[] numerosImpar = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			System.out.println("Escribe números (" + (i + 1) + "/" + longitud + "):");
			numero = sc.nextInt();

			if (numero % 2 == 0) {
				numerosPar[iPar] = numero;
				iPar++;

			} else {
				numerosImpar[iImpar] = numero;
				iImpar++;
			}
		}

		System.out.print("Numero pares: ");
		for (int i = 0; i <= iPar - 1; i++) {
			System.out.print(numerosPar[i] + " ");

		}

		System.out.print("\nNumeros impares: ");
		for (int i = 0; i <= iImpar - 1; i++) {
			System.out.print(numerosImpar[i] + " ");

		}

		sc.close();

	}

}