import java.util.ArrayList;

// Queremos calcular los números primos entre 2 números y imprimirlos por pantalla.
//
//  lee de la entrada estándar 2 números separados por espacio en la primera linea. (Ej: "1 100")
//  lee de la segunda linea de la entrada estándar el número de threads en los que se tiene que dividir el trabajo.
//  Cada thread debe encargarse de realizar una parte equivativa del cálculo
//
//    thread 1 [1..50]
//    thread 2 [51..100]
//
//Cada thread debe imprimir por pantalla su id, seguido de la lista de primos en su rango.
//Los ids serán asignados en orden incremental por el thread principal de 1 a N.
//Cada thread siempre tiene que esperar a que finalice el thread anterior antes de imprimir!
//Utiliza el método de implementar Runnable.
//El thread principal debe esperar a la finalización del thread con mayor id (el último).

public class PrimeNumbersInRange {
	// Ayuda: utiliza esta lista para guardarte la referencia a los threads que crees
	private ArrayList<Thread> threads; 

	public static void main(String[] args) {
		// COMPLETA AQUÍ EL EJERCICIO

	}

}
