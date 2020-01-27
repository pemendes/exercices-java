package procedural.ExercicesJava;

import java.util.Scanner;

public class Tp1 {

	public static void main(String[] args) {
		exercice1();
		
	}
	
	private static void exercice1() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Prénom : ");
		String prenom = sc.next();

		System.out.print("Nom : ");
		String nom = sc.next();

		System.out.print("Age : ");
		int age = sc.nextInt();
		
		sc.close();

		System.out.println(prenom + " " + nom + " (" + age + " ans).");
	}

}
