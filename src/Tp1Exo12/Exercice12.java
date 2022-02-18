package Tp1Exo12;

public class Exercice12 {

	public static void main(String[] args) {
		int somme=0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			somme += args[i].length();
		}
		System.out.println("La somme de tous les caractères est: "+somme);
	}

}
