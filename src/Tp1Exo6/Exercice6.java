package Tp1Exo6;

import java.util.*;
import java.lang.*;

public class Exercice6 {

	public static void main(String[] args) {
		int somme, produit, moyenne;
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		somme = n1 + n2 + n3;
		moyenne = (int) somme / 3;
		produit = n1 * n2 * n3;

		System.out.println("la somme est " + somme + " La moyenne est  " + moyenne + " le produit est " + produit);

		double rayon = sc.nextDouble();

		double diametre = 2 * rayon;
		double circonference = 2 * Math.PI * rayon;
		double aire = Math.PI * rayon * rayon;
		
		System.out.println("Le diametre du cercle est "+diametre+" La circonference est "+circonference+" L'aire est "+aire);
	}

}