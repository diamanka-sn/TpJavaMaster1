package Tp3Exo2;

import java.util.Scanner;

public class EntOrd {
	private int[] ensemble;
	private int taille;

	public EntOrd(int taille) {
		this.ensemble = new int[taille];
		this.taille = taille;
	}

	public int[] getEnsemble() {
		return ensemble;
	}

	public void setEnsemble(int[] ensemble) {
		this.ensemble = ensemble;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public void insertion(int x) {
		/*
		 * Scanner sc = new Scanner(System.in); if (ensemble.length < x)
		 * System.out.println("L'index que vous demandez n'existe pas"); else { int nb;
		 * System.out.println("Entrer la valeurs que vous vouleez inserer"); nb =
		 * sc.nextInt(); ensemble[x] = nb; }
		 */
		int tempon;
		ensemble[ensemble.length - 1] = x;
		for (int i = 0; i < ensemble.length; i++) {
			if (ensemble[i] == 0)
				continue;
			if (x < ensemble[i]) {
				tempon = ensemble[i];
				ensemble[i] = x;
			}

		}
	}

	public void suppression(int x) {
		for (int i = 0; i < ensemble.length; i++) {
			if (ensemble[i] == x) {

			}
		}
	}

	public boolean appartient(int x) {
		boolean retour = true;
		for (int i = 0; i < ensemble.length; i++) {
			if (getEnsemble()[i] != x) {
				retour = false;
			} else {
				retour = true;
				break;
			}
		}
		return retour;
	}

	public int succ(int x) {
		int succ = 0;
		for (int i = 0; i < taille; i++) {
			if ((ensemble[i] == x) && (i != taille - 1)) {
				succ = ensemble[i + 1];
				break;
			} else if ((ensemble[i] == x) && (i == taille - 1)) {
				// succ = ensemble[i];
				// System.out.println("Désolez le nombre "+x+" n'a pas de prede!!!");
				succ = -1;
				break;
			} else {
				succ = -1;
			}
		}
		return succ;
	}

	public int pred(int x) {
		int pred = 0;
		for (int i = 0; i < ensemble.length; i++) {
			if ((ensemble[i] == x) && (i != 0)) {
				pred = ensemble[i - 1];
				break;
			} else if ((ensemble[i] == x) && (i == 0)) {
				// pred = ensemble[i];
				// System.out.println("Désolez le nombre "+x+" n'a pas de successeur!!!");
				pred = -1;
				break;
			} else {
				pred = -1;
			}

		}
		return pred;
	}

	public EntOrd union(EntOrd e1) {
		int n = this.taille + e1.taille;
		EntOrd e = new EntOrd(n);
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (this.ensemble[i] == e1.ensemble[i]) {
				e.ensemble[i] = this.ensemble[i];
			} else {

			}
		}
		return e;
	}

	public EntOrd intersection(EntOrd e1) {
		int n;
		if (e1.taille < this.taille)
			n = this.taille;
		else
			n = e1.taille;
		EntOrd e = new EntOrd(n);
		int j = 0;
		for (int i = 0; i < this.taille; i++) {
			for (int t = 0; t < e1.taille; t++) {
				if (this.ensemble[i] == e1.ensemble[t]) {
					e.ensemble[j] = this.ensemble[i];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(e.getEnsemble()[i]);
		}
		return e;
	}
}
