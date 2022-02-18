package Devoir2019.exercice2;

public class Compte {
	float solde;
	int code;
	static int nbCompte;

	public Compte(float s) {
		solde = s;
		++nbCompte;
		code = nbCompte;
	}

	public Compte() {
		this(0);
	}

	public void retirer(float mtnt) {
		solde -= mtnt;
	}

	public void verser(float mtnt) {
		solde += mtnt;
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", code=" + code + "]";
	}

}
