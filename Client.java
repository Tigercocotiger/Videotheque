package ProjetJavav2;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	/*                               _       _     _                 _             _                    
	  | |                           (_)     | |   | |               | |           | |                   
	  | | ___  ___  __   ____ _ _ __ _  __ _| |__ | | ___  ___    __| | ___    ___| | __ _ ___ ___  ___ 
	  | |/ _ \/ __| \ \ / / _` | '__| |/ _` | '_ \| |/ _ \/ __|  / _` |/ _ \  / __| |/ _` / __/ __|/ _ \
	  | |  __/\__ \  \ V / (_| | |  | | (_| | |_) | |  __/\__ \ | (_| |  __/ | (__| | (_| \__ \__ \  __/
	  |_|\___||___/   \_/ \__,_|_|  |_|\__,_|_.__/|_|\___||___/  \__,_|\___|  \___|_|\__,_|___/___/\___|*/
	                                                                                                    
	private int identifiant_client;
	private String nom;
	private String prénom;
	private int nombrecom=0;
	private boolean fidèle;

	/*  _____                _                   _                  
	   / ____|              | |                 | |                 
	  | |     ___  _ __  ___| |_ _ __ _   _  ___| |_ ___ _   _ _ __ 
	  | |    / _ \| '_ \/ __| __| '__| | | |/ __| __/ _ \ | | | '__|
	  | |___| (_) | | | \__ \ |_| |  | |_| | (__| ||  __/ |_| | |   
	   \_____\___/|_| |_|___/\__|_|   \__,_|\___|\__\___|\__,_|_|   */
	
	
	public Client(String nom,String prénom,boolean fidèle){
		this.fidèle=fidèle;
		Main.idclient++;
		this.identifiant_client= Main.idclient;
		this.nom=nom;
		this.prénom=prénom;
		
	}
	/*	
	   ______               _   _                       
	  |  ____|             | | (_)                      
	  | |__ ___  _ __   ___| |_ _  ___  _ __  ___       
	  |  __/ _ \| '_ \ / __| __| |/ _ \| '_ \/ __|      
	  | | | (_) | | | | (__| |_| | (_) | | | \__ \_ _ _ 
	  |_|  \___/|_| |_|\___|\__|_|\___/|_| |_|___(_|_|_)*/
	   
	public int getNombrecom() {
		return nombrecom;
	}
	public void setNombrecom(int nombrecom) {
		this.nombrecom = nombrecom;
	}
	
	public int getidentifiant_client() {
		return identifiant_client;
	}
	
	public void setidentifiant_client(int identifiant_client) {
		this.identifiant_client = identifiant_client;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrénom() {
		return prénom;
	}
	
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	
	public boolean isFidèle() {
		return fidèle;
	}
	public void setFidèle(boolean fidèle) {
		this.fidèle = fidèle;
	}
	}
