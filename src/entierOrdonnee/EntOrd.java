package entierOrdonnee;

public class EntOrd {
	private int TailleMax;
	private int tab[];
	private int indiceT;

	public EntOrd(int taille) {
		this.TailleMax = taille;
		this.tab = new int[this.TailleMax];
		this.indiceT = -1;
	}
	public int getIndiceT() {
		return this.indiceT;
	}

	public int getTaille() {
		return this.TailleMax;
	}

	public int[] getTab() {
		return this.tab;
	}
	public void insertion(int x) {
		if (indiceT < TailleMax) {
			if (indiceT == -1) {
				indiceT++;
				tab[indiceT] = x;
			}
			if (!this.appartient(x)) {
				int i = indiceT;
				while (i >= 0 && tab[i] > x) {
					tab[i + 1] = tab[i];
					i--;
				}
				tab[i + 1] = x;
				indiceT++;

			}
		}
	}

	public void suppression(int x) {
		if (indiceT < TailleMax) {
			for (int i = x; i <= indiceT; i++) {
				tab[i] = tab[i + 1];
			}
			indiceT--;
		}

	}

	public boolean appartient(int x) {
		boolean reponse = false;
		for (int i = 0; i <= indiceT; i++) {
			if (tab[i] == x)
				reponse = true;
		}
		return reponse;
	}

	public int succ(int x) {
		int reponse = -1;

		for (int i = 0; i < indiceT; i++) {
			if (tab[i] == x && i < indiceT - 1) {
				reponse = tab[i + 1];
				break;
			} else if (tab[i] == x && i == indiceT - 1) {
				reponse = -1;
				break;
			} else {
				reponse = -1;
			}

		}
		return reponse;
	}

	public int pred(int x) {
		int reponse = -1;
		for (int i = 0; i < indiceT; i++) {
			if (tab[i] == x && i > 0) {
				reponse = tab[i - 1];
				break;
			} else if (tab[i] == x && i > 0) {
				reponse = -1;
				break;
			} else {
				reponse = -1;
			}
		}
		return reponse;

	}

	public EntOrd union(EntOrd e1) {
		int taille = this.getTaille() + e1.getTaille();
		EntOrd e2 = new EntOrd(taille);
		for (int i = 0; i <= this.getIndiceT(); i++) {
			e2.insertion(this.getTab()[i]);
		}

		for (int i = 0; i <= e1.getIndiceT(); i++) {
			if (!e2.appartient(e1.getTab()[i])) {
				e2.insertion(e1.getTab()[i]);
			}
		}

		return e2;

	}

	public EntOrd intersection(EntOrd e1) {
		int taille;
		EntOrd e2;
		if (this.getTaille() > e1.getTaille()) {
			taille = e1.getTaille();
			e2 = new EntOrd(taille);
			for (int i = 0; i <= this.getIndiceT(); i++) {
				if (e1.appartient(this.getTab()[i])) {
					e2.insertion(this.getTab()[i]);
				}
			}

		} else {
			taille = this.getTaille();
			e2 = new EntOrd(taille);
			for (int i = 0; i <= e1.getIndiceT(); i++) {
				if (this.appartient(e1.getTab()[i])) {
					e2.insertion(e1.getTab()[i]);
				}
			}
		}

		return e2;
	}

	

}
