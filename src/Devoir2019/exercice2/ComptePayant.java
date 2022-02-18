package Devoir2019.exercice2;

public class ComptePayant extends Compte {
	public ComptePayant(float s) {
		super(s);
	}
	
	public void verser(float montant) {
		super.verser(montant);
		super.retirer(500);
		
	} 
	
	public void retirer(float montant) {
		super.retirer(montant);
		super.retirer(500);
	}
	
	public String toString() {
		return "compte payant "+super.toString();
	}
}
