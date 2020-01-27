package procedural.ExercicesJava;

import java.util.Scanner;

public class Tp1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//exercice1();
		exercice2();
		
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

}
