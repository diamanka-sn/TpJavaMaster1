package Devoir2019.exercice2;

public class CompteEpargne extends Compte {
	
	private final float tauxInteret = 0.06f;
	public CompteEpargne(float s) {
		super(s);
	}
	
	public void calculInteret() {
		solde = (float) (solde * (1+tauxInteret));
	}
	
	public String toString() {
		return "Compte epargne "+super.toString()+" un taux de "+tauxInteret;
	}
	
}
