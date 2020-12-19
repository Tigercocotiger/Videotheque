package ProjetJavav2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
	
	/*  _                             _       _     _            
	   | |                           (_)     | |   | |           
	   | | ___  ___  __   ____ _ _ __ _  __ _| |__ | | ___  ___  
	   | |/ _ \/ __| \ \ / / _` | '__| |/ _` | '_ \| |/ _ \/ __| 
	   | |  __/\__ \  \ V / (_| | |  | | (_| | |_) | |  __/\__ \ 
	   |_|\___||___/   \_/ \__,_|_|  |_|\__,_|_.__/|_|\___||___/ */
	                                                            
	                                                            
	public static int idproduit;
	public static int idclient;
	public static int idcommande;
	public static int idemprunt;
	public static int rom;
	public static int manu;
	public static int bd;
	public static int dico;
	public static int cd;
	public static int dvd;
	
	
	/*  _             _               _                           
 	   | |           | |             | |                          
 	   | | ___  ___  | |__   __ _ ___| |__  _ __ ___   __ _ _ __  
       | |/ _ \/ __| | '_ \ / _` / __| '_ \| '_ ` _ \ / _` | '_ \ 
       | |  __/\__ \ | | | | (_| \__ \ | | | | | | | | (_| | |_) |
       |_|\___||___/ |_| |_|\__,_|___/_| |_|_| |_| |_|\__,_| .__/ 
                                                           | |    
                                                           |_|    */
	
	public static ArrayList listeproduit = new ArrayList();//id produits
	public static ArrayList<Integer> listecommande = new ArrayList();//id commandes
	public static ArrayList<Integer> listeclient = new ArrayList();// id clients
	public static HashMap<Integer, Boolean> fidele = new HashMap<>();//id client + fidele
	public static HashMap<Integer, Double> mapPrix = new HashMap<>();//id produit + prix
	public static HashMap<Integer, Integer> mapCommande = new HashMap<>();//id commande + id client
	public static HashMap<Integer, String> mapProduit = new HashMap<>();//id produit + produit
	public static HashMap<Integer, String> mapTypeproduit = new HashMap<>();//id produit + type produit
	
	
	/*
	   _             _      _     _            
	  | |           | |    (_)   | |           
	  | | ___  ___  | |     _ ___| |_ ___  ___ 
	  | |/ _ \/ __| | |    | / __| __/ _ \/ __|
	  | |  __/\__ \ | |____| \__ \ ||  __/\__ \
	  |_|\___||___/ |______|_|___/\__\___||___/*/
	                                           
	                                           
	public static ArrayList listecommande1 = new ArrayList();//liste des emprunts d'une commande
	public static ArrayList listecommande2 = new ArrayList();
	public static ArrayList listecommande3 = new ArrayList();
	public static ArrayList listecommande4 = new ArrayList();
	public static ArrayList listecommande5 = new ArrayList();
	public static ArrayList listecommande6 = new ArrayList();
	public static ArrayList listecommande7 = new ArrayList();
	public static ArrayList listecommande8 = new ArrayList();
	public static ArrayList listecommande9 = new ArrayList();
	public static ArrayList listecommande10 = new ArrayList();
	public static ArrayList<Double> listeprixcom1 = new ArrayList();//liste des prix de chaque emprunt d'une commande
	public static ArrayList<Double> listeprixcom2 = new ArrayList();
	public static ArrayList<Double> listeprixcom3 = new ArrayList();
	public static ArrayList<Double> listeprixcom4 = new ArrayList();
	public static ArrayList<Double> listeprixcom5 = new ArrayList();
	public static ArrayList<Double> listeprixcom6 = new ArrayList();
	public static ArrayList<Double> listeprixcom7 = new ArrayList();
	public static ArrayList<Double> listeprixcom8 = new ArrayList();
	public static ArrayList<Double> listeprixcom9 = new ArrayList();
	public static ArrayList<Double> listeprixcom10 = new ArrayList();
	public static ArrayList<Integer> listeemprunt1 = new ArrayList();//liste des id produits en emprunt
	public static ArrayList<Integer> listeemprunt2 = new ArrayList();
	public static ArrayList<Integer> listeemprunt3 = new ArrayList();
	public static ArrayList<Integer> listeemprunt4 = new ArrayList();
	public static ArrayList<Integer> listeemprunt5 = new ArrayList();
	public static ArrayList<Integer> listeemprunt6 = new ArrayList();
	public static ArrayList<Integer> listeemprunt7 = new ArrayList();
	public static ArrayList<Integer> listeemprunt8 = new ArrayList();
	public static ArrayList<Integer> listeemprunt9 = new ArrayList();
	public static ArrayList<Integer> listeemprunt10 = new ArrayList();
	}
	



