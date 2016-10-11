import java.util.Scanner;

public class CalcPrimeNumbersRunnable implements Runnable {
	private int from;
	private int to;

	

	public void CalcPrimeNumbersRunnable(int from, int to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public void run() {
		// COMPLETAR AQUÍ EL EJERCICIO
		PrimeNumbers pn = new PrimeNumbers();
		
		System.out.println("Inserte dos números separados por un guión -");
		Scanner entrada = new Scanner(System.in);

		String numString = entrada.next();

		// no he conseguido hacer que funcione dejando un espacio en blanco
		String[] nums = numString.split("-");

		int from = Integer.parseInt(nums[0]);
		int to = Integer.parseInt(nums[1]);

		System.out.println(pn.primesInRange(from, to));
	}

}
