package examenTP;

public class Theatre extends Evenement{
	private String auteur;

	public Theatre(String titre, int duree, String[] tab, String realistaeur, String auteur) {
		super(titre, duree, tab, realistaeur);
		this.auteur=auteur;
	}

	@Override
	public String toString() {
		return super.toString()+"Theatre [auteur=" + auteur + "]";
	}

	public String getAuteur() {
		return auteur;
	}
}
