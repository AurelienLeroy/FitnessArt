package ihm;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;

public class Muscu extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton backButton;
	private JButton progresButton;
	private JButton profilButton;
	private JLabel title;
	static float data, data2, data3;
	/**
	 * Create the panel.
	 */
	public Muscu() {
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
		
		title = new JLabel("Musculation");
		title.setFont(font);
		title.setBounds(550, 10, 500, 69);
		add(title);
		
		/* Remplacer par BDD */
		data = (float) 24.8;
		data2 = (float) 36.2;
		//data3 = (float) 12.4;
		/*********************/
		
		Disque disque = new Disque("Muscu");
		ChartPanel disquePanel = disque.getChartPanel();
		disquePanel.setBounds(725, 150, 450, 450);
		add(disquePanel);
	}
	
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

}
