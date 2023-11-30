package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void compruebaClave (String claveIntento, int[] clave, boolean acertado) {
		
		int[] intento = new int[clave.length];
		
		for (int i = 0; i < intento.length; i++) {
			
			if (claveIntento.charAt(i) == clave[i]) {
				
				for (int j = 0; j < clave.length; j++) {
					
					if (i == j) {
						System.out.println(i + " son iguales");
					}
				}
			}
			
		}
	
		
		
		
		//return acertado;
		
	}
	
	public static void main(String[] args) {

		int longitud, contador = 1;
		String claveIntento;
		boolean acertado = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("=====================");
		System.out.println("= LA CÁMARA SECRETA =");
		System.out.println("=====================\n");
		System.out.println("¿Cuál es la longitud de la clave?");
		System.out.print("\033[31mADVERTENCIA: ");
		System.out.println("\u001B[0mLa longitud incrementará la dificultad del juego.\n");
		longitud = sc.nextInt();

		int[] clave = new int[longitud];

		for (int i = 0; i < clave.length; i++) {
			clave[i] = (int) (Math.random() * 5);
		}

		System.out.println("\nEmpezamos!\n");
		
		while (acertado == false) {
		
		System.out.println("Intento " + contador + "º\n");
		
		System.out.print("Inserta clave para abrir: ");
		claveIntento = sc.nextLine();
		
		compruebaClave(claveIntento, clave, acertado);
		
		contador++;
		
		}
		/*for (int i = 0; i < clave.length; i++) {
			System.out.print(clave[i]);
		}*/
		sc.close();

	}

}
