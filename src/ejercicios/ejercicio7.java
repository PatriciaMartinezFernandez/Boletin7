package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {

		String[] numerosFavoritos = { "3", "7", "10", "18", "20", "22", "43", "56", "66", "78" };
		String numero;
		boolean entrada = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("Estos son mis números favoritos: ");

		for (int i = 0; i < numerosFavoritos.length; i++) {

			System.out.print(numerosFavoritos[i] + " ");
		}

		while (entrada != false) {

			System.out.println("\n");

			System.out.println("¿Qué número quieres quitar?");
			numero = sc.next();

			for (int i = 0; i < numerosFavoritos.length; i++) {

				if (numero.equals("0")) {
					entrada = false;
				}

				else if (numerosFavoritos[i].equals(numero)) {

					numerosFavoritos[i] = "X";

				}

				System.out.print(numerosFavoritos[i] + " ");

				if (numerosFavoritos[0] == "X" && numerosFavoritos[1] == "X" && numerosFavoritos[2] == "X"
						&& numerosFavoritos[3] == "X" && numerosFavoritos[4] == "X" && numerosFavoritos[5] == "X"
						&& numerosFavoritos[6] == "X" && numerosFavoritos[7] == "X" && numerosFavoritos[8] == "X"
						&& numerosFavoritos[9] == "X") {
					
					entrada = false;
					System.out.println("\n");

				}

			}
		}
		sc.close();

	}

}
