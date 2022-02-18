package Tp3Exo4;

import java.util.Scanner;

public class Caractere {

	public static void main(String[] args) {
		String[] liste = { "12", "je", "14" };
		double moyenne = 0.0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < liste.length; i++) {
			int min = sc.nextInt();
			int max = sc.nextInt();
			
			
			try {
				moyenne += Integer.parseInt(liste[i]);
				moyenne = moyenne / liste.length;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}

		}

	}
}
