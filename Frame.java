package ProjetJavav2;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.ComponentOrientation;

public class Frame {
	/*                               _       _     _                 _             _                    
	  | |                           (_)     | |   | |               | |           | |                   
	  | | ___  ___  __   ____ _ _ __ _  __ _| |__ | | ___  ___    __| | ___    ___| | __ _ ___ ___  ___ 
	  | |/ _ \/ __| \ \ / / _` | '__| |/ _` | '_ \| |/ _ \/ __|  / _` |/ _ \  / __| |/ _` / __/ __|/ _ \
	  | |  __/\__ \  \ V / (_| | |  | | (_| | |_) | |  __/\__ \ | (_| |  __/ | (__| | (_| \__ \__ \  __/
	  |_|\___||___/   \_/ \__,_|_|  |_|\__,_|_.__/|_|\___||___/  \__,_|\___|  \___|_|\__,_|___/___/\___|*/
	                                                                                                    
	private JFrame frmVidéothèque;
	private JTextField textFieldPrenom;
	private JTextField textFieldNom;
	private JTextField textFieldTitre;
	private JTextField textFieldTarif;
	private JTextField textFieldAuteur;
	private JTextField textFieldLangue;
	private JTextField textFieldAnnee;
	private JTextField textFieldRealisateur;
	private JTextField textFieldDuree;

/*	   _                                               _   
	  | |                                             | |  
	  | |     __ _ _ __   ___ ___ _ __ ___   ___ _ __ | |_ 
	  | |    / _` | '_ \ / __/ _ \ '_ ` _ \ / _ \ '_ \| __|
	  | |___| (_| | | | | (_|  __/ | | | | |  __/ | | | |_ 
	  |______\__,_|_| |_|\___\___|_| |_| |_|\___|_| |_|\__|*/
	                                                       
	                                                       
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frmVidéothèque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

/*	    _____       __       _   _             
	   / ____|     /_/      | | (_)            
	  | |     _ __ ___  __ _| |_ _  ___  _ __  
	  | |    | '__/ _ \/ _` | __| |/ _ \| '_ \ 
	  | |____| | |  __/ (_| | |_| | (_) | | | |
	   \_____|_|  \___|\__,_|\__|_|\___/|_| |_|*/
	                                           
	                                           
	public Frame() {
		initialize();
	}

/*	   _____       _ _   _       _ _           _   _             
	  |_   _|     (_) | (_)     | (_)         | | (_)            
	    | |  _ __  _| |_ _  __ _| |_ ___  __ _| |_ _  ___  _ __  
	    | | | '_ \| | __| |/ _` | | / __|/ _` | __| |/ _ \| '_ \ 
	   _| |_| | | | | |_| | (_| | | \__ \ (_| | |_| | (_) | | | |
	  |_____|_| |_|_|\__|_|\__,_|_|_|___/\__,_|\__|_|\___/|_| |_|*/
	
	private void initialize() {
		frmVidéothèque = new JFrame();
		frmVidéothèque.setResizable(false);
		frmVidéothèque.getContentPane().setFont(new Font("Rockwell", Font.PLAIN, 16));
		frmVidéothèque.setFont(new Font("Rockwell", Font.PLAIN, 16));
		frmVidéothèque.setTitle("Vid\u00E9oth\u00E8que");
		frmVidéothèque.setBounds(100, 100, 622, 652);
		frmVidéothèque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVidéothèque.getContentPane().setLayout(null);
		
		
		/*  ____  _     _      _          _____ _ _            _   
		   / __ \| |   (_)    | |        / ____| (_)          | |  
		  | |  | | |__  _  ___| |_ ___  | |    | |_  ___ _ __ | |_ 
		  | |  | | '_ \| |/ _ \ __/ __| | |    | | |/ _ \ '_ \| __|
		  | |__| | |_) | |  __/ |_\__ \ | |____| | |  __/ | | | |_ 
		   \____/|_.__/| |\___|\__|___/  \_____|_|_|\___|_| |_|\__|
		              _/ |                                         
		             |__/  */                                        
		
		
		JPanel panelClient = new JPanel();
		panelClient.setVisible(false);
		panelClient.setOpaque(false);
		JLabel labelClient = new JLabel("Client");
		labelClient.setForeground(Color.WHITE);
		labelClient.setFont(new Font("Rockwell", Font.PLAIN, 60));
		labelClient.setHorizontalTextPosition(SwingConstants.CENTER);
		labelClient.setHorizontalAlignment(SwingConstants.CENTER);
		labelClient.setBounds(30, 32, 228, 68);
		panelClient.add(labelClient);
		
		JList listClient = new JList();
		listClient.setForeground(Color.WHITE);
		listClient.setBackground(Color.GRAY);
		listClient.setFont(new Font("Rockwell", Font.PLAIN, 15));
		listClient.setBounds(40, 117, 545, 260);
		panelClient.add(listClient);
		listClient.setAutoscrolls(false);
		listClient.setAutoscrolls(false);
		
		
		JPanel panelAjouterClient = new JPanel();
		panelAjouterClient.setVisible(false);
		panelAjouterClient.setOpaque(false);
		panelAjouterClient.setBounds(20, 405, 600, 215);
		panelClient.add(panelAjouterClient);
		panelAjouterClient.setLayout(null);
		JButton btnAjouterClient = new JButton("");
		btnAjouterClient.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/adressbook-add-user-icon.png")));
		btnAjouterClient.setContentAreaFilled(false);
		btnAjouterClient.setBorderPainted(false);
		btnAjouterClient.setFont(new Font("Rockwell", Font.PLAIN, 15));
		
		btnAjouterClient.setBounds(285, 38, 68, 68);
		panelClient.add(btnAjouterClient);
		
		JLabel lblprénom = new JLabel("Pr\u00E9nom :");
		lblprénom.setForeground(Color.ORANGE);
		lblprénom.setFont(new Font("Rockwell", Font.PLAIN, 25));
		lblprénom.setBounds(85, 50, 118, 27);
		panelAjouterClient.add(lblprénom);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setForeground(Color.ORANGE);
		lblNom.setFont(new Font("Rockwell", Font.PLAIN, 25));
		lblNom.setBounds(85, 98, 99, 27);
		panelAjouterClient.add(lblNom);
		
		JRadioButton rdbtnFidele = new JRadioButton("Client Fid\u00E8le");
		rdbtnFidele.setForeground(Color.ORANGE);
		rdbtnFidele.setOpaque(false);
		rdbtnFidele.setFont(new Font("Rockwell", Font.PLAIN, 25));
		rdbtnFidele.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		rdbtnFidele.setBounds(51, 150, 201, 21);
		panelAjouterClient.add(rdbtnFidele);
		
		JButton btnokClient = new JButton("");
		btnokClient.setContentAreaFilled(false);
		btnokClient.setBorderPainted(false);
		btnokClient.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/Accept-icon.png")));
		btnokClient.setBounds(318, 136, 64, 64);
		panelAjouterClient.add(btnokClient);
		
		JLabel addclientlabel = new JLabel("Entrez les informations du Client");
		addclientlabel.setForeground(Color.ORANGE);
		addclientlabel.setFont(new Font("Rockwell", Font.PLAIN, 25));
		addclientlabel.setBounds(0, 0, 450, 33);
		panelAjouterClient.add(addclientlabel);
		addclientlabel.setHorizontalTextPosition(SwingConstants.CENTER);
		addclientlabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnSupprimerClient = new JButton("");
		btnSupprimerClient.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/121113.png")));
		btnSupprimerClient.setContentAreaFilled(false);
		btnSupprimerClient.setBorderPainted(false);
		btnSupprimerClient.setFont(new Font("Rockwell", Font.PLAIN, 15));
		btnSupprimerClient.setEnabled(false);
		btnSupprimerClient.setBounds(378, 38, 68, 68);
		panelClient.add(btnSupprimerClient);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setBackground(Color.GRAY);
		textFieldPrenom.setForeground(Color.WHITE);
		textFieldPrenom.setFont(new Font("Rockwell", Font.PLAIN, 25));
		textFieldPrenom.setBounds(232, 44, 195, 33);
		panelAjouterClient.add(textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		textFieldNom = new JTextField();
		textFieldNom.setBackground(Color.GRAY);
		textFieldNom.setForeground(Color.WHITE);
		textFieldNom.setFont(new Font("Rockwell", Font.PLAIN, 25));
		textFieldNom.setColumns(10);
		textFieldNom.setBounds(232, 92, 195, 33);
		panelAjouterClient.add(textFieldNom);
		
		
		
		
		
	/*	
		    ____  _     _      _         _____               _       _ _   
		   / __ \| |   (_)    | |       |  __ \             | |     (_) |  
		  | |  | | |__  _  ___| |_ ___  | |__) | __ ___   __| |_   _ _| |_ 
		  | |  | | '_ \| |/ _ \ __/ __| |  ___/ '__/ _ \ / _` | | | | | __|
		  | |__| | |_) | |  __/ |_\__ \ | |   | | | (_) | (_| | |_| | | |_ 
		   \____/|_.__/| |\___|\__|___/ |_|   |_|  \___/ \__,_|\__,_|_|\__|
		              _/ |                                                 
		             |__/                                       */
		
		
		JPanel panelProduit = new JPanel();
		panelProduit.setVisible(false);
		panelProduit.setOpaque(false);
		panelProduit.setFont(new Font("Rockwell", Font.PLAIN, 16));
		panelProduit.setBounds(0, 0, 620, 620);
		frmVidéothèque.getContentPane().add(panelProduit);
		panelProduit.setLayout(null);
		
		
		JLabel labelProduit = new JLabel("Produit");
		labelProduit.setForeground(Color.WHITE);
		labelProduit.setFont(new Font("Rockwell", Font.PLAIN, 60));
		labelProduit.setHorizontalTextPosition(SwingConstants.CENTER);
		labelProduit.setHorizontalAlignment(SwingConstants.CENTER);
		labelProduit.setBounds(276, 32, 228, 68);
		panelProduit.add(labelProduit);
		JComboBox comboBoxProduit = new JComboBox();
		comboBoxProduit.setForeground(Color.BLACK);
		comboBoxProduit.setBackground(Color.GRAY);
		comboBoxProduit.setFont(new Font("Rockwell", Font.PLAIN, 13));
		comboBoxProduit.setModel(new DefaultComboBoxModel(new String[] {"Selectionnez", "Roman", "Manuel", "BD", "Dictionnaire", "CD", "DVD"}));
		comboBoxProduit.setMaximumRowCount(6);
		comboBoxProduit.setToolTipText("");
		comboBoxProduit.setName("");
		comboBoxProduit.setBounds(10, 56, 100, 21);
		panelProduit.add(comboBoxProduit);
		
		JButton btnSupprimerProduit = new JButton("");
		btnSupprimerProduit.setBorderPainted(false);
		btnSupprimerProduit.setContentAreaFilled(false);
		btnSupprimerProduit.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/121113.png")));
		btnSupprimerProduit.setEnabled(false);
		btnSupprimerProduit.setBounds(198, 32, 68, 68);
		panelProduit.add(btnSupprimerProduit);
		
		JList listProduit = new JList();
		listProduit.setForeground(Color.WHITE);
		listProduit.setBackground(Color.GRAY);
		listProduit.setFont(new Font("Rockwell", Font.PLAIN, 15));
		listProduit.setAutoscrolls(false);
		listProduit.setBounds(43, 111, 328, 250);
		panelProduit.add(listProduit);
		JButton btnAjouterProduit = new JButton("");
		btnAjouterProduit.setBorderPainted(false);
		btnAjouterProduit.setContentAreaFilled(false);
		btnAjouterProduit.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/Actions-list-add-icon.png")));
		btnAjouterProduit.setBounds(120, 32, 68, 68);
		panelProduit.add(btnAjouterProduit);
		
		JList listProduitdispo = new JList();
		listProduitdispo.setForeground(Color.WHITE);
		listProduitdispo.setBackground(Color.GRAY);
		listProduitdispo.setFont(new Font("Rockwell", Font.PLAIN, 15));
		listProduitdispo.setAutoscrolls(false);
		listProduitdispo.setBounds(243, 401, 356, 178);
		panelProduit.add(listProduitdispo);

		JRadioButton rdbtnProduitdispo = new JRadioButton("Dispo");
		rdbtnProduitdispo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		rdbtnProduitdispo.setForeground(Color.ORANGE);
		rdbtnProduitdispo.setContentAreaFilled(false);
		rdbtnProduitdispo.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnProduitdispo.setFont(new Font("Rockwell", Font.PLAIN, 16));
		rdbtnProduitdispo.setBounds(26, 534, 132, 21);
		panelProduit.add(rdbtnProduitdispo);
		
		JRadioButton rdbtnProduitnondispo = new JRadioButton("Non dispo");
		rdbtnProduitnondispo.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		rdbtnProduitnondispo.setForeground(Color.ORANGE);
		rdbtnProduitnondispo.setContentAreaFilled(false);
		rdbtnProduitnondispo.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnProduitnondispo.setFont(new Font("Rockwell", Font.PLAIN, 16));
		rdbtnProduitnondispo.setBounds(26, 558, 132, 21);
		panelProduit.add(rdbtnProduitnondispo);
		
		JButton btnValiderDispo = new JButton("");
		btnValiderDispo.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/Search-icon.png")));
		btnValiderDispo.setContentAreaFilled(false);
		btnValiderDispo.setBorderPainted(false);
		btnValiderDispo.setOpaque(false);
		btnValiderDispo.setBounds(166, 531, 48, 48);
		panelProduit.add(btnValiderDispo);
		
		
		JComboBox comboBoxTypeprod = new JComboBox();
		comboBoxTypeprod.setFont(new Font("Rockwell", Font.PLAIN, 11));
		comboBoxTypeprod.setModel(new DefaultComboBoxModel(new String[] {"S\u00E9lectionnez", "Roman", "Manuel", "BD", "Dictionnaire", "CD", "DVD"}));
		comboBoxTypeprod.setToolTipText("");
		comboBoxTypeprod.setName("");
		comboBoxTypeprod.setMaximumRowCount(6);
		comboBoxTypeprod.setBounds(41, 447, 117, 35);
		panelProduit.add(comboBoxTypeprod);
		
		JLabel labelNombre = new JLabel("Nombre de produit:");
		labelNombre.setForeground(Color.ORANGE);
		labelNombre.setFont(new Font("Rockwell", Font.PLAIN, 14));
		labelNombre.setBounds(43, 493, 186, 22);
		panelProduit.add(labelNombre);
		JButton btnOK = new JButton("");
		btnOK.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/Analytics-icon.png")));
		btnOK.setContentAreaFilled(false);
		btnOK.setBorderPainted(false);
		btnOK.setOpaque(false);
		btnOK.setBounds(166, 446, 48, 48);
		panelProduit.add(btnOK);
		
		JButton btnAjouterCommande = new JButton("");
		btnAjouterCommande.setContentAreaFilled(false);
		btnAjouterCommande.setBorderPainted(false);
		btnAjouterCommande.setOpaque(false);
		btnAjouterCommande.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/add-item-icon.png")));
		
		JLabel labelPrix = new JLabel("");
		labelPrix.setForeground(Color.WHITE);
		labelPrix.setFont(new Font("Rockwell", Font.PLAIN, 20));
		labelPrix.setBounds(29, 376, 506, 59);
		labelPrix.setHorizontalTextPosition(SwingConstants.LEFT);
		labelPrix.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		JPanel panelAjouterProduit = new JPanel();
		panelAjouterProduit.setBounds(381, 111, 228, 267);
		panelProduit.add(panelAjouterProduit);
		panelAjouterProduit.setForeground(Color.ORANGE);
		panelAjouterProduit.setBackground(Color.GRAY);
		panelAjouterProduit.setVisible(false);
		panelAjouterProduit.setLayout(null);
		JLabel lblEntrezLesInformations = new JLabel("Entrez les informations du Produit");
		lblEntrezLesInformations.setFont(new Font("Rockwell", Font.PLAIN, 11));
		lblEntrezLesInformations.setBounds(-57, 5, 356, 21);
		lblEntrezLesInformations.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEntrezLesInformations.setHorizontalAlignment(SwingConstants.CENTER);
		panelAjouterProduit.add(lblEntrezLesInformations);
		JLabel lblTitre = new JLabel("Titre :");
		lblTitre.setForeground(Color.ORANGE);
		lblTitre.setFont(new Font("Rockwell", Font.PLAIN, 15));
		lblTitre.setBounds(0, 37, 56, 13);
		panelAjouterProduit.add(lblTitre);
		
		JLabel lblTarif = new JLabel("Tarif :");
		lblTarif.setForeground(Color.ORANGE);
		lblTarif.setFont(new Font("Rockwell", Font.PLAIN, 15));
		lblTarif.setBounds(0, 65, 96, 13);
		panelAjouterProduit.add(lblTarif);
		
		JLabel labelAuteur = new JLabel("Auteur :");
		labelAuteur.setForeground(Color.ORANGE);
		labelAuteur.setFont(new Font("Rockwell", Font.PLAIN, 15));
		labelAuteur.setEnabled(false);
		labelAuteur.setBounds(0, 109, 56, 13);
		panelAjouterProduit.add(labelAuteur);
		
		JLabel labelLangue = new JLabel("Langue :");
		labelLangue.setForeground(Color.ORANGE);
		labelLangue.setFont(new Font("Rockwell", Font.PLAIN, 15));
		labelLangue.setEnabled(false);
		labelLangue.setBounds(0, 134, 81, 13);
		panelAjouterProduit.add(labelLangue);
		
		JLabel labelAnnee = new JLabel("Ann\u00E9e :");
		labelAnnee.setForeground(Color.ORANGE);
		labelAnnee.setFont(new Font("Rockwell", Font.PLAIN, 15));
		labelAnnee.setEnabled(false);
		labelAnnee.setBounds(0, 80, 64, 18);
		panelAjouterProduit.add(labelAnnee);
		
		JLabel labelRealisateur = new JLabel("R\u00E9alisateur :");
		labelRealisateur.setForeground(Color.ORANGE);
		labelRealisateur.setFont(new Font("Rockwell", Font.PLAIN, 15));
		labelRealisateur.setEnabled(false);
		labelRealisateur.setBounds(0, 158, 96, 13);
		panelAjouterProduit.add(labelRealisateur);
		
		JButton button = new JButton("");
		button.setBorderPainted(false);
		button.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/Accept-icon.png")));
		button.setContentAreaFilled(false);
		button.setBounds(101, 185, 64, 64);
		panelAjouterProduit.add(button);
		

		textFieldTitre = new JTextField();
		textFieldTitre.setBorder(null);
		textFieldTitre.setFont(new Font("Rockwell", Font.PLAIN, 11));
		textFieldTitre.setColumns(10);
		textFieldTitre.setBounds(91, 32, 96, 19);
		panelAjouterProduit.add(textFieldTitre);
		
		
		textFieldTarif = new JTextField();
		textFieldTarif.setBorder(null);
		textFieldTarif.setFont(new Font("Rockwell", Font.PLAIN, 11));
		textFieldTarif.setColumns(10);
		textFieldTarif.setBounds(91, 59, 96, 19);
		panelAjouterProduit.add(textFieldTarif);
		
		
		
		textFieldAuteur = new JTextField();
		textFieldAuteur.setBorder(null);
		textFieldAuteur.setFont(new Font("Rockwell", Font.PLAIN, 11));
		textFieldAuteur.setEnabled(false);
		textFieldAuteur.setAutoscrolls(false);
		textFieldAuteur.setColumns(10);
		textFieldAuteur.setBounds(91, 104, 96, 19);
		panelAjouterProduit.add(textFieldAuteur);
		
		textFieldLangue = new JTextField();
		textFieldLangue.setBorder(null);
		textFieldLangue.setFont(new Font("Rockwell", Font.PLAIN, 11));
		textFieldLangue.setEnabled(false);
		textFieldLangue.setColumns(10);
		textFieldLangue.setAutoscrolls(false);
		textFieldLangue.setBounds(91, 128, 96, 19);
		panelAjouterProduit.add(textFieldLangue);
		
		
		textFieldAnnee = new JTextField();
		textFieldAnnee.setBorder(null);
		textFieldAnnee.setFont(new Font("Rockwell", Font.PLAIN, 11));
		textFieldAnnee.setEnabled(false);
		textFieldAnnee.setColumns(10);
		textFieldAnnee.setAutoscrolls(false);
		textFieldAnnee.setBounds(91, 82, 96, 19);
		panelAjouterProduit.add(textFieldAnnee);
		
		
		
		textFieldRealisateur = new JTextField();
		textFieldRealisateur.setBorder(null);
		textFieldRealisateur.setFont(new Font("Rockwell", Font.PLAIN, 11));
		textFieldRealisateur.setEnabled(false);
		textFieldRealisateur.setColumns(10);
		textFieldRealisateur.setAutoscrolls(false);
		textFieldRealisateur.setBounds(91, 155, 96, 19);
		panelAjouterProduit.add(textFieldRealisateur);
		
		JButton btnPhome = new JButton("");
		btnPhome.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/Home-icon.png")));
		btnPhome.setContentAreaFilled(false);
		btnPhome.setBorderPainted(false);
		btnPhome.setBounds(515, 36, 64, 64);
		panelProduit.add(btnPhome);
		
		
/*		    ____  _     _      _          _____                                          _      
		   / __ \| |   (_)    | |        / ____|                                        | |     
		  | |  | | |__  _  ___| |_ ___  | |     ___  _ __ ___  _ __ ___   __ _ _ __   __| | ___ 
		  | |  | | '_ \| |/ _ \ __/ __| | |    / _ \| '_ ` _ \| '_ ` _ \ / _` | '_ \ / _` |/ _ \
		  | |__| | |_) | |  __/ |_\__ \ | |___| (_) | | | | | | | | | | | (_| | | | | (_| |  __/
		   \____/|_.__/| |\___|\__|___/  \_____\___/|_| |_| |_|_| |_| |_|\__,_|_| |_|\__,_|\___|
		              _/ |                                                                      
		             |__/                   */
		
		JPanel panelComande = new JPanel();
		panelComande.setOpaque(false);
		panelComande.add(labelPrix);
		panelComande.setBounds(618, 0, 598, 420);
		frmVidéothèque.getContentPane().add(panelComande);
		panelComande.setLayout(null);
		
		JLabel labelCommande = new JLabel("Commande");
		labelCommande.setForeground(Color.WHITE);
		labelCommande.setFont(new Font("Rockwell", Font.PLAIN, 60));
		labelCommande.setBounds(153, 44, 520, 62);
		labelCommande.setHorizontalTextPosition(SwingConstants.CENTER);
		labelCommande.setHorizontalAlignment(SwingConstants.CENTER);
		panelComande.add(labelCommande);
		
		
		JList listCommande = new JList();
		listCommande.setBackground(Color.GRAY);
		listCommande.setForeground(Color.WHITE);
		listCommande.setFont(new Font("Rockwell", Font.PLAIN, 15));
		listCommande.setAutoscrolls(false);
		listCommande.setBounds(29, 117, 530, 260);
		panelComande.add(listCommande);
		
		JButton btnclhome = new JButton("");	
		btnclhome.setBounds(514, 35, 64, 64);
		panelClient.add(btnclhome);
		btnclhome.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/Home-icon.png")));
		btnclhome.setContentAreaFilled(false);
		btnclhome.setBorderPainted(false);
		btnAjouterCommande.setEnabled(false);
		btnAjouterCommande.setBounds(97, 42, 64, 64);
		panelComande.add(btnAjouterCommande);
		
		JButton btnAfficherCommande = new JButton("");
		btnAfficherCommande.setContentAreaFilled(false);
		btnAfficherCommande.setBorderPainted(false);
		btnAfficherCommande.setOpaque(false);
		btnAfficherCommande.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/Programming-Show-Property-icon.png")));
		btnAfficherCommande.setBounds(181, 55, 64, 64);
		panelComande.add(btnAfficherCommande);	
		btnAfficherCommande.setEnabled(false);
	/*	   __  __           _      _                                _ _     _       
		  |  \/  |         | |    | |                              | (_)   | |      
		  | \  / | ___   __| | ___| |___   _ __   ___  _   _ _ __  | |_ ___| |_ ___ 
		  | |\/| |/ _ \ / _` |/ _ \ / __| | '_ \ / _ \| | | | '__| | | / __| __/ _ \
		  | |  | | (_) | (_| |  __/ \__ \ | |_) | (_) | |_| | |    | | \__ \ ||  __/
		  |_|  |_|\___/ \__,_|\___|_|___/ | .__/ \___/ \__,_|_|    |_|_|___/\__\___|
		                                  | |                                       
		                                  |_|                      */
		
		
		DefaultListModel modelClient =new DefaultListModel();
		listClient.setModel(modelClient);
		
		DefaultListModel modelProduit =new DefaultListModel();
		listProduit.setModel(modelProduit);
		
		DefaultListModel modelCommande =new DefaultListModel();
		listCommande.setModel(modelCommande);
		
		DefaultListModel modelEmprunt =new DefaultListModel();
		
		DefaultListModel modelProduitdispo =new DefaultListModel();
		listProduitdispo.setModel(modelProduitdispo);
		
		
		
		
		

		
	   /*  ____  _     _      _         __  __                  
  		  / __ \| |   (_)    | |       |  \/  |                 
   		 | |  | | |__  _  ___| |_ ___  | \  / | ___ _ __  _   _ 
 		 | |  | | '_ \| |/ _ \ __/ __| | |\/| |/ _ \ '_ \| | | |
 		 | |__| | |_) | |  __/ |_\__ \ | |  | |  __/ | | | |_| |
  		  \____/|_.__/| |\___|\__|___/ |_|  |_|\___|_| |_|\__,_|
             	     _/ |                                       
            		|__/ */                                       
		
		
		JPanel panelMenu = new JPanel();
		panelMenu.setOpaque(false);
		panelMenu.setBounds(0, 0, 620, 620);
		frmVidéothèque.getContentPane().add(panelMenu);
		panelMenu.setLayout(null);
		
		JButton btnclient = new JButton("");
		btnclient.setBorderPainted(false);
		btnclient.setContentAreaFilled(false);
		btnclient.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/cl128.png")));
		btnclient.setBounds(new Rectangle(0, 0, 128, 128));
		btnclient.setBounds(433, 246, 128, 128);
		panelMenu.add(btnclient);
		
		
		JButton btncom = new JButton("");
		btncom.setBorderPainted(false);
		btncom.setContentAreaFilled(false);
		btncom.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/com128.png")));
		btncom.setBounds(new Rectangle(0, 0, 128, 128));
		btncom.setBounds(246, 246, 128, 128);
		panelMenu.add(btncom);
		
		JButton btnprod = new JButton("");
		btnprod.setBorderPainted(false);
		panelClient.setBounds(0, 0, 620, 620);
		frmVidéothèque.getContentPane().add(panelClient);
		panelClient.setLayout(null);
		btnprod.setContentAreaFilled(false);
		btnprod.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/prod128.png")));
		btnprod.setBounds(new Rectangle(0, 0, 128, 128));
		btnprod.setBounds(70, 246, 128, 128);
		panelMenu.add(btnprod);
		
	
		
		
		
		
	
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Mon gestionnaire de vid\u00E9oth\u00E8que");
		lblNewLabel_3.setFont(new Font("Rockwell", Font.PLAIN, 37));
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 0, 610, 197);
		panelMenu.add(lblNewLabel_3);
		
		
		
		
	   /*   ____  _     _      _         ______                                  _   
		   / __ \| |   (_)    | |       |  ____|                                | |  
		  | |  | | |__  _  ___| |_ ___  | |__   _ __ ___  _ __  _ __ _   _ _ __ | |_ 
		  | |  | | '_ \| |/ _ \ __/ __| |  __| | '_ ` _ \| '_ \| '__| | | | '_ \| __|
		  | |__| | |_) | |  __/ |_\__ \ | |____| | | | | | |_) | |  | |_| | | | | |_ 
		   \____/|_.__/| |\___|\__|___/ |______|_| |_| |_| .__/|_|   \__,_|_| |_|\__|
		              _/ |                               | |                         
		             |__/                                |_|  */                       
		
		
		
		JPanel panelEmprunt = new JPanel();
		panelEmprunt.setOpaque(false);
		panelEmprunt.setBounds(630, 420, 670, 387);
		frmVidéothèque.getContentPane().add(panelEmprunt);
		
		JLabel lblEmprunt = new JLabel("Emprunt");
		lblEmprunt.setForeground(Color.WHITE);
		lblEmprunt.setFont(new Font("Rockwell", Font.PLAIN, 60));
		lblEmprunt.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEmprunt.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmprunt.setBounds(36, 11, 286, 76);
		panelEmprunt.add(lblEmprunt);
		
		JPanel panelAjouterEmprunt = new JPanel();
		panelAjouterEmprunt.setOpaque(false);
		JButton btnValiderEmprunt = new JButton("Valider");
		btnValiderEmprunt.setEnabled(false);
		btnValiderEmprunt.setBounds(482, 7, 85, 21);
		panelAjouterEmprunt.add(btnValiderEmprunt);
		
		JButton btnAjouterEmprunt = new JButton("");
		btnAjouterEmprunt.setContentAreaFilled(false);
		btnAjouterEmprunt.setBorderPainted(false);
		btnAjouterEmprunt.setOpaque(false);
		btnAjouterEmprunt.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/shop-cart-add-icon.png")));
		panelAjouterEmprunt.setVisible(false);
		panelAjouterEmprunt.setBounds(10, 322, 650, 39);
		panelEmprunt.add(panelAjouterEmprunt);
		panelAjouterEmprunt.setLayout(null);
		btnAjouterEmprunt.setEnabled(false);
		btnAjouterEmprunt.setBounds(366, 36, 64, 64);
		panelEmprunt.add(btnAjouterEmprunt);
		
		JButton btnSupprimerEmprunt = new JButton("");
		btnSupprimerEmprunt.setContentAreaFilled(false);
		btnSupprimerEmprunt.setBorderPainted(false);
		btnSupprimerEmprunt.setOpaque(false);
		btnSupprimerEmprunt.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/shop-cart-exclude-icon.png")));
		btnSupprimerEmprunt.setEnabled(false);
		btnSupprimerEmprunt.setBounds(456, 36, 64, 64);
		panelEmprunt.add(btnSupprimerEmprunt);
		
		
		JList listEmprunt = new JList();
		listEmprunt.setBackground(Color.GRAY);
		listEmprunt.setForeground(Color.WHITE);
		listEmprunt.setFont(new Font("Rockwell", Font.PLAIN, 15));
		listEmprunt.setModel(modelEmprunt);
		panelEmprunt.setLayout(null);
		listEmprunt.setAutoscrolls(false);
		listEmprunt.setBounds(25, 111, 541, 200);
		panelEmprunt.add(listEmprunt);
		
		
		JLabel lblNewLabel = new JLabel("S\u00E9lectionnez un produit");
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 15));
		lblNewLabel.setBounds(24, 9, 179, 17);
		panelAjouterEmprunt.add(lblNewLabel);
		
		JLabel labelDuree = new JLabel("Dur\u00E9e :");
		labelDuree.setFont(new Font("Rockwell", Font.PLAIN, 15));
		labelDuree.setBounds(294, 9, 60, 18);
		panelAjouterEmprunt.add(labelDuree);
		labelDuree.setHorizontalTextPosition(SwingConstants.LEFT);
		labelDuree.setHorizontalAlignment(SwingConstants.LEFT);
		
		textFieldDuree = new JTextField();
		textFieldDuree.setFont(new Font("Rockwell", Font.PLAIN, 15));
		textFieldDuree.setBounds(364, 9, 96, 19);
		panelAjouterEmprunt.add(textFieldDuree);
		textFieldDuree.setColumns(10);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Frame.class.getResource("/ProjetJavav2/Img/html-color-codes-color-tutorials-903ea3cb.jpg")));
		lblNewLabel_5.setBounds(0, 0, 1226, 807);
		frmVidéothèque.getContentPane().add(lblNewLabel_5);
		
		
		
		
		
		
		
		
		
		
		
		/*  __         __                                 _          __  __                  
		  _/_/_       /_/                                | |        |  \/  |                 
		 | ____|_   _____ _ __   ___ _ __ ___   ___ _ __ | |_ ___   | \  / | ___ _ __  _   _ 
		 |  _| \ \ / / _ \ '_ \ / _ \ '_ ` _ \ / _ \ '_ \| __/ __|  | |\/| |/ _ \ '_ \| | | |
		 | |___ \ V /  __/ | | |  __/ | | | | |  __/ | | | |_\__ \  | |  | |  __/ | | | |_| |
		 |_____| \_/ \___|_| |_|\___|_| |_| |_|\___|_| |_|\__|___/  |_|  |_|\___|_| |_|\__,_|*/
		
		
		btnclient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelClient.setVisible(true);
				panelMenu.setVisible(false);
				btnAjouterClient.setVisible(true);
				btnSupprimerClient.setVisible(true);
			}
		});
		
		btncom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmVidéothèque.setBounds(100, 100, 1240, 842);
				panelClient.setVisible(true);
				panelAjouterClient.setVisible(false);
				panelMenu.setVisible(false);
				panelProduit.setVisible(true);
				panelProduit.setBounds(0, 420,620,620);
				btnAjouterClient.setVisible(false);
				btnSupprimerClient.setVisible(false);
				btnAjouterProduit.setVisible(false);
				btnSupprimerProduit.setVisible(false);
				comboBoxTypeprod.setVisible(false);
				comboBoxProduit.setVisible(false);
				btnPhome.setVisible(false);
				labelProduit.setBounds(32, 32, 228, 68);
				listProduit.setBounds(43, 111, 545, 250);
			}
		});
                   
		
		btnprod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelProduit.setVisible(true);
				panelProduit.setBounds(0, 0, 640, 640);
				btnAjouterProduit.setVisible(true);
				btnSupprimerProduit.setVisible(true);
				comboBoxTypeprod.setVisible(true);
				comboBoxProduit.setVisible(true);
				btnPhome.setVisible(true);
				labelProduit.setBounds(276, 32, 228, 68);
				listProduit.setBounds(43, 111, 328, 250);
				
			}
		});
                                                                                   
	/*	
	       __         __                                 _         ______                 z                 _   
	     _/_/_       /_/                                | |       |  ____|                                | |  
	    | ____|_   _____ _ __   ___ _ __ ___   ___ _ __ | |_ ___  | |__   _ __ ___  _ __  _ __ _   _ _ __ | |_ 
	    |  _| \ \ / / _ \ '_ \ / _ \ '_ ` _ \ / _ \ '_ \| __/ __| |  __| | '_ ` _ \| '_ \| '__| | | | '_ \| __|
	    | |___ \ V /  __/ | | |  __/ | | | | |  __/ | | | |_\__ \ | |____| | | | | | |_) | |  | |_| | | | | |_ 
	    |_____| \_/ \___|_| |_|\___|_| |_| |_|\___|_| |_|\__|___/ |______|_| |_| |_| .__/|_|   \__,_|_| |_|\__|
	                                                                               | |                         
	                                                                               |_|                 */        
		
		btnAjouterEmprunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAjouterEmprunt.setVisible(true);
			}
		});
		
		btnSupprimerEmprunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 1) {
						Main.listecommande1.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom1.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt1.remove(Main.listeemprunt1.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 2) {
						Main.listecommande2.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom2.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt2.remove(Main.listeemprunt2.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 3) {
						Main.listecommande3.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom3.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt3.remove(Main.listeemprunt3.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 4) {
						Main.listecommande4.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom4.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt4.remove(Main.listeemprunt4.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 5) {
						Main.listecommande5.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom5.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt5.remove(Main.listeemprunt5.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 6) {
						Main.listecommande6.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom6.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt6.remove(Main.listeemprunt6.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 7) {
						Main.listecommande7.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom7.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt7.remove(Main.listeemprunt7.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 8) {
						Main.listecommande8.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom8.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt8.remove(Main.listeemprunt8.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 9) {
						Main.listecommande9.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom9.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt9.remove(Main.listeemprunt9.get(listEmprunt.getSelectedIndex()));
					}
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 10) {
						Main.listecommande10.remove(listEmprunt.getSelectedIndex());
						Main.listeprixcom10.remove(listEmprunt.getSelectedIndex());
						Main.listeemprunt10.remove(Main.listeemprunt10.get(listEmprunt.getSelectedIndex()));
					}
					
					modelEmprunt.remove(listEmprunt.getSelectedIndex());
					labelPrix.setText("");
					btnSupprimerEmprunt.setEnabled(false);
			}
			
		});
		
		listEmprunt.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				btnSupprimerEmprunt.setEnabled(true);
			}
		});
		
		btnValiderEmprunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(Main.listeemprunt1.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt2.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt3.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt4.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt5.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt6.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt7.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt8.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt9.contains(Main.listeproduit.get(listProduit.getSelectedIndex()))) && !(Main.listeemprunt10.contains(Main.listeproduit.get(listProduit.getSelectedIndex())))){
					double tarif = Main.mapPrix.get(Main.listeproduit.get(listProduit.getSelectedIndex())) ;
					int duree = Integer.parseInt(textFieldDuree.getText());
					Emprunt empr = new Emprunt(duree);
					modelEmprunt.addElement("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 1) {
						Main.listecommande1.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom1.add(tarif*duree);
						Main.listeemprunt1.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 2) {
						Main.listecommande2.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom2.add(tarif*duree);
						Main.listeemprunt2.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 3) {
						Main.listecommande3.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom3.add(tarif*duree);
						Main.listeemprunt3.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 4) {
						Main.listecommande4.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom4.add(tarif*duree);
						Main.listeemprunt4.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 5) {
						Main.listecommande5.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom5.add(tarif*duree);
						Main.listeemprunt5.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 6) {
						Main.listecommande6.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom6.add(tarif*duree);
						Main.listeemprunt6.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 7) {
						Main.listecommande7.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom7.add(tarif*duree);
						Main.listeemprunt7.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 8) {
						Main.listecommande8.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom8.add(tarif*duree);
						Main.listeemprunt8.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 9) {
						Main.listecommande9.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom9.add(tarif*duree);
						Main.listeemprunt9.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					if(Main.listecommande.get(listCommande.getSelectedIndex()) == 10) {
						Main.listecommande10.add("Commande: " + Main.listecommande.get(listCommande.getSelectedIndex()) + " Produit: " + Main.listeproduit.get(listProduit.getSelectedIndex()) + " ID: " + Main.idemprunt + " Date de début: " + empr.getDatedebut() + " Date de fin: " + empr.getDatefin() + " Tarif: " + tarif);
						Main.listeprixcom10.add(tarif*duree);
						Main.listeemprunt10.add((Integer) Main.listeproduit.get(listProduit.getSelectedIndex()));
					}
					
					labelPrix.setText("");
				}
				else {
					labelPrix.setText("Ce produit est déjà emprunté.");
				}
			}
		});
		
		
		
		
		
	
		
		
		
/*		
	       __         __                                 _          _____ _ _            _   
	     _/_/_       /_/                                | |        / ____| (_)          | |  
	    | ____|_   _____ _ __   ___ _ __ ___   ___ _ __ | |_ ___  | |    | |_  ___ _ __ | |_ 
	    |  _| \ \ / / _ \ '_ \ / _ \ '_ ` _ \ / _ \ '_ \| __/ __| | |    | | |/ _ \ '_ \| __|
	    | |___ \ V /  __/ | | |  __/ | | | | |  __/ | | | |_\__ \ | |____| | |  __/ | | | |_ 
	    |_____| \_/ \___|_| |_|\___|_| |_| |_|\___|_| |_|\__|___/  \_____|_|_|\___|_| |_|\__|*/
	                                                                                         
	                                                                                         
	                                                                                     
		
		btnclhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panelProduit.setVisible(false);
				panelClient.setVisible(false);
				frmVidéothèque.setBounds(100, 100, 650, 650);
			}
		});
		
		listClient.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				btnAjouterCommande.setEnabled(true);
				btnSupprimerClient.setEnabled(true);
			}
		});
		
		btnAjouterClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAjouterClient.setVisible(true);
			}
		});
		
		btnokClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Client cl = new Client(textFieldNom.getText(), textFieldPrenom.getText(), rdbtnFidele.isSelected());
				modelClient.addElement("ID: " + cl.getidentifiant_client() + "   Prénom: " + cl.getPrénom() + "   Nom: " + cl.getNom() + "   Fidèle: " + cl.isFidèle());
				Main.fidele.put(cl.getidentifiant_client(), cl.isFidèle());
				panelAjouterClient.setVisible(false);
				textFieldNom.setText("");
				textFieldPrenom.setText("");
				rdbtnFidele.setSelected(false);
				Main.listeclient.add(cl.getidentifiant_client());
			}
		});
		
		btnSupprimerClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.fidele.remove(Main.listeclient.get(listClient.getSelectedIndex()));
				Main.listeclient.remove(listClient.getSelectedIndex());
				modelClient.remove(listClient.getSelectedIndex());
				btnAjouterCommande.setEnabled(false);
				btnSupprimerClient.setEnabled(false);
			}
		});
		
		
		
		
		
		
		
		
		
		
/*		
	       __         __                                 _         _____               _       _ _    
	     _/_/_       /_/                                | |       |  __ \             | |     (_) |   
	    | ____|_   _____ _ __   ___ _ __ ___   ___ _ __ | |_ ___  | |__) | __ ___   __| |_   _ _| |_  
	    |  _| \ \ / / _ \ '_ \ / _ \ '_ ` _ \ / _ \ '_ \| __/ __| |  ___/ '__/ _ \ / _` | | | | | __| 
	    | |___ \ V /  __/ | | |  __/ | | | | |  __/ | | | |_\__ \ | |   | | | (_) | (_| | |_| | | |_  
	    |_____| \_/ \___|_| |_|\___|_| |_| |_|\___|_| |_|\__|___/ |_|   |_|  \___/ \__,_|\__,_|_|\__| */
		
	                                                                                                  
	                                                                                                  	
		listProduit.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				btnSupprimerProduit.setEnabled(true);
				btnValiderEmprunt.setEnabled(true);
			}
		});
		
		rdbtnProduitdispo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnProduitnondispo.setSelected(false);
			}
		});
		rdbtnProduitnondispo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnProduitdispo.setSelected(false);
			}
		});
		
		
		
		
		btnSupprimerProduit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.mapTypeproduit.get(Main.listeproduit.get(listProduit.getSelectedIndex())) == "Roman") {
					Main.rom--;
				}
				if(Main.mapTypeproduit.get(Main.listeproduit.get(listProduit.getSelectedIndex())) == "Manuel") {
					Main.manu--;
				}
				if(Main.mapTypeproduit.get(Main.listeproduit.get(listProduit.getSelectedIndex())) == "BD") {
					Main.bd--;
				}
				if(Main.mapTypeproduit.get(Main.listeproduit.get(listProduit.getSelectedIndex())) == "Dictionnaire") {
					Main.dico--;
				}
				if(Main.mapTypeproduit.get(Main.listeproduit.get(listProduit.getSelectedIndex())) == "CD") {
					Main.cd--;
				}
				if(Main.mapTypeproduit.get(Main.listeproduit.get(listProduit.getSelectedIndex())) == "DVD") {
					Main.dvd--;
				}
				Main.mapPrix.remove(Main.listeproduit.get(listProduit.getSelectedIndex()));
				Main.mapProduit.remove(Main.listeproduit.get(listProduit.getSelectedIndex()));
				Main.listeproduit.remove(listProduit.getSelectedIndex());
				modelProduit.remove(listProduit.getSelectedIndex());
				btnSupprimerProduit.setEnabled(false);
			}
				
		});
		
		btnAjouterProduit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxProduit.getSelectedItem() == "Roman") {
					panelAjouterProduit.setVisible(true);
					labelAuteur.setEnabled(true);
					textFieldAuteur.setEnabled(true);
					comboBoxProduit.setEnabled(false);
				}
				if (comboBoxProduit.getSelectedItem() == "Manuel") {
					panelAjouterProduit.setVisible(true);
					labelAuteur.setEnabled(true);
					textFieldAuteur.setEnabled(true);
					comboBoxProduit.setEnabled(false);
				}
				if (comboBoxProduit.getSelectedItem() == "BD") {
					panelAjouterProduit.setVisible(true);
					labelAuteur.setEnabled(true);
					textFieldAuteur.setEnabled(true);
					comboBoxProduit.setEnabled(false);
				}
				if (comboBoxProduit.getSelectedItem() == "Dictionnaire") {
					panelAjouterProduit.setVisible(true);
					labelLangue.setEnabled(true);
					textFieldLangue.setEnabled(true);
					comboBoxProduit.setEnabled(false);
				}
				if (comboBoxProduit.getSelectedItem() == "CD") {
					panelAjouterProduit.setVisible(true);
					labelAnnee.setEnabled(true);
					textFieldAnnee.setEnabled(true);
					comboBoxProduit.setEnabled(false);
				}
				if (comboBoxProduit.getSelectedItem() == "DVD") {
					panelAjouterProduit.setVisible(true);
					labelRealisateur.setEnabled(true);
					textFieldRealisateur.setEnabled(true);
					comboBoxProduit.setEnabled(false);
				}
				
			}
		});
		
		btnValiderDispo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelProduitdispo.clear();
				if (rdbtnProduitdispo.isSelected()) {
					int i = 0;
					while(i<Main.mapProduit.size()) {
						if (!(Main.listeemprunt1.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt2.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt3.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt4.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt5.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt6.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt7.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt8.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt9.contains(Main.listeproduit.get(i))) && !(Main.listeemprunt10.contains(Main.listeproduit.get(i)))) {
							modelProduitdispo.addElement(Main.mapProduit.get(Main.listeproduit.get(i)));
						}
						i++;
					}
				}
				
				if (rdbtnProduitnondispo.isSelected()) {
					int i = 0;
					while(i<Main.mapProduit.size()) {
						if (Main.listeemprunt1.contains(Main.listeproduit.get(i)) || Main.listeemprunt2.contains(Main.listeproduit.get(i)) || Main.listeemprunt3.contains(Main.listeproduit.get(i)) || Main.listeemprunt4.contains(Main.listeproduit.get(i)) || Main.listeemprunt5.contains(Main.listeproduit.get(i)) || Main.listeemprunt6.contains(Main.listeproduit.get(i)) || Main.listeemprunt7.contains(Main.listeproduit.get(i)) || Main.listeemprunt8.contains(Main.listeproduit.get(i)) || Main.listeemprunt9.contains(Main.listeproduit.get(i)) || Main.listeemprunt10.contains(Main.listeproduit.get(i))) {
							modelProduitdispo.addElement(Main.mapProduit.get(Main.listeproduit.get(i)));
						}
						i++;
					}
				}
			}
		});
		
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxTypeprod.getSelectedItem() == "Roman") {
					labelNombre.setText("Nombre de produit: " + Main.rom);
				}
				if (comboBoxTypeprod.getSelectedItem() == "Manuel") {
					labelNombre.setText("Nombre de produit: " + Main.manu);
				}
				if (comboBoxTypeprod.getSelectedItem() == "BD") {
					labelNombre.setText("Nombre de produit: " + Main.bd);
				}
				if (comboBoxTypeprod.getSelectedItem() == "Dictionnaire") {
					labelNombre.setText("Nombre de produit: " + Main.dico);
				}
				if (comboBoxTypeprod.getSelectedItem() == "CD") {
					labelNombre.setText("Nombre de produit: " + Main.cd);
				}
				if (comboBoxTypeprod.getSelectedItem() == "DVD") {
					labelNombre.setText("Nombre de produit: " + Main.dvd);
				}
			}
		});
		

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tarif = Double.parseDouble(textFieldTarif.getText());
				if (comboBoxProduit.getSelectedItem() == "Roman") {
					Roman rom = new Roman(textFieldTitre.getText(), textFieldAuteur.getText(), tarif);
					modelProduit.addElement("ID: " + rom.getIdentifiant_Produit() + " Titre: " + rom.getTitre() + " Auteur: " + rom.getAuteur() + " Tarif: " + tarif);
					labelAuteur.setEnabled(false);
					textFieldAuteur.setEnabled(false);
					textFieldAuteur.setText("");
					Main.listeproduit.add(rom.getIdentifiant_Produit());
					Main.mapPrix.put(rom.getIdentifiant_Produit(), tarif);
					Main.mapTypeproduit.put(rom.getIdentifiant_Produit(), "Roman");
					Main.rom++;
					Main.mapProduit.put(rom.getIdentifiant_Produit(), "ID: " + rom.getIdentifiant_Produit() + " Titre: " + rom.getTitre() + " Auteur: " + rom.getAuteur() + " Tarif: " + tarif);
				}
				if (comboBoxProduit.getSelectedItem() == "Manuel") {
					ManuelScolaire manu = new ManuelScolaire(textFieldTitre.getText(), textFieldAuteur.getText(), tarif);
					modelProduit.addElement("ID: " + manu.getIdentifiant_Produit() + " Titre: " + manu.getTitre() + " Auteur: " + manu.getAuteur() + " Tarif: " + tarif);
					labelAuteur.setEnabled(false);
					textFieldAuteur.setEnabled(false);
					textFieldAuteur.setText("");
					Main.listeproduit.add(manu.getIdentifiant_Produit());
					Main.mapPrix.put(manu.getIdentifiant_Produit(), tarif);
					Main.mapTypeproduit.put(manu.getIdentifiant_Produit(), "Manuel");
					Main.manu++;
					Main.mapProduit.put(manu.getIdentifiant_Produit(), "ID: " + manu.getIdentifiant_Produit() + " Titre: " + manu.getTitre() + " Auteur: " + manu.getAuteur() + " Tarif: " + tarif);
				}
				if (comboBoxProduit.getSelectedItem() == "BD") {
					BD bd = new BD(textFieldTitre.getText(), textFieldAuteur.getText(), tarif);
					modelProduit.addElement("ID: " + bd.getIdentifiant_Produit() + " Titre: " + bd.getTitre() + " Auteur: " + bd.getAuteur() + " Tarif: " + tarif);
					labelAuteur.setEnabled(false);
					textFieldAuteur.setEnabled(false);
					textFieldAuteur.setText("");
					Main.listeproduit.add(bd.getIdentifiant_Produit());
					Main.mapPrix.put(bd.getIdentifiant_Produit(), tarif);
					Main.mapTypeproduit.put(bd.getIdentifiant_Produit(), "BD");
					Main.bd++;
					Main.mapProduit.put(bd.getIdentifiant_Produit(), "ID: " + bd.getIdentifiant_Produit() + " Titre: " + bd.getTitre() + " Auteur: " + bd.getAuteur() + " Tarif: " + tarif);
				}
				if (comboBoxProduit.getSelectedItem() == "Dictionnaire") {
					Dictionnaire dico = new Dictionnaire(textFieldTitre.getText(), textFieldLangue.getText(), tarif);
					modelProduit.addElement("ID: " + dico.getIdentifiant_Produit() + " Titre: " + dico.getTitre() + " Langue: " + dico.getLangue() + " Tarif: " + tarif);
					labelLangue.setEnabled(false);
					textFieldLangue.setEnabled(false);
					textFieldLangue.setText("");
					Main.listeproduit.add(dico.getIdentifiant_Produit());
					Main.mapPrix.put(dico.getIdentifiant_Produit(), tarif);
					Main.mapTypeproduit.put(dico.getIdentifiant_Produit(), "Dictionnaire");
					Main.dico++;
					Main.mapProduit.put(dico.getIdentifiant_Produit(), "ID: " + dico.getIdentifiant_Produit() + " Titre: " + dico.getTitre() + " Langue: " + dico.getLangue() + " Tarif: " + tarif);
				}
				if (comboBoxProduit.getSelectedItem() == "CD") {
					int annee = Integer.parseInt(textFieldAnnee.getText());
					CD cd = new CD(textFieldTitre.getText(), annee, tarif);
					modelProduit.addElement("ID: " + cd.getIdentifiant_Produit() + " Titre: " + cd.getTitre() + " Année: " + cd.getAnneesortie() + " Tarif: " + tarif);
					labelAnnee.setEnabled(false);
					textFieldAnnee.setEnabled(false);
					textFieldAnnee.setText("");
					Main.listeproduit.add(cd.getIdentifiant_Produit());
					Main.mapPrix.put(cd.getIdentifiant_Produit(), tarif);
					Main.mapTypeproduit.put(cd.getIdentifiant_Produit(), "CD");
					Main.cd++;
					Main.mapProduit.put(cd.getIdentifiant_Produit(), "ID: " + cd.getIdentifiant_Produit() + " Titre: " + cd.getTitre() + " Année: " + cd.getAnneesortie() + " Tarif: " + tarif);
				}
				if (comboBoxProduit.getSelectedItem() == "DVD") {
					DVD dvd = new DVD(textFieldTitre.getText(), textFieldRealisateur.getText(), tarif);
					modelProduit.addElement("ID: " + dvd.getIdentifiant_Produit() + " Titre: " + dvd.getTitre() + " Réalisateur: " + dvd.getRéalisateur() + " Tarif: " + tarif);
					labelLangue.setEnabled(false);
					textFieldLangue.setEnabled(false);
					textFieldRealisateur.setText("");
					Main.listeproduit.add(dvd.getIdentifiant_Produit());
					Main.mapPrix.put(dvd.getIdentifiant_Produit(), tarif);
					Main.mapTypeproduit.put(dvd.getIdentifiant_Produit(), "DVD");
					Main.dvd++;
					Main.mapProduit.put(dvd.getIdentifiant_Produit(), "ID: " + dvd.getIdentifiant_Produit() + " Titre: " + dvd.getTitre() + " Réalisateur: " + dvd.getRéalisateur() + " Tarif: " + tarif);
				}
				panelAjouterProduit.setVisible(false);
				comboBoxProduit.setEnabled(true);
				textFieldTitre.setText("");
				textFieldTarif.setText("");
			}
		});
		
		
		
		btnPhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelProduit.setVisible(false);
				panelMenu.setVisible(true);
			}
		});
		
		
		
/*		
	       __         __                                 _          _____                                          _       
	     _/_/_       /_/                                | |        / ____|                                        | |      
	    | ____|_   _____ _ __   ___ _ __ ___   ___ _ __ | |_ ___  | |     ___  _ __ ___  _ __ ___   __ _ _ __   __| | ___  
	    |  _| \ \ / / _ \ '_ \ / _ \ '_ ` _ \ / _ \ '_ \| __/ __| | |    / _ \| '_ ` _ \| '_ ` _ \ / _` | '_ \ / _` |/ _ \ 
	    | |___ \ V /  __/ | | |  __/ | | | | |  __/ | | | |_\__ \ | |___| (_) | | | | | | | | | | | (_| | | | | (_| |  __/ 
	    |_____| \_/ \___|_| |_|\___|_| |_| |_|\___|_| |_|\__|___/  \_____\___/|_| |_| |_|_| |_| |_|\__,_|_| |_|\__,_|\___| */
	                                                                                                                       
	                                                                                                                       
		listCommande.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				btnAjouterEmprunt.setEnabled(true);
				btnAfficherCommande.setEnabled(true);
			}
		});
		
		btnAjouterCommande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = Main.listeclient.get(listClient.getSelectedIndex());
				String fidele = "";
				if (Main.fidele.get(index) == true) {
					fidele = " Réduction";
				}
				Commande com = new Commande(index);
				modelCommande.addElement("Client: " + com.getId_client() + " ID: " + com.getidentifiant_commande() + " Date: " + com.getDatecre() + fidele);
				Main.listecommande.add(com.getidentifiant_commande());
				Main.mapCommande.put(com.getidentifiant_commande(), com.getId_client());
			}
		});
	


			btnAfficherCommande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.listecommande.get(listCommande.getSelectedIndex()) == 1) {
					modelEmprunt.clear();
					int i = 0;
					while(i<Main.listecommande1.size()) {
						modelEmprunt.addElement(Main.listecommande1.get(i));
						i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom1.size()) {
				t += Main.listeprixcom1.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 1 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 2) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande2.size()) {
				modelEmprunt.addElement(Main.listecommande2.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom2.size()) {
				t += Main.listeprixcom2.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 2 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 3) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande3.size()) {
				modelEmprunt.addElement(Main.listecommande3.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom3.size()) {
				t += Main.listeprixcom3.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 3 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 4) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande4.size()) {
				modelEmprunt.addElement(Main.listecommande4.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom4.size()) {
				t += Main.listeprixcom4.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 4 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 5) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande5.size()) {
				modelEmprunt.addElement(Main.listecommande5.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom5.size()) {
				t += Main.listeprixcom5.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 5 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 6) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande6.size()) {
				modelEmprunt.addElement(Main.listecommande6.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom6.size()) {
				t += Main.listeprixcom6.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 6 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 7) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande7.size()) {
				modelEmprunt.addElement(Main.listecommande7.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom7.size()) {
				t += Main.listeprixcom7.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 7 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 8) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande8.size()) {
				modelEmprunt.addElement(Main.listecommande1.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom8.size()) {
				t += Main.listeprixcom8.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 8 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 9) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande9.size()) {
				modelEmprunt.addElement(Main.listecommande9.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom9.size()) {
				t += Main.listeprixcom9.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 9 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
		
		if(Main.listecommande.get(listCommande.getSelectedIndex()) == 10) {
			modelEmprunt.clear();
			int i = 0;
			while(i<Main.listecommande10.size()) {
				modelEmprunt.addElement(Main.listecommande10.get(i));
				i++;
			}
			int y = 0;
			double t = 0;
			while(y<Main.listeprixcom10.size()) {
				t += Main.listeprixcom10.get(y);
				y++;
			}
			if(Main.fidele.get(Main.mapCommande.get(Main.listecommande.get(listCommande.getSelectedIndex()))) == true) {
				t -= t*0.1;
			}
			labelPrix.setText("Le prix la commande 10 est de " + t + "€");
			listEmprunt.setEnabled(true);
		}
			
		}
});}
	}

