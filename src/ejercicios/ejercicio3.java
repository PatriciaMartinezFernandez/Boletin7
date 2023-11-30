package ejercicios;

import java.util.Scanner;

/**
 * Escribir una aplicación que solicite al usuario cuántos números desea
 * introducir. A continuación, se introducirá por teclado esa cantidad de
 * números enteros, y por último, los mostrará en el orden inverso al
 * introducido
 **/

public class ejercicio3 {

	public static void main(String[] args) {

		int longitud, num;

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números deseas introducir?");
		longitud = sc.nextInt();
		
		int[] numeros = new int[longitud];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Escribe un número: ");
			num = sc.nextInt();
			numeros[i] = num;
		}
		
		for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

		sc.close();

	}

}
