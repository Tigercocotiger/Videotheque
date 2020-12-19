package ProjetJavav2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Commande {
	/*                               _       _     _                 _             _                    
	  | |                           (_)     | |   | |               | |           | |                   
	  | | ___  ___  __   ____ _ _ __ _  __ _| |__ | | ___  ___    __| | ___    ___| | __ _ ___ ___  ___ 
	  | |/ _ \/ __| \ \ / / _` | '__| |/ _` | '_ \| |/ _ \/ __|  / _` |/ _ \  / __| |/ _` / __/ __|/ _ \
	  | |  __/\__ \  \ V / (_| | |  | | (_| | |_) | |  __/\__ \ | (_| |  __/ | (__| | (_| \__ \__ \  __/
	  |_|\___||___/   \_/ \__,_|_|  |_|\__,_|_.__/|_|\___||___/  \__,_|\___|  \___|_|\__,_|___/___/\___|*/
	                                                                                                    
    public int identifiant_commande;
    public LocalDate datecre;
    public boolean reduc;
    public int numempr = 1;
    public String empr="emprunt"+numempr;
    public int id_client;
    
    

	/*  _____                _                   _                  
	   / ____|              | |                 | |                 
	  | |     ___  _ __  ___| |_ _ __ _   _  ___| |_ ___ _   _ _ __ 
	  | |    / _ \| '_ \/ __| __| '__| | | |/ __| __/ _ \ | | | '__|
	  | |___| (_) | | | \__ \ |_| |  | |_| | (__| ||  __/ |_| | |   
	   \_____\___/|_| |_|___/\__|_|   \__,_|\___|\__\___|\__,_|_|   */
	
	
	public Commande(int id) {
    	super();
        LocalDateTime currentTime = LocalDateTime.now();
        datecre = currentTime.toLocalDate();
        Main.idcommande++;
        this.identifiant_commande = Main.idcommande;
        this.id_client = id;
    }
	
/*	
	   ______               _   _                       
	  |  ____|             | | (_)                      
	  | |__ ___  _ __   ___| |_ _  ___  _ __  ___       
	  |  __/ _ \| '_ \ / __| __| |/ _ \| '_ \/ __|      
	  | | | (_) | | | | (__| |_| | (_) | | | \__ \_ _ _ 
	  |_|  \___/|_| |_|\___|\__|_|\___/|_| |_|___(_|_|_)*/
	                                                    
	                                                    
	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
    public int getNumempr() {
		return numempr;
	}

	public void setNumempr(int numempr) {
		this.numempr = numempr;
	}


	public String getEmpr() {
		return empr;
	}


	public void setEmpr(String empr) {
		this.empr = empr;
	}


    public int getidentifiant_commande() {
        return identifiant_commande;
    }

    public void setidentifiant_commande(int identifiant_commande) {
        this.identifiant_commande = identifiant_commande;
    }

    public LocalDate getDatecre() {
        return datecre;
    }

    public void setDatecre(LocalDate datecre) {
        this.datecre = datecre;
    }

    public boolean isReduc() {
        return reduc;
    }

    public void setReduc(boolean reduc) {
        this.reduc = reduc;
    }



}