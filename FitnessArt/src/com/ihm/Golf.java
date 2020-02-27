package ihm;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Golf extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton backButton;
	private JButton progresButton;
	private JButton profilButton;
	private JLabel title;

	public JButton getBackButton() {
		return backButton;
	}

	public void setBackButton(JButton backButton) {
		this.backButton = backButton;
	}

	public JButton getProgresButton() {
		return progresButton;
	}

	public void setProgresButton(JButton progresButton) {
		this.progresButton = progresButton;
	}

	public JButton getProfilButton() {
		return profilButton;
	}

	public void setProfilButton(JButton profilButton) {
		this.profilButton = profilButton;
	}

	/**
	 * Create the panel.
	 */
	public Golf() {
		setLayout(null);
		
		Font font = new Font("Tahoma", Font.BOLD, 50);
		
		backButton = new JButton("Retour");
		backButton.setBounds(300, 650, 150, 60);
		add(backButton);
		
		progresButton = new JButton("Progres");
		progresButton.setBounds(550, 650, 150, 60);
		add(progresButton);
		
		profilButton = new JButton("Profil");
		profilButton.setBounds(800, 650, 150, 60);
		add(profilButton);
		
		title = new JLabel("Golf");
		title.setFont(font);
		title.setBounds(550, 10, 400, 69);
		add(title);

	}
}
