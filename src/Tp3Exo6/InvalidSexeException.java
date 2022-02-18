package Tp3Exo6;

public class InvalidSexeException extends Exception {

	public InvalidSexeException() {
		super("Désolé le sexe doit etre un M(masculin) ou F(feminin)");
	}

}
