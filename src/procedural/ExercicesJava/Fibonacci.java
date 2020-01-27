package procedural.ExercicesJava;

public class Fibonacci {

	public static void main(String[] args) {
		fibo1();
		System.out.println();
		fibo2();
		System.out.println();
		System.out.println("---> " + fibo3(10) + " ---> " + cpt + " fois l'appel à la méthode récursive");
	}

	private static void fibo1() {

		int n = 10;

		int fNmoins2 = 0;
		int fNmoins1 = 1;

		System.out.print(fNmoins2 + " ");
		System.out.print(fNmoins1 + " ");

		for (int i = 2; i <= n; i++) {

			int fN = fNmoins1 + fNmoins2;

			System.out.print(fN + " ");

			fNmoins2 = fNmoins1;
			fNmoins1 = fN;
		}

	}

	private static void fibo2() {

		// Déclaration
		int rang = 10;
		int[] fibo = new int[rang + 1];

		// Initialisation
		fibo[0] = 0;
		fibo[1] = 1;

		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		// Utilisation
		for (int i = 0; i < fibo.length; i++) {
			System.out.print(fibo[i] + " ");
		}
	}

	private static int cpt = 0;

	private static int fibo3(int rang) {

		cpt++;

		if (rang <= 1) {
			return rang;
		}

		return fibo3(rang - 1) + fibo3(rang - 2);
	}
}

