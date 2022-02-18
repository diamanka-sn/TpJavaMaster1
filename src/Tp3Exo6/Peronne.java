package Tp3Exo6;

public class Peronne {
	private String nom;
	private char sexe;
	private String telephone;
	private Email email;
	
	public Peronne(String nom, char sexe, String telephone, Email email) throws InvalidSexeException {
		this.nom = nom;
		if((sexe != 'M') ||(sexe != 'F')) throw new InvalidSexeException();
		this.sexe = sexe;
		this.telephone = telephone;
		this.email = email;
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public char getSexe(){
		return sexe;
	}

	public void setSexe(char sexe) throws InvalidSexeException {
		if ((sexe!='M') || (sexe!='F'))
		throw new InvalidSexeException();
		this.sexe = sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String retourner="";
		if(sexe == 'M') {
			retourner = "[Mr "+nom+ ", " +telephone+" ,"+email+"";
		}
		else {
			retourner =  "[Mme "+nom+ ", " +telephone+" ,"+email+"";
		}
		return retourner;
	}
}
