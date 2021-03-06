package ihm;

import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Apnee extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton backButton;
	private JButton progresButton;
	private JButton profilButton;
	private JLabel title;
	static ArrayList<Float> data, data2;

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
	public Apnee() {
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
		
		title = new JLabel("Apnée");
		title.setFont(font);
		title.setBounds(550, 10, 190, 69);
		add(title);
		
		/* Remplacer par la BDD */
		data = new ArrayList<Float>();
		data.add((float) 2);
		data.add((float) 8.1);
		data.add((float) 4.4);
		data.add((float) 2);
		data.add((float) 4);
		data.add((float) 6);
		data.add((float) 1);
		data.add((float) 2.4);
		data.add((float) 9);
		data.add((float) 4);
		data.add((float) 1.7);
		data.add((float) 3.4);
		data.add((float) 5);
		data.add((float) 4);
		data.add((float) 8);
		
		data2 = new ArrayList<Float>();
		data2.add((float) 5);
		data2.add((float) 1);
		data2.add((float) 3.7);
		/***************************/
		
		Courbe courbe = new Courbe("Courbe apnée", "Profondeur", "Temps");
		ChartPanel courbePanel = courbe.getChartPanel();
		courbePanel.setBounds(725, 150, 450, 450);
		add(courbePanel);
	}
}

