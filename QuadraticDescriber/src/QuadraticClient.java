/* Robert Liu
 * September 26 2019
 * APCS 4
 * Client that scans for doubles and handles interactions with user
 */

import java.util.*;

public class QuadraticClient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide the values coefficients a, b, and c");
		String test;
		do {
			System.out.println();
			System.out.print("a: ");
			double a = input.nextDouble();
			System.out.println();
			System.out.print("b: ");
			double b = input.nextDouble();
			System.out.println();
			System.out.print("c: ");
			double c = input.nextDouble();
			System.out.println();
			String output = Quadratic.quadrDescriber(a, b, c);
			System.out.println(output);
			System.out.println();
			System.out.println("Do you want to keep going? Type \"quit\" to end)");
			test = input.next();
		} while (!test.toLowerCase().equals("quit"));
	}
}
			
		