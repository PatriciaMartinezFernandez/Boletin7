package ejercicios;

public class ejercicio8 {

	public static void main(String[] args) {

		char[] vocalesAleatorias = new char[20];
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		int Random, contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

		for (int i = 0; i < vocalesAleatorias.length; i++) {
			Random = (int) (Math.random() * 5);
			vocalesAleatorias[i] = vocales[Random];

		}

		for (int i = 0; i < vocalesAleatorias.length; i++) {

			System.out.print(vocalesAleatorias[i] + " ");

		}

		for (int i = 0; i < vocalesAleatorias.length; i++) {

			if (vocalesAleatorias[i] == 'a')
				contadorA++;

			else if (vocalesAleatorias[i] == 'e')
				contadorE++;

			else if (vocalesAleatorias[i] == 'i')
				contadorI++;

			else if (vocalesAleatorias[i] == 'o')
				contadorO++;

			else
				contadorU++;

		}

		System.out.println("\n");
		System.out.println("Total de A: " + contadorA);
		System.out.println("Total de E: " + contadorE);
		System.out.println("Total de I: " + contadorI);
		System.out.println("Total de O: " + contadorO);
		System.out.println("Total de U: " + contadorU);

	}

}
