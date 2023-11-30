package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		float[] numeros = new float[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce un número:");
			numeros[i] = sc.nextFloat();

		}
		for (int j = 0; j < numeros.length; j++) {

			System.out.println(numeros[j]);
		}

		sc.close();

	}

}
