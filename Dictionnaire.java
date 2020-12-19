package ProjetJavav2;

public class Dictionnaire extends Document {
	/*                               _       _     _                 _             _                    
	  | |                           (_)     | |   | |               | |           | |                   
	  | | ___  ___  __   ____ _ _ __ _  __ _| |__ | | ___  ___    __| | ___    ___| | __ _ ___ ___  ___ 
	  | |/ _ \/ __| \ \ / / _` | '__| |/ _` | '_ \| |/ _ \/ __|  / _` |/ _ \  / __| |/ _` / __/ __|/ _ \
	  | |  __/\__ \  \ V / (_| | |  | | (_| | |_) | |  __/\__ \ | (_| |  __/ | (__| | (_| \__ \__ \  __/
	  |_|\___||___/   \_/ \__,_|_|  |_|\__,_|_.__/|_|\___||___/  \__,_|\___|  \___|_|\__,_|___/___/\___|*/
	                                                                                                    
	public String langue;

	
	
	
	public Dictionnaire( String titre,String langue, double tarif_jour) {
		super( titre, tarif_jour);
		this.langue=langue;

	}
	
	/*	
	   ______               _   _                       
	  |  ____|             | | (_)                      
	  | |__ ___  _ __   ___| |_ _  ___  _ __  ___       
	  |  __/ _ \| '_ \ / __| __| |/ _ \| '_ \/ __|      
	  | | | (_) | | | | (__| |_| | (_) | | | \__ \_ _ _ 
	  |_|  \___/|_| |_|\___|\__|_|\___/|_| |_|___(_|_|_)*/
	   
	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

}
