package Tp3Exo6;

public class Email {
	private String nomUtilisateur;
	private String nomServeur;
	
	public Email(String nomUtilisateur, String nomServeur) throws InvalideNom {
		if(nomUtilisateur.length()!=11) throw new InvalideNom("Le nom d'utilisateur doit etre superieru à 11");
		this.nomUtilisateur = nomUtilisateur;
		this.nomServeur = nomServeur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getNomServeur() {
		return nomServeur;
	}

	public void setNomServeur(String nomServeur) {
		this.nomServeur = nomServeur;
	}

	@Override
	public String toString() {
		return  nomUtilisateur + "@" + nomServeur;
	}	
}
