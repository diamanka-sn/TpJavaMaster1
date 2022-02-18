package Tp3Exo1;

public class polynome2 extends Polynome {
	private int a, b, c;

	public polynome2( int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public void resoudreEquation(int a, int b,int c) {
		double delta;
		delta = b*b - 4*a*c;
	}
	
}
