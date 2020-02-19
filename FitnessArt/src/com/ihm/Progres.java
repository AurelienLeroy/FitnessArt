package com.ihm;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

public class Progres extends JPanel {
	
	private JButton changeButton;
	private JButton activityButton;
	private JButton profilButton;
	
	private JLabel title;
	private JLabel activities;
	private JLabel stat;

	/**
	 * Create the panel.
	 */
	public Progres() {
		setLayout(null);
		
		Font font = new Font("Tahoma", Font.BOLD, 50);
    	Font font2 = new Font("Serif", Font.BOLD, 40);
		
    	title = new JLabel("Mes Progres");
    	title.setFont(font);
    	title.setBounds(850, 10, 312, 50);
		add(title);
		
		changeButton = new JButton("Changer");
		changeButton.setBounds(600, 800, 150, 60);
		add(changeButton);
		
		activityButton = new JButton("Activit�");
		activityButton.setBounds(850, 800, 150, 60);
		add(activityButton);
		
		profilButton = new JButton("Profil");
		profilButton.setBounds(1100, 800, 150, 60);
		add(profilButton);
		
		activities = new JLabel("Activit�s r�centes");
		activities.setFont(font2);
		activities.setBounds(60, 90, 453, 37);
		add(activities);
		
		stat = new JLabel("Statistiques");
		stat.setFont(font2);
		stat.setBounds(1400, 90, 400, 37);
		add(stat);

	}

}

