package ProjetJavav2;

public class DVD extends SupportNum�rique{
	/*                               _       _     _                 _             _                    
	  | |                           (_)     | |   | |               | |           | |                   
	  | | ___  ___  __   ____ _ _ __ _  __ _| |__ | | ___  ___    __| | ___    ___| | __ _ ___ ___  ___ 
	  | |/ _ \/ __| \ \ / / _` | '__| |/ _` | '_ \| |/ _ \/ __|  / _` |/ _ \  / __| |/ _` / __/ __|/ _ \
	  | |  __/\__ \  \ V / (_| | |  | | (_| | |_) | |  __/\__ \ | (_| |  __/ | (__| | (_| \__ \__ \  __/
	  |_|\___||___/   \_/ \__,_|_|  |_|\__,_|_.__/|_|\___||___/  \__,_|\___|  \___|_|\__,_|___/___/\___|*/
	                                                                                                    
	public String r�alisateur;
	

	/*  _____                _                   _                  
	   / ____|              | |                 | |                 
	  | |     ___  _ __  ___| |_ _ __ _   _  ___| |_ ___ _   _ _ __ 
	  | |    / _ \| '_ \/ __| __| '__| | | |/ __| __/ _ \ | | | '__|
	  | |___| (_) | | | \__ \ |_| |  | |_| | (__| ||  __/ |_| | |   
	   \_____\___/|_| |_|___/\__|_|   \__,_|\___|\__\___|\__,_|_|   */
	

	public DVD( String titre,String r�alisateur, double tarif_jour) {
		super( titre, tarif_jour);
		this.r�alisateur=r�alisateur;
	}
	/*	
	   ______               _   _                       
	  |  ____|             | | (_)                      
	  | |__ ___  _ __   ___| |_ _  ___  _ __  ___       
	  |  __/ _ \| '_ \ / __| __| |/ _ \| '_ \/ __|      
	  | | | (_) | | | | (__| |_| | (_) | | | \__ \_ _ _ 
	  |_|  \___/|_| |_|\___|\__|_|\___/|_| |_|___(_|_|_)*/
	   

	public String getR�alisateur() {
		return r�alisateur;
	}


	public void setR�alisateur(String r�alisateur) {
		this.r�alisateur = r�alisateur;
	}
	}	