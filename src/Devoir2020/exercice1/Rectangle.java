package Devoir2020.exercice1;

public class Rectangle {
	private double longu;
	private double larg;

	public Rectangle(double longu, double larg) {
		this.longu = longu;
		this.larg = larg;
	}

	public double getLongu() {
		return longu;
	}

	public void setLongu(double longu) {
		this.longu = longu;
	}

	public double getLarg() {
		return larg;
	}

	public void setLarg(double larg) {
		this.larg = larg;
	}

	public double perimetre() {
		double p;
		p = 2 * (longu + larg);
		return p;
	}

	public double aire() {
		double a;
		a = longu * larg;

		return a;
	}

	public boolean estCarre() {
		boolean retour;
		if (longu == larg)
			retour = true;
		else
			retour = false;
		return retour;
	}

	@Override
	public String toString() {
		return "Rectangle [longu=" + longu + ", larg=" + larg + ", perimetre()=" + perimetre() + ", aire()=" + aire()
				+ ", estCarre()=" + (estCarre() == true ? "Il s'agit d'un carree":"Il ne s'agit pa d'un carre") + "]";
	}

}
