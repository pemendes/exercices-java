package procedural.ExercicesJava;

import java.util.Scanner;

public class Tp1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//exercice1();
		//exercice2();
		exercice3();
		
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

}
