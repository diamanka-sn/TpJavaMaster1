package Tp3Exo2;

import java.util.Scanner;

public class CreerEntOrd {

	public static void main(String[] args) {
		int tailleMax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la taille max de l'ensemble");
		tailleMax = sc.nextInt();
		EntOrd ord = new EntOrd(tailleMax);
		EntOrd ord2 = new EntOrd(3);
		ord2.getEnsemble()[0] = 1;
		ord2.getEnsemble()[1] = 2;
		ord2.getEnsemble()[2] = 3;

		for (int i = 0; i < args.length; i++) {
			ord.getEnsemble()[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < tailleMax; i++) {
			System.out.println(ord.getEnsemble()[i]);
		}

		

		/*for (int i = 0; i < args.length; i++) {
			System.out.println(ord.getEnsemble()[i]);
		}*/
		
		System.out.println(ord.appartient(2) == true ? "Ce chiffre appartient à l'ensemble"
				: "Désolez!!ce chiffre n'appartient pas à l'ensemble");
		System.out.println((ord.succ(15) != -1 ? ord.succ(15) : "Desolez ce chiffre n'a pas de successeur"));
		System.out.println((ord.pred(15) != -1 ? ord.pred(15) : "Desolez ce chiffre n'a pas de predecesseur"));
		System.out.println(ord.intersection(ord2));
	}

}
