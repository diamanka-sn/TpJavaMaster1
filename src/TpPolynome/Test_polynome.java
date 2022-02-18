package TpPolynome;

import java.util.Scanner;

public class Test_polynome {

	public static void main(String[] args) {
		int coef;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la taille du polynome");
		coef = sc.nextInt();
		Polynome p = new Polynome(coef);
		Polynome2 p2 = new Polynome2(3);

		for (int i = 0; i < coef; i++) {
			System.out.println("Donner le poids " + i + " du polynome");
			p.getPolynome()[i] = sc.nextInt();
		}

		System.out.println("Affichage du polynome 1");
		p.affichage();
		System.out.println("Affichage du polynome second degre");
		p2.affichage();
		System.out.println("Addition du polynome");
		p.additioner(p);
		System.out.println("Le derivé du polynome est");
		p.derive();
		System.out.println("Multiplication d'un nombre");
		p.valeurPolynome(12);
		System.out.println("*********************************************");
		System.out.println("Donner le polynome du second de gre");
		for (int i = 0; i < 3; i++) {
			System.out.println("Donner le poids " + i + " du polynome");
			p2.getPolynome()[i] = sc.nextInt();
		}

		p2.resoudreEquation();
	}

}
