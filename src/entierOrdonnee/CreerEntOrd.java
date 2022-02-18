package entierOrdonnee;

import java.util.Scanner;

public class CreerEntOrd {
	public static void main(String[] args) {
		EntOrd e1 = new EntOrd(args.length);
		EntOrd e2 = new EntOrd(8);
		/*
		 * System.out.println("saisi du premier tableau"); for(int
		 * i=0;i<=e1.getTaille()-1;i++) { Scanner sc= new Scanner(System.in); int
		 * a=sc.nextInt(); e1.insertion(a); }
		 */
		for (int i = 0; i < args.length; i++) {
			e1.insertion(Integer.parseInt(args[i]));
		}

		System.out.println("saisi du deuxieme tableau");
		for (int i = 0; i <= e2.getTaille() - 1; i++) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			e2.insertion(a);
		}
		EntOrd union = e1.union(e2);
		EntOrd intersection = e1.intersection(e2);

		System.out.println("affichage du premier tableau trié");
		for (int i = 0; i <= e1.getIndiceT(); i++) {
			System.out.print(e1.getTab()[i] + "|");

		}
		System.out.println("****************************************************");

		System.out.println(e1.appartient(2) == true ? "Ce chiffre appartient à l'ensemble"
				: "Désolez!! ce chiffre n'appartient pas à l'ensemble");
		System.out.println();
		System.out.println((e1.succ(15) != -1 ? "Ce chiffre a pour successeur: "+e1.succ(15) : "Desolez ce chiffre n'a pas de successeur"));
		System.out.println((e1.pred(15) != -1 ? "Ce chiffre a pour predecesseur: "+e1.pred(15) : "Desolez ce chiffre n'a pas de predecesseur"));
		System.out.println();
		System.out.println("affichage du deuxieme tableau trié");
		for (int i = 0; i <= e2.getIndiceT(); i++) {
			System.out.print(e2.getTab()[i] + " ");
		}
		System.out.println("****************************************************");
		System.out.println("L\'union des deux tableaux");
		for (int i = 0; i <= union.getIndiceT(); i++) {
			System.out.print(union.getTab()[i] + " ");

		}
		System.out.println("****************************************************");
		System.out.println(" L\'intersection des deux tableaux");
		for (int i = 0; i <= intersection.getIndiceT(); i++) {
			System.out.print(intersection.getTab()[i] + " ");

		}
		
		System.out.println();
		System.out.println();

	}

}
