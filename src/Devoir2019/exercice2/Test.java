package Devoir2019.exercice2;

public class Test {

	public static void main(String[] args) {
		Compte c1 = new Compte(50000);
		CompteEpargne ce = new CompteEpargne(50000);
		ComptePayant cp = new ComptePayant(50000);
		
		c1.verser(50000);
		ce.verser(50000);
		cp.verser(50000);
		
		c1.retirer(25000);
		ce.retirer(25000);
		cp.retirer(25000);
		
		ce.calculInteret();
		
		System.out.println(c1);
		System.out.println(ce);
		System.out.println(cp);
	}

}
