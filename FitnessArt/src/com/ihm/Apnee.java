package com.ihm;

import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Apnee extends JPanel {
	
	private JButton changerButton;
	private JButton progresButton;
	private JButton profilButton;
	private JButton startButton;
	private JButton clearButton;
	private JLabel title;

	/**
	 * Create the panel.
	 */
	public Apnee() {
		setLayout(null);
		
		Font font = new Font("Tahoma", Font.BOLD, 50);
		
		changerButton = new JButton("Changer");
		changerButton.setBounds(600, 800, 150, 60);
		add(changerButton);
		
		progresButton = new JButton("Progres");
		progresButton.setBounds(850, 800, 150, 60);
		add(progresButton);
		
		profilButton = new JButton("Profil");
		profilButton.setBounds(1100, 800, 150, 60);
		add(profilButton);
		
		title = new JLabel("Apn�e");
		title.setFont(font);
		title.setBounds(850, 10, 190, 69);
		add(title);
		
		startButton = new JButton("Start");
		startButton.setBounds(775, 500, 150, 60);
		add(startButton);
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(975, 500, 150, 60);
		add(clearButton);

	}
}

