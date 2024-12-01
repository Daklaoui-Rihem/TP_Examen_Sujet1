package examenTP;

public class ThemeArtiste implements ThemeEvt {
	
	private String artiste;
	
	

	public ThemeArtiste(String artiste) {
		this.artiste = artiste;
	}

	@Override
	public boolean theme(Evenement Evt) {
	    if (Evt.acteurIn(artiste)) {
	        return true;
	    }
	    
	    if (Evt.getRealistaeur().equals(artiste)) {
	        return true;
	    }
	    
	    if (Evt instanceof Film) {
	        Film film = (Film) Evt;
	        if (film.getProducteur().equals(artiste)) {
	            return true;
	        }
	    } 
	    
	    if (Evt instanceof Theatre) {
	        Theatre theatre = (Theatre) Evt;
	        if (theatre.getAuteur().equals(artiste)) {
	            return true;
	        }
	    }
	    
	    return false;
	}


}
