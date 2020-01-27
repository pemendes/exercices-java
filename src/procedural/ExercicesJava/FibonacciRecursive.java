package procedural.ExercicesJava;

import java.util.Scanner;

public class FibonacciRecursive {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Saisir un nombre: ");
		int c = sc.nextInt();
		fibonacci(c - 2);
		System.out.println();
		System.out.print("---> " + nbr3);
		sc.close();
	}

	static int nbr1 = 0;
	static int nbr2 = 1;
	static int nbr3 = 0;

	public static void fibonacci(int c) {
		if (c >= 0) {
			nbr3 = nbr1 + nbr2;
			nbr1 = nbr2;
			nbr2 = nbr3;
			System.out.print(" " + nbr3);
			fibonacci(c - 1);
		}
	}
}
