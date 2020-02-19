package com.ihm;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;


import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JPanel implements ActionListener {
	
	
	private JTextField name;
	private JTextField firstName;
	//private JComboBox<String>sex;
	private JTextField sex;
	private JTextField weight;
	private JTextField size;
	private JTextField pseudo;
	private JPasswordField passwordField;
	
	private JButton regis;
	private JButton back;
	
	private JCheckBox apnee;
	private JCheckBox natation;
	private JCheckBox golf;
	private JCheckBox devcouche;
	private JCheckBox jogging;
	
	/**
	 * Create the panel.
	 */
	public Registration() {
		setToolTipText("");
		setLayout(null);
		
		Font font = new Font("Tahoma", Font.BOLD, 50);
    	Font font2 = new Font("Serif", Font.BOLD, 40);
    	Font font3 = new Font("Serif", Font.PLAIN, 37);
    	
		
		JLabel lblNewLabel = new JLabel("Inscription");
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(850, 10, 312, 50);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informations Personnelles");
		lblNewLabel_1.setFont(font2);
		lblNewLabel_1.setBounds(60, 90, 453, 37);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Choix de Sport");
		lblNewLabel_2.setFont(font2);
		lblNewLabel_2.setBounds(1400, 90, 400, 37);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nom : ");
		lblNewLabel_3.setFont(font3);
		lblNewLabel_3.setBounds(60, 170, 200, 40);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Prenom : ");
		lblNewLabel_4.setFont(font3);
		lblNewLabel_4.setBounds(60, 230, 200, 40);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sexe : ");
		lblNewLabel_5.setFont(font3);
		lblNewLabel_5.setBounds(60, 290, 200, 40);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Taille (en cm) : ");
		lblNewLabel_6.setFont(font3);
		lblNewLabel_6.setBounds(60, 350, 238, 40);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Poids (en kg) : ");
		lblNewLabel_7.setFont(font3);
		lblNewLabel_7.setBounds(60, 410, 220, 40);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Pseudo : ");
		lblNewLabel_8.setFont(font3);
		lblNewLabel_8.setBounds(60, 470, 200, 40);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Mot de passe : ");
		lblNewLabel_9.setFont(font3);
		lblNewLabel_9.setBounds(60, 530, 220, 40);
		add(lblNewLabel_9);
		
		regis = new JButton("REJOIGNEZ-NOUS");
		regis.addActionListener(this);
		regis.setBounds(800, 660, 300, 80);
		add(regis);
		
		back = new JButton("RETOUR");
		back.setBounds(875, 760, 150, 50);
		add(back);
		
		name = new JTextField();
		name.setFont(font3);
		name.setToolTipText("NOM");
		name.setBounds(313, 170, 200, 40);
		add(name);
		name.setColumns(10);
		
		firstName = new JTextField();
		firstName.setFont(font3);
		firstName.setBounds(313, 230, 200, 40);
		add(firstName);
		firstName.setColumns(10);
		
		weight = new JTextField();
		weight.setFont(font3);
		weight.setBounds(313, 478, 200, 40);
		add(weight);
		weight.setColumns(10);
		
		size = new JTextField();
		size.setFont(font3);
		size.setBounds(313, 350, 200, 40);
		add(size);
		size.setColumns(10);
		
		pseudo = new JTextField();
		pseudo.setFont(font3);
		pseudo.setBounds(313, 418, 200, 40);
		add(pseudo);
		pseudo.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(font3);
		passwordField.setBounds(313, 530, 200, 40);
		add(passwordField);
		
		sex = new JTextField();
		//sex.addItem("Homme");
		//sex.addItem("Femme");
		sex.setFont(font3);
		sex.setBounds(313, 290, 200, 40);
		add(sex);
		
		apnee = new JCheckBox("Apnéé");
		apnee.setFont(font3);
		apnee.setBounds(1400, 170, 200, 40);
		add(apnee);
		
		jogging = new JCheckBox("Jogging");
		jogging.setFont(font3);
		jogging.setBounds(1400, 230, 200, 50);
		add(jogging);
		
		natation = new JCheckBox("Natation");
		natation.setFont(font3);
		natation.setBounds(1400, 290, 200, 40);
		add(natation);
		
		
		golf = new JCheckBox("Golf");
		golf.setFont(font3);
		golf.setBounds(1400, 410, 200, 40);
		add(golf);
		
		devcouche = new JCheckBox("Développé couché");
		devcouche.setFont(font3);
		devcouche.setBounds(1400, 350, 312, 40);
		add(devcouche);

	}



	public void setName(JTextField name) {
		this.name = name;
	}

	public JTextField getFirstName() {
		return firstName;
	}

	public void setFirstName(JTextField firstName) {
		this.firstName = firstName;
	}

	public JTextField getWeight() {
		return weight;
	}

	public void setWeight(JTextField weight) {
		this.weight = weight;
	}

	

	public void setSize(JTextField size) {
		this.size = size;
	}

	public JTextField getPseudo() {
		return pseudo;
	}

	public void setPseudo(JTextField pseudo) {
		this.pseudo = pseudo;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JButton getRegis() {
		return regis;
	}

	public void setRegis(JButton regis) {
		this.regis = regis;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	public JCheckBox getApnee() {
		return apnee;
	}

	public void setApnee(JCheckBox apnee) {
		this.apnee = apnee;
	}

	public JCheckBox getNatation() {
		return natation;
	}

	public void setNatation(JCheckBox natation) {
		this.natation = natation;
	}

	public JCheckBox getGolf() {
		return golf;
	}

	public void setGolf(JCheckBox golf) {
		this.golf = golf;
	}

	public JCheckBox getDevcouche() {
		return devcouche;
	}

	public void setDevcouche(JCheckBox devcouche) {
		this.devcouche = devcouche;
	}

	public JCheckBox getJogging() {
		return jogging;
	}

	public void setJogging(JCheckBox jogging) {
		this.jogging = jogging;
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	
		
	
	
	
}
