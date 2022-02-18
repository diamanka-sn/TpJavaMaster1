package Devoir2019;

public class Complexe {
	private int partieReelle;
	private int partieImaginaire;

	public Complexe() {
		this.partieImaginaire = 0;
		this.partieReelle = 0;
	}

	public Complexe(int partieReelle, int partieImaginaire) {
		this.partieReelle = partieReelle;
		this.partieImaginaire = partieImaginaire;
	}

	public int getPartieReelle() {
		return partieReelle;
	}

	public void setPartieReelle(int partieReelle) {
		this.partieReelle = partieReelle;
	}

	public int getPartieImaginaire() {
		return partieImaginaire;
	}

	public void setPartieImaginaire(int partieImaginaire) {
		this.partieImaginaire = partieImaginaire;
	}

	public Complexe plus(Complexe e) {
		Complexe Z = null;
		int r, i;
		r = this.partieReelle + e.partieReelle;
		i = this.partieImaginaire + e.partieImaginaire;
		Z = new Complexe(r, i);
		return Z;
	}
	
	public Complexe moins(Complexe e) {
		Complexe Z = null;
		int r, i;
		r = this.partieReelle - e.partieReelle;
		i = this.partieImaginaire - e.partieImaginaire;
		Z = new Complexe(r, i);
		return Z;	
	}

	@Override
	public String toString() {
		String retour;
		if(partieImaginaire<0)
			retour =  partieReelle  +"" + partieImaginaire+"i";
		else 
			retour =  partieReelle  +"+" + partieImaginaire+"i";
		return retour;
	}
	

}
