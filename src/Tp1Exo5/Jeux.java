package Tp1Exo5;

import java.util.Random;
import java.util.Scanner;

public class Jeux {

	public static void main(String[] args) {
		System.out.println("Je pense à un nombre compris entre 1 et 100");

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int x = rd.nextInt(101) + 1;
		//System.out.println(x);
		int guess;
		do {
			System.out.print("Devine le nombre: ");
			guess = sc.nextInt();
		} while ((guess < 1) || (guess > 100));
		int c = 0;
		for (int i = 1; i <= 5; i++) {
			c = 0;
			if (guess == x) {
				System.out.println("Bravo!! reponse exacte");
				break;
			} else {
				System.out.println("Non: Le nombre est trop " + (guess < x ? "petit" : "grand"));
				c = 1;
				do {
					System.out.print("Essaie encore: ");
					guess = sc.nextInt();
				} while ((guess <= 1) || (guess >= 100));

			}
		}
		if (c == 1) {
			System.out.println("Non: ce nombre etait: " + x);
		}
	}

}
