package TpPolynome;

public class Polynome2 extends Polynome {

	public Polynome2(int coef) {
		super(coef);
	}

	public void resoudreEquation() {
		double delta, x1, x2, x0;
		String solution = "La solution est: ";
		delta = (this.getPolynome()[1] * this.getPolynome()[1]) - 4 * this.getPolynome()[2] * this.getPolynome()[0];

		if (delta == 0) {
			x0 = -(this.getPolynome()[1] / (2 * this.getPolynome()[2]));
			solution += "" + x0;
		} else if (delta < 0)
			solution = "Desolez il n'y a pas de solution pour un delta inferieur a zero";
		else {
			x1 = (-this.getPolynome()[1] + Math.sqrt(delta)) / (2 * this.getPolynome()[2]);
			x2 = (-this.getPolynome()[1] - Math.sqrt(delta)) / (2 * this.getPolynome()[2]);
			solution += "X1= " + x1 + "  X2=" + x2;
		}
		System.out.println(solution);
	}

}
