package examenTP;

import java.util.Arrays;

public class Evenement {
	private String titre;
	private int duree;
	private String tab[];
	private String realistaeur;
	
	public Evenement(String titre, int duree, String[] tab, String realistaeur) {
		this.titre = titre;
		this.duree = duree;
		this.tab = tab;
		this.realistaeur = realistaeur;
	}

	@Override
	public String toString() {
		return "Evenement [titre=" + titre + ", duree=" + duree + ", tab=" + Arrays.toString(tab) + ", realistaeur="
				+ realistaeur + "]";
	}

	public String getTitre() {
		return titre;
	}

	public int getDuree() {
		return duree;
	}


	public String getRealistaeur() {
		return realistaeur;
	}
	
	public boolean acteurIn(String s) {
	    if (tab == null) {
	        return false;
	    }
	    for (int i = 0; i < tab.length; i++) {
	        if (tab[i].equals(s)) {
	            return true;
	        }
	    }
	    return false;
	}

}
