package TpPolynome;

public class Polynome {
	private int[] polynome;
	private int coef;

	public Polynome(int coef) {
		this.polynome = new int[coef];
		this.coef = coef;
	}

	public int[] getPolynome() {
		return polynome;
	}

	public void setPolynome(int[] polynome) {
		this.polynome = polynome;
	}

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

	public Polynome additioner(Polynome p) {
		Polynome resultat = null;
		if (p.coef > this.coef) {
			resultat = p;
			for (int i = 0; i < p.coef; i++) {
				resultat.polynome[i] += p.polynome[i];
			}
		} else {
			resultat = p;
			for (int i = 0; i < this.coef; i++) {
				resultat.polynome[i] += this.polynome[i];
			}
		}
		resultat.affichage();
		return resultat;
	}

	public void affichage() {
		String monome = this.polynome[0] + " ";
		if (this.polynome[1] > 0)
			monome += "+" + this.polynome[1] + "x";
		else
			monome += "-" + this.polynome[1] + "x";
		for (int i = 2; i < this.coef; i++) {
			if (this.polynome[i] > 0) {
				monome += "+" + this.polynome[i] + "x^" + i;
			} else if (this.polynome[i] < 0) {
				monome += "-" + this.polynome[i] + "x^" + i;
			}
			// monome += "x^" + i;
		}
		System.out.println(monome);
	}

	public void derive() {
		String deriver = this.polynome[1] + " ";
		// p.coef = this.coef - 1;
		for (int i = 2; i < this.coef; i++) {
			if (this.polynome[i] > 0) {
				if (i == 2)
					deriver += "+" + this.polynome[i] * (i) + "x";
				else
					deriver += "+" + this.polynome[i] * (i) + "x^" + (i - 1);
			} else {
				if (i == 2)
					deriver += "-" + this.polynome[i] * (i) + "x";
				else
					deriver += "-" + this.polynome[i] * (i) + "x^" + (i - 1);
			}

		}
		System.out.println(deriver);
		/*
		 * Polynome derive = new Polynome(coef - 1); for (int i = 1; i < coef-1; i++) {
		 * derive.polynome[i-1] = this.polynome[i] * (i); } return derive;
		 */
	}

	public void valeurPolynome(double nombre) {
		String valeur = this.polynome[0] + "";
		for (int i = 1; i < this.coef; i++) {
			valeur += "+" + this.polynome[i] * Math.pow(nombre, i);
		}
		System.out.println(valeur);

	}

}
