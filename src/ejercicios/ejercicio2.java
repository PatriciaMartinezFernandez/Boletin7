package ejercicios;

public class ejercicio2 {

    public static boolean esPrimo(int n) {
        boolean esprimo = true;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esprimo = false;
                break;
            }
        }
        
        return esprimo;
    }
    
    public static void main(String[] args) {
        int contador = 0; // para saber donde guardar el numero
        int numerosPrimos[] = new int[26]; // hay solo 26 numeros primos entre 1 y 100
        
        // hago un for de 1 a 100
        for (int i = 1; i <=100; i++) {
            // si i es primo
            if (esPrimo(i)) {
                // Guardo i en el sitio q diga el contador
                // contador empieza en 0 y va aumentando cada vez
                // q metes un primo
                numerosPrimos[contador] = i;
                contador++;
            }
        }
        
        // ahora imprimo el array
        for (int i = 0; i < numerosPrimos.length; i++) {
            System.out.print(numerosPrimos[i] + " ");
        }
    }
}
