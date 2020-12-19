package ProjetJavav2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Emprunt {
	/*                               _       _     _                 _             _                    
	  | |                           (_)     | |   | |               | |           | |                   
	  | | ___  ___  __   ____ _ _ __ _  __ _| |__ | | ___  ___    __| | ___    ___| | __ _ ___ ___  ___ 
	  | |/ _ \/ __| \ \ / / _` | '__| |/ _` | '_ \| |/ _ \/ __|  / _` |/ _ \  / __| |/ _` / __/ __|/ _ \
	  | |  __/\__ \  \ V / (_| | |  | | (_| | |_) | |  __/\__ \ | (_| |  __/ | (__| | (_| \__ \__ \  __/
	  |_|\___||___/   \_/ \__,_|_|  |_|\__,_|_.__/|_|\___||___/  \__,_|\___|  \___|_|\__,_|___/___/\___|*/
	                                                                                                    
    public LocalDate datedebut;
    public LocalDate datefin;
    public boolean fini;
    public long dur�e;

    /*  _____                _                   _                  
	   / ____|              | |                 | |                 
	  | |     ___  _ __  ___| |_ _ __ _   _  ___| |_ ___ _   _ _ __ 
	  | |    / _ \| '_ \/ __| __| '__| | | |/ __| __/ _ \ | | | '__|
	  | |___| (_) | | | \__ \ |_| |  | |_| | (__| ||  __/ |_| | |   
	   \_____\___/|_| |_|___/\__|_|   \__,_|\___|\__\___|\__,_|_|   */
    
	
	public Emprunt(long dur�e) {
    	super();
    	Main.idemprunt++;
        this.dur�e = dur�e;
        LocalDateTime currentTime = LocalDateTime.now();
        datedebut = currentTime.toLocalDate();
        datefin = datedebut.plusDays(dur�e);

	}
	/*	
	   ______               _   _                       
	  |  ____|             | | (_)                      
	  | |__ ___  _ __   ___| |_ _  ___  _ __  ___       
	  |  __/ _ \| '_ \ / __| __| |/ _ \| '_ \/ __|      
	  | | | (_) | | | | (__| |_| | (_) | | | \__ \_ _ _ 
	  |_|  \___/|_| |_|\___|\__|_|\___/|_| |_|___(_|_|_)*/
	   
	public LocalDate getDatedebut() {
        return datedebut;
    }
	

    public long getDur�e() {
		return dur�e;
	}

	public void setDur�e(int dur�e) {
		this.dur�e = dur�e;
	}

    public boolean isFini() {
		return fini;
	}

	public void setFini(boolean fini) {
		this.fini = fini;
	}

	public void setDatedebut(LocalDate datedebut) {
        this.datedebut = datedebut;
    }

    public LocalDate getDatefin() {
        return datefin;
    }

    public void setDatefin(LocalDate datefin) {
        this.datefin = datefin;
    }


}