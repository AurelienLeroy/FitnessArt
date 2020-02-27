package ihm;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

public class Progres extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton backButton;
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
		
		backButton = new JButton("Retour");
		backButton.setBounds(600, 800, 150, 60);
		add(backButton);
		
		activityButton = new JButton("Activité");
		activityButton.setBounds(850, 800, 150, 60);
		add(activityButton);
		
		profilButton = new JButton("Profil");
		profilButton.setBounds(1100, 800, 150, 60);
		add(profilButton);
		
		activities = new JLabel("Activités récentes");
		activities.setFont(font2);
		activities.setBounds(60, 90, 453, 37);
		add(activities);
		
		stat = new JLabel("Statistiques");
		stat.setFont(font2);
		stat.setBounds(1400, 90, 400, 37);
		add(stat);

	}

	public JButton getBackButton() {
		return backButton;
	}

	public void setBackButton(JButton backButton) {
		this.backButton = backButton;
	}

	public JButton getActivityButton() {
		return activityButton;
	}

	public void setActivityButton(JButton activityButton) {
		this.activityButton = activityButton;
	}

	public JButton getProfilButton() {
		return profilButton;
	}

	public void setProfilButton(JButton profilButton) {
		this.profilButton = profilButton;
	}

}

