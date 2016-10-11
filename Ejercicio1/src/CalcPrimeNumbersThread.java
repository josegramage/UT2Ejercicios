import java.util.Scanner;

public class CalcPrimeNumbersThread extends Thread {
	// COMPLETAR AQUÍ EL EJERCICIO

	PrimeNumbers pn = new PrimeNumbers();

	public void run() {

		System.out.println("Inserte dos números separados por un guión -");
		Scanner entrada = new Scanner(System.in);

		String numString = entrada.next();

	// no he conseguido hacer que funcione dejando un espacio en blanco
		String[] nums = numString.split("-");

		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);

		System.out.print(pn.primesInRange(num1, num2));

	}
}
