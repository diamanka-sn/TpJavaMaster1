package Tp3Exo6;

import java.util.Arrays;

public class Etudiant extends Peronne {
	
	private double[] notes;
	private int credit;
	private double moyenne = 0.0;
	
	public Etudiant(String nom, char sexe, String telephone, Email email, double[] notes, int credit) throws InvalidSexeException {
		super(nom, sexe, telephone, email);
		this.notes = notes;
		this.credit = credit;
	}
	
	public double[] getNotes() {
		return notes;
	}

	public void setNotes(double[] notes) {
		this.notes = notes;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public double calculerMoyenne() {
		for(int i = 0; i<notes.length;i++) {
			moyenne += notes[i] ;
		}	
		return moyenne/notes.length;
	}

	@Override
	public String toString() {
		return super.toString() + credit + " Crédits et moyenne " + calculerMoyenne()
				+ "]";
	}
}
