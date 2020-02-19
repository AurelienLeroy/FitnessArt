package com.ihm;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;

public class Activity extends JPanel {
	
	private Image apnee;
	private Image natation;
	private Image jogging;
	private Image devcouche;
	private Image golf;
	private Image tir;
	
	private JButton btnProfil;
	private JButton btnBack;
	
	private JLabel labActivity;
	
	private JButton btnApnee;
	private JButton btnNatation;
	private JButton btnJogging;
	private JButton btnDevcouche;
	private JButton btnGolf;

	/**
	 * Create the panel.
	 */
	public Activity() {
		setLayout(null);
		
		Font font = new Font("Tahoma", Font.BOLD, 50);
		
	//************************************************************//	
		btnProfil = new JButton("Profil");
		btnProfil.setBounds(875, 760, 150, 50);
		add(btnProfil);
		
		btnBack = new JButton("Retour");
		btnBack.setBounds(875, 820, 150, 50);
		add(btnBack);
		
		labActivity = new JLabel("Activités");
		labActivity.setFont(font);
		labActivity.setBounds(850, 10, 312, 50);
		add(labActivity);
	//*******************************************************************//	
		
		btnApnee = new JButton("Apnée");
		btnApnee.setBounds(230, 180, 150, 50);
		add(btnApnee);
		
		btnDevcouche = new JButton("Muscu");
		btnDevcouche.setBounds(860, 180, 150, 50);
		add(btnDevcouche);
		
		btnJogging = new JButton("Jogging");
		btnJogging.setBounds(1496, 180, 150, 50);
		add(btnJogging);
		
		btnNatation = new JButton("Natation");
		btnNatation.setBounds(230, 530, 150, 50);
		add(btnNatation);
		
		btnGolf = new JButton("Natation");
		btnGolf.setBounds(1496, 530, 150, 50);
		add(btnGolf);

	}
	
	
	
	public Image getApnee() {
		return apnee;
	}



	public void setApnee(Image apnee) {
		this.apnee = apnee;
	}



	public Image getNatation() {
		return natation;
	}



	public void setNatation(Image natation) {
		this.natation = natation;
	}



	public Image getJogging() {
		return jogging;
	}



	public void setJogging(Image jogging) {
		this.jogging = jogging;
	}



	public Image getDevcouche() {
		return devcouche;
	}



	public void setDevcouche(Image devcouche) {
		this.devcouche = devcouche;
	}



	public Image getGolf() {
		return golf;
	}



	public void setGolf(Image golf) {
		this.golf = golf;
	}



	public Image getTir() {
		return tir;
	}



	public void setTir(Image tir) {
		this.tir = tir;
	}



	public JButton getBtnProfil() {
		return btnProfil;
	}



	public void setBtnProfil(JButton btnProfil) {
		this.btnProfil = btnProfil;
	}



	public JButton getBtnBack() {
		return btnBack;
	}



	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}



	public JLabel getLabActivity() {
		return labActivity;
	}



	public void setLabActivity(JLabel labActivity) {
		this.labActivity = labActivity;
	}



	public JButton getBtnApnee() {
		return btnApnee;
	}



	public void setBtnApnee(JButton btnApnee) {
		this.btnApnee = btnApnee;
	}



	public JButton getBtnNatation() {
		return btnNatation;
	}



	public void setBtnNatation(JButton btnNatation) {
		this.btnNatation = btnNatation;
	}



	public JButton getBtnJogging() {
		return btnJogging;
	}



	public void setBtnJogging(JButton btnJogging) {
		this.btnJogging = btnJogging;
	}



	public JButton getBtnDevcouche() {
		return btnDevcouche;
	}



	public void setBtnDevcouche(JButton btnDevcouche) {
		this.btnDevcouche = btnDevcouche;
	}



	public JButton getBtnGolf() {
		return btnGolf;
	}



	public void setBtnGolf(JButton btnGolf) {
		this.btnGolf = btnGolf;
	}



	public void paintComponent(Graphics g) {
		try {
			this.apnee = ImageIO.read(new File("pictures/apne.jpg"));
			this.natation = ImageIO.read(new File("pictures/devcoucher.jpg"));
			this.jogging = ImageIO.read(new File("pictures/joggin.jpg"));
			this.devcouche = ImageIO.read(new File("pictures/natation.jpg"));
			this.golf = ImageIO.read(new File("pictures/golf.jpg"));
			this.tir = ImageIO.read(new File("pictures/tir.jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.paintComponent(g);
		g.drawImage(apnee, 0, 60, 633,350, this);
		g.drawImage(natation, 633, 60, 633,350, this);
		g.drawImage(jogging, 1266, 60, 633,350, this);
		g.drawImage(devcouche, 0, 350, 633,350, this);
		g.drawImage(tir, 633, 350, 633,350, this);
		g.drawImage(golf, 1266, 350, 633,350, this);
	}
}
