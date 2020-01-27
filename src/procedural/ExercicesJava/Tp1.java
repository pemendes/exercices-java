package procedural.ExercicesJava;

import java.util.Scanner;

public class Tp1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//exercice1();
		//exercice2();
		//exercice3();
		//exercice4();
		exercice5();
		
	}
	
	private static void exercice1() {

		System.out.print("Prénom : ");
		String prenom = sc.next();

		System.out.print("Nom : ");
		String nom = sc.next();

		System.out.print("Age : ");
		int age = sc.nextInt();
		
		sc.close();

		System.out.println(prenom + " " + nom + " (" + age + " ans).");
	}
	
	private static void exercice2() {

		System.out.print("var 1 : ");
		int x = sc.nextInt();

		System.out.print("var 2 : ");
		int y = sc.nextInt();

		int z = x;
		x = y;
		y = z;

		System.out.println("Var 1 : " + x + " et Var 2 : " + y);
	}
	
	private static void exercice3() {

		System.out.print("Une année : ");
		int annee = sc.nextInt();

		// soit divisibles par 4 mais non divisibles par 100,
		// soit divisibles par 400.

		// (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)

		if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
			// L’année X est bissextile
			System.out.println("L’année " + annee + " est bissextile");
		} else {
			// L’année X n’est pas bissextile
			System.out.println("L’année " + annee + " n'est pas bissextile");
		}
	}
	
	private static void exercice4() {

		int borneMin = 0;
		int borneMax = 101;

		int max = borneMin;
		int min = borneMax;

		int positionMin = 0;
		int positionMax = 0;

		for (int i = 0; i < 10; i++) {

			int rand = (int) (Math.random() * borneMax);

			System.out.println((i + 1) + " --> " + rand);

			// Nouveau max ??
			if (rand > max) {
				max = rand;
				positionMax = i + 1;
			}

			// Nouveau min ??
			if (rand < min) {
				min = rand;
				positionMin = i + 1;
			}
		}

		System.out.println("le max est : " + max + " position : " + positionMax);
		System.out.println("le min est : " + min + " position : " + positionMin);
	}
	
	private static void exercice5() {
		int rand = (int) (Math.random() * 101);

		System.out.println(rand);

		boolean trouve = false;

		while (!trouve) {

			System.out.print("un nombre : ");
			int nombre = sc.nextInt();

			int distance = Math.abs(nombre - rand);

			if (distance > 20) {
				System.out.println("Froid !!!!");
			} else if (distance > 5) {
				System.out.println("Tiède !!!!");
			} else if (distance > 0) {
				System.out.println("Chaud !!!!");
			} else {
				System.out.println("Gagné");
				trouve = true;
			}
		}
	}

}
