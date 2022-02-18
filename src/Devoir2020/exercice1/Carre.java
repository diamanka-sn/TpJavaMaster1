package Devoir2020.exercice1;

public class Carre extends Rectangle {
	double cote;

	public Carre(double longu, double larg) {
		super(longu, larg);
		if (longu == larg)
			cote = longu;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	public double perimetre() {
		double p;
		p = cote * 4;
		return p;
	}

	public double aire() {
		double a;
		a = cote * cote * cote * cote;

		return a;
	}
	
	public boolean estCarre() {
		return true;
	}

	@Override
	public String toString() {
		return "Carre [cote=" + cote + ", getCote()=" + getCote() + ", perimetre()=" + perimetre() + ", aire()="
				+ aire() + "," +(estCarre() == true ? "Il s'agit d'un carree":"Il ne s'agit pa d'un carre") + "]";
	}

	
	

}
