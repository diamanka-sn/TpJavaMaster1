package Tp1Exo10;

import java.util.Scanner;

public class Exercice10 {
	public static void main(String[] args) {
		String nom;
		String prenom;
		String concat;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le prenom");
		prenom = sc.next();
		
		System.out.println("Donner le nom");
		nom = sc.next();
		
		concat = prenom+" "+nom;
		
		
		System.out.println("Nom complet est "+concat);
	}
}
