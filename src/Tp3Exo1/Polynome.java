package Tp3Exo1;

public class Polynome {
	private int degre;
	private int[] coefs;

	public Polynome(int... coefs) {
		this.degre = coefs.length - 1;
		this.coefs = coefs;
	}

	public Polynome(int degre) {
		this.degre = degre;
		this.coefs = new int[degre + 1];
	}

	public Polynome addition(Polynome p) {
		Polynome retour;
		if (this.degre > p.degre) {
			retour = this;
			for (int i = 0; i <= p.degre; i++) {
				retour.coefs[i] += p.coefs[i];
			}
		} else {
			retour = p;
			for (int i = 0; i <= this.degre; i++) {
				retour.coefs[i] += this.coefs[i];
			}
		}
		return retour;

	}

	public void affichage() {
		String monome = this.coefs[0] + " ";
		for (int i = 1; i <= this.degre; i++) {
			if (this.coefs[i] > 0) {
				monome += "+" + this.coefs[i] + "x^" + i;
			} else if (this.coefs[i] < 0) {
				monome += "-" + this.coefs[i] + "x^" + i;
			}
			// monome += "x^" + i;
		}
		System.out.println(monome);
	}

	public Polynome derive() {
		Polynome p = null;
		p.degre = this.degre - 1;
		for (int i = 0; i <= p.degre; i++) {
			p.coefs[i] = this.coefs[i + 1] * (i + 1);
		}
		return p;
	}

	public double valeurPolynome(double nombre) {
		double valeur = this.coefs[0];
		for (int i = 1; i <= this.degre; i++) {
			valeur += this.coefs[i] * Math.pow(nombre, i);
		}
		return valeur;
	}

}
