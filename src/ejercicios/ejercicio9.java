package ejercicios;

public class ejercicio9 {

	public static void main(String[] args) {

		String[] nombreEmpleados = { "Sofía Martínez", "Alejandro Pérez", "Valentina Rodríguez", "Sebastián González",
				"Isabella Ramírez", "Matías Herrera", "Camila López", "Nicolás Díaz", "Luciana Torres",
				"Juan Cruz Silva", "Renata Vargas", "Leonardo Castro", "Victoria Fernández", "Daniel Morales",
				"Antonella Gómez", "Lucas Navarro", "Martina Acosta", "Facundo Ríos", "Catalina Ruiz", "Bruno Sánchez",
				"Julieta Medina", "Emilio Mendoza", "Marta Molina", "Ignacio Bravo", "Jazmín Cordero", "Manuel Flores",
				"Paula León", "Tomás Ortega", "Agustina Núñez", "Raúl Jiménez" };

		int[] horasTrabajadas = { 45, 32, 55, 28, 50, 23, 41, 36, 58, 26, 49, 30, 52, 22, 44, 37, 57, 24, 53, 34, 40,
				59, 25, 48, 31, 56, 27, 46, 38, 21 };

		final int PRECIO_HORA = 20;

		int sueldo = horasTrabajadas[0] * PRECIO_HORA;

		int mayorSueldo = sueldo;
		int menorSueldo = sueldo;

		for (int i = 0; i < nombreEmpleados.length; i++) {
			
			sueldo = horasTrabajadas[i] * PRECIO_HORA;

			System.out.println(nombreEmpleados[i] + ": " + sueldo + "€");

			if (sueldo > mayorSueldo) {
				mayorSueldo = sueldo;
			}

			if (sueldo < menorSueldo) {
				menorSueldo = sueldo;
			}
		}

		System.out.println("La persona con el mayor sueldo cobra: " + mayorSueldo + "€");
		System.out.println("La persona con el menor sueldo cobra: " + menorSueldo + "€");
	}
}
