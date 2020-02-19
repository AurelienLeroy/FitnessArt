package com.ihm;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainPage extends JPanel {
	
	private JButton connectButton;
	private JButton regisButton;

	/**
	 * Create the panel.
	 */
	public MainPage() {
		setLayout(null);
		
		connectButton = new JButton("Se connecter");
		connectButton.setBounds(775, 420, 150, 80);
		add(connectButton);
		
		regisButton = new JButton("S'inscrire");
		regisButton.setBounds(975, 420, 150, 80);
		add(regisButton);
		

	}

	public JButton getConnectButton() {
		return connectButton;
	}

	public void setConnectButton(JButton connectButton) {
		this.connectButton = connectButton;
	}

	public JButton getRegisButton() {
		return regisButton;
	}

	public void setRegisButton(JButton regisButton) {
		this.regisButton = regisButton;
	}
	
	
}

